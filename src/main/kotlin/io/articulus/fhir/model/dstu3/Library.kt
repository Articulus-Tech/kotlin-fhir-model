//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.437 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Represents a library of quality improvement components
 *
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
 */
open class Library() : DomainResource() {
    /**
     * When the library was approved by publisher
     */
    var approvalDate: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val content: List<Attachment> = mutableListOf<Attachment>()

    val contributor: List<Contributor> = mutableListOf<Contributor>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    val dataRequirement: List<DataRequirement> = mutableListOf<DataRequirement>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the library
     */
    var description: String? = null

    /**
     * When the library is expected to be used
     */
    var effectivePeriod: Period? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * When the library was last reviewed
     */
    var lastReviewDate: String? = null

    /**
     * Name for this library (computer friendly)
     */
    var name: String? = null

    val parameter: List<ParameterDefinition> = mutableListOf<ParameterDefinition>()

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this library is defined
     */
    var purpose: String? = null

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this library (human friendly)
     */
    var title: String? = null

    val topic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * logic-library | model-definition | asset-collection | module-definition
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Logical URI to reference this library (globally unique)
     */
    var url: String? = null

    /**
     * Describes the clinical usage of the library
     */
    var usage: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the library
     */
    var version: String? = null
}
