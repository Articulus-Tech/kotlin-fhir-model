//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.336 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A description of decision support service functionality
 *
 * The ServiceDefinition describes a unit of decision support functionality that is made available as a service, such as immunization modules or drug-drug interaction checking.
 */
open class ServiceDefinition() : DomainResource() {
    /**
     * When the service definition was approved by publisher
     */
    var approvalDate: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

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
     * Natural language description of the service definition
     */
    var description: String? = null

    /**
     * When the service definition is expected to be used
     */
    var effectivePeriod: Period? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * When the service definition was last reviewed
     */
    var lastReviewDate: String? = null

    /**
     * Name for this service definition (computer friendly)
     */
    var name: String? = null

    /**
     * Operation to invoke
     */
    var operationDefinition: Reference? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this service definition is defined
     */
    var purpose: String? = null

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this service definition (human friendly)
     */
    var title: String? = null

    val topic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val trigger: List<TriggerDefinition> = mutableListOf<TriggerDefinition>()

    /**
     * Logical URI to reference this service definition (globally unique)
     */
    var url: String? = null

    /**
     * Describes the clinical usage of the module
     */
    var usage: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the service definition
     */
    var version: String? = null
}
