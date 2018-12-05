//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.327 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * An person that is related to a patient, but who is not a direct target of care
 *
 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
 */
open class RelatedPerson() : DomainResource() {
    /**
     * Whether this related person's record is in active use
     */
    var active: Boolean? = null

    val address: List<Address> = mutableListOf<Address>()

    /**
     * The date on which the related person was born
     */
    var birthDate: String? = null

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val name: List<HumanName> = mutableListOf<HumanName>()

    /**
     * The patient this person is related to
     */
    var patient: Reference = Reference()

    /**
     * Period of time that this relationship is considered valid
     */
    var period: Period? = null

    val photo: List<Attachment> = mutableListOf<Attachment>()

    /**
     * The nature of the relationship
     */
    var relationship: CodeableConcept? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}
