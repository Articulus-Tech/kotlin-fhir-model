package io.articulus.fhir.base

import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type
import java.util.*


fun gsonFhirGeneratorBuilder(): GsonBuilder {

    return GsonBuilder()
//            .addDeserializationExclusionStrategy(FhirPrimitiveExclusionStrategy())
            .registerTypeAdapter(List::class.java, RemoveNullListSerializer())
            .registerTypeHierarchyAdapter(Collection::class.java, CollectionAdapter())


}


class ClassDeserializerAdapter<T> internal constructor(private val typeName: String) : JsonDeserializer<T> {
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
        val classType = Class.forName("io.articulus.fhir.model.$method") as Class<out T>
        return gson.fromJson(json, classType)
    }
}

internal class CollectionAdapter : JsonSerializer<Collection<*>> {

    override fun serialize(src: Collection<*>?, typeOfSrc: Type, context: JsonSerializationContext): JsonElement? {
        if (src == null || src.isEmpty())
        // exclusion is made here
            return null

        val array = JsonArray()

        for (child in src) {
            val element = context.serialize(child)
            array.add(element)
        }

        if (array.count() == 0) {
            return null
        }
        return array
    }
}

class RemoveNullListSerializer : JsonSerializer<List<*>> {
    override fun serialize(src: List<*>?, typeOfSrc: Type, context: JsonSerializationContext?): JsonElement? {

        val lst = src?.toMutableList() ?: mutableListOf()

        // remove all null values
        lst.removeAll(Collections.singleton(null))

        // create json Result
        val result = JsonArray()
        for (item in lst) {
            result.add(context!!.serialize(item))
        }

        if (result.count() == 0) {
            return null
        }

        return result
    }

}

//class EmptyCheckTypeAdapterFactory : TypeAdapterFactory {
//
//    fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
//        // We filter out the EmptyCheckTypeAdapter as we need to check this for emptiness!
//        if (InnerObject::class.java!!.isAssignableFrom(type.getRawType())) {
//            val delegate = gson.getDelegateAdapter<T>(this, type)
//            val elementAdapter = gson.getAdapter(JsonElement::class.java)
//            return EmptyCheckTypeAdapter(delegate, elementAdapter).nullSafe()
//        }
//        return null
//    }
//
//    class EmptyCheckTypeAdapter<T>(private val delegate: TypeAdapter<T>,
//                                   private val elementAdapter: TypeAdapter<JsonElement>) : TypeAdapter<T>() {
//
//        @Throws(IOException::class)
//        override fun write(out: JsonWriter, value: T) {
//            this.delegate.write(out, value)
//        }
//
//        @Throws(IOException::class)
//        override fun read(`in`: JsonReader): T? {
//            val asJsonObject = elementAdapter.read(`in`).asJsonObject
//            return if (asJsonObject.entrySet().isEmpty()) null else this.delegate.fromJsonTree(asJsonObject)
//        }
//    }
//
//}

class FhirPrimitiveExclusionStrategy() : ExclusionStrategy {

    override fun shouldSkipField(f: FieldAttributes): Boolean {
        return false //  !f.name.startsWith("_")

    }

    override fun shouldSkipClass(clazz: Class<*>): Boolean {
        return true
    }

}