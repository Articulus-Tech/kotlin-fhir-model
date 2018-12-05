//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.470 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
 *
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 */
open class AllergyIntolerance() : DomainResource() {
    /**
     * Date record was believed accurate
     */
    var assertedDate: String? = null

    /**
     * Source of the information about the allergy
     */
    var asserter: Reference? = null

    val category: List<String> = mutableListOf<String>()

    /**
     * active | inactive | resolved
     */
    var clinicalStatus: String? = null

    /**
     * Code that identifies the allergy or intolerance
     */
    var code: CodeableConcept? = null

    /**
     * low | high | unable-to-assess
     */
    var criticality: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Date(/time) of last known occurrence of a reaction
     */
    var lastOccurrence: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When allergy or intolerance was identified
     */
    var onsetAge: Age? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetDateTime: String? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetPeriod: Period? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetRange: Range? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetString: String? = null

    /**
     * Who the sensitivity is for
     */
    var patient: Reference = Reference()

    val reaction: List<AllergyIntoleranceReaction> = mutableListOf<AllergyIntoleranceReaction>()

    /**
     * Who recorded the sensitivity
     */
    var recorder: Reference? = null

    /**
     * allergy | intolerance - Underlying mechanism (if known)
     */
    var type: String? = null

    /**
     * unconfirmed | confirmed | refuted | entered-in-error
     */
    var verificationStatus: String? = null
}

/**
 * Adverse Reaction Events linked to exposure to substance
 *
 * Details about each adverse reaction event linked to exposure to the identified substance.
 */
open class AllergyIntoleranceReaction() : BackboneElement() {
    /**
     * Description of the event as a whole
     */
    var description: String? = null

    /**
     * How the subject was exposed to the substance
     */
    var exposureRoute: CodeableConcept? = null

    val manifestation: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Date(/time) when manifestations showed
     */
    var onset: String? = null

    /**
     * mild | moderate | severe (of event as a whole)
     */
    var severity: String? = null

    /**
     * Specific substance or pharmaceutical product considered to be responsible for event
     */
    var substance: CodeableConcept? = null
}
