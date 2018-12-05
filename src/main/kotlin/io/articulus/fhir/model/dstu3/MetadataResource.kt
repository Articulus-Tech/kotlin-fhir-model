//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.516 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Common Ancestor declaration for definitional resources
 *
 * Common Ancestor declaration for conformance and knowledge artifact resources.
 */
open class MetadataResource() : DomainResource() {
    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the metadata resource
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name for this metadata resource (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this metadata resource (human friendly)
     */
    var title: String? = null

    /**
     * Logical URI to reference this metadata resource (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the metadata resource
     */
    var version: String? = null
}
