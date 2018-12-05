//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.304 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A person with a  formal responsibility in the provisioning of healthcare or related services
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 */
open class Practitioner() : DomainResource() {
    /**
     * Whether this practitioner's record is in active use
     */
    var active: Boolean? = null

    val address: List<Address> = mutableListOf<Address>()

    /**
     * The date  on which the practitioner was born
     */
    var birthDate: String? = null

    val communication: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val name: List<HumanName> = mutableListOf<HumanName>()

    val photo: List<Attachment> = mutableListOf<Attachment>()

    val qualification: List<PractitionerQualification> = mutableListOf<PractitionerQualification>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}

/**
 * Qualifications obtained by training and certification
 *
 * Qualifications obtained by training and certification.
 */
open class PractitionerQualification() : BackboneElement() {
    /**
     * Coded representation of the qualification
     */
    var code: CodeableConcept = CodeableConcept()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Organization that regulates and issues the qualification
     */
    var issuer: Reference? = null

    /**
     * Period during which the qualification is valid
     */
    var period: Period? = null
}
