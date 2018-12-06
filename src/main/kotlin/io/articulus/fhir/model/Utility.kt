package io.articulus.fhir.model

import com.google.gson.GsonBuilder
import io.articulus.fhir.model.dstu3.Resource
import io.google.gson.typeadapters.RuntimeTypeAdapterFactory

fun gsonFhirBuilder(): GsonBuilder {
    val runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
        .of(Resource::class.java, "resourceType", true);
    return io.articulus.fhir.base.gsonFhirGeneratorBuilder()
        .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
}
