//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.656 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A generic person record
 *
 * Demographics and administrative information about a person independent of a specific health-related context.
 */
open class Person() : DomainResource() {
    /**
     * This person's record is in active use
     */
    var active: Boolean? = null

    val address: List<Address> = mutableListOf<Address>()

    /**
     * The date on which the person was born
     */
    var birthDate: String? = null

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val link: List<PersonLink> = mutableListOf<PersonLink>()

    /**
     * The organization that is the custodian of the person record
     */
    var managingOrganization: Reference? = null

    val name: List<HumanName> = mutableListOf<HumanName>()

    /**
     * Image of the person
     */
    var photo: Attachment? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}

/**
 * Link to a resource that concerns the same actual person
 *
 * Link to a resource that concerns the same actual person.
 */
open class PersonLink() : BackboneElement() {
    /**
     * level1 | level2 | level3 | level4
     */
    var assurance: String? = null

    /**
     * The resource to which this actual person is associated
     */
    var target: Reference = Reference()
}
