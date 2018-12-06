package io.articulus.fhir.model.dstu3

import com.google.gson.Gson
import io.articulus.fhir.model.gsonFhirBuilder
import java.io.File

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


