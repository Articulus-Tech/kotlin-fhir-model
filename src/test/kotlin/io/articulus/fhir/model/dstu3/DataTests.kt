package io.articulus.fhir.model.dstu3

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.google.gson.typeadapters.RuntimeTypeAdapterFactory
import java.io.File
import kotlin.Boolean
import kotlin.String

open class DataTests {
    val mapper: Gson

    init {
        mapper = gsonFhirBuilder().create()
    }

    fun stringMatch(str: String, actual: String?): Boolean = if (actual.isNullOrBlank()) true else actual.startsWith(str) 
}

fun File.readTextAndClose(): String {
    reader().use { reader ->
       return reader.readText()
       }
}

fun gsonFhirBuilder(): GsonBuilder {
    val runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
        .of(Resource::class.java, "resourceType", true);
    return io.articulus.fhir.base.gsonFhirGeneratorBuilder()
        .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
}
