//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.498 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Resource data element
 *
 * The formal description of a single piece of information that can be gathered and reported.
 */
open class DataElement() : DomainResource() {
    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    val element: List<ElementDefinition> = mutableListOf<ElementDefinition>()

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val mapping: List<DataElementMapping> = mutableListOf<DataElementMapping>()

    /**
     * Name for this data element (computer friendly)
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
     * comparable | fully-specified | equivalent | convertable | scaleable | flexible
     */
    var stringency: String? = null

    /**
     * Name for this data element (human friendly)
     */
    var title: String? = null

    /**
     * Logical URI to reference this data element (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the data element
     */
    var version: String? = null
}

/**
 * External specification mapped to
 *
 * Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.
 */
open class DataElementMapping() : BackboneElement() {
    /**
     * Versions, issues, scope limitations, etc.
     */
    var comment: String? = null

    /**
     * Internal id when this mapping is used
     */
    var identity: String? = null

    /**
     * Names what this mapping refers to
     */
    var name: String? = null

    /**
     * Identifies what this mapping refers to
     */
    var uri: String? = null
}
