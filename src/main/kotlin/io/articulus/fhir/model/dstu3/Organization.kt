//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.500 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A grouping of people or organizations with a common purpose
 *
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
 */
open class Organization() : DomainResource() {
    /**
     * Whether the organization's record is still in active use
     */
    var active: Boolean? = null

    val address: List<Address> = mutableListOf<Address>()

    val alias: List<String> = mutableListOf<String>()

    val contact: List<OrganizationContact> = mutableListOf<OrganizationContact>()

    val endpoint: List<Reference> = mutableListOf<Reference>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Name used for the organization
     */
    var name: String? = null

    /**
     * The organization of which this organization forms a part
     */
    var partOf: Reference? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Contact for the organization for a certain purpose
 *
 * Contact for the organization for a certain purpose.
 */
open class OrganizationContact() : BackboneElement() {
    /**
     * Visiting or postal addresses for the contact
     */
    var address: Address? = null

    /**
     * A name associated with the contact
     */
    var name: HumanName? = null

    /**
     * The type of contact
     */
    var purpose: CodeableConcept? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}
