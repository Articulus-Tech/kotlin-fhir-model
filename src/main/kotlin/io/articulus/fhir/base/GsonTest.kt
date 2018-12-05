package io.articulus.fhir.base

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import java.lang.reflect.Type


open class BaseClass {
    var myType: String? = null
    var myList = mutableListOf<BaseClass>()
    var dep: BaseClass? = null
}

open class ClassA : BaseClass() {
    val astuff: String? = null
}

open class ClassB : BaseClass() {
    val bstuff: String? = null
}

open class Resources {
    val myList = mutableListOf<BaseClass>()
}


val json1 = """
{
  "myList": [
    {
      "myType": "ClassA",
      "astuff": "a stuff"
    },
    {
      "myType" : "ClassB",
      "bstuff" : "things b needs"
    }
  ]
}
""".trimIndent()

val json2 = """
          {
            "myType" : "ClassA",
            "astuff" : "a stuff",
            "myList" : [
              {
                "myType" : "ClassB",
                "bstuff" : "things b needs"
              }
            ]
          }
""".trimIndent()

val json3 = """
          {
            "myType" : "ClassA",
            "astuff" : "a stuff",
            "dep" :               {
                "myType" : "ClassB",
                "bstuff" : "things b needs"
              },
            "myList" : [
              {
                "myType" : "ClassB",
                "bstuff" : "things b needs"
              }
            ]
          }
""".trimIndent()


fun main(args: Array<String>) {

    val gson = getGson()

    val test1 = gson.fromJson(json1, Resources::class.java)
    if (test1.myList[0] !is ClassA) {
        println("Test1 Error: first array entry should be ClassA but is ${test1.myList[0]::class.java}")
    }

    if (test1.myList[1] !is ClassB) {
        println("Test1 Error: first array entry should be ClassB but is ${test1.myList[1]::class.java}")
    }

    val test2 = gson.fromJson(json2, BaseClass::class.java)
    if (!(test2.myList[0] is ClassA)) {
        println("Test2 Error: first array entry should be ClassA but is ${test2.myList[0]::class.java}")
    }

    val test3 = gson.fromJson(json3, BaseClass::class.java)
    if (test3.myList[0] !is ClassB) {
        println("test3 error")
    }

}

fun getGson(): Gson {
    return GsonBuilder()
            .registerTypeAdapter(BaseClass::class.java, ClassDeserializerAdapter1<BaseClass>("myType"))
            .create()
}

class ClassDeserializerAdapter1<T> internal constructor(private val typeName: String) : JsonDeserializer<T> {
    private val gson: Gson

    init {
        gson = GsonBuilder()
                .create()
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): T {
        val jsonObject = json.asJsonObject
        val typeElement = jsonObject.get(typeName)
        val method = typeElement.asString
        @Suppress("UNCHECKED_CAST")
        val classType = Class.forName("io.articulus.fhir.base.$method") as Class<out T>
        return gson.fromJson(json, classType)
    }
}