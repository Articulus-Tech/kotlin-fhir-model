//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.554 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Group of multiple entities
 *
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 */
open class Group() : DomainResource() {
    /**
     * Whether this group's record is in active use
     */
    var active: Boolean? = null

    /**
     * Descriptive or actual
     */
    var actual: Boolean? = null

    val characteristic: List<GroupCharacteristic> = mutableListOf<GroupCharacteristic>()

    /**
     * Kind of Group members
     */
    var code: CodeableConcept? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val member: List<GroupMember> = mutableListOf<GroupMember>()

    /**
     * Label for Group
     */
    var name: String? = null

    /**
     * Number of members
     */
    var quantity: Int? = null

    /**
     * person | animal | practitioner | device | medication | substance
     */
    var type: String? = null
}

/**
 * Trait of group members
 *
 * Identifies the traits shared by members of the group.
 */
open class GroupCharacteristic() : BackboneElement() {
    /**
     * Kind of characteristic
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Group includes or excludes
     */
    var exclude: Boolean? = null

    /**
     * Period over which characteristic is tested
     */
    var period: Period? = null

    /**
     * Value held by characteristic
     */
    var valueBoolean: Boolean? = null

    /**
     * Value held by characteristic
     */
    var valueCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Value held by characteristic
     */
    var valueQuantity: Quantity = Quantity()

    /**
     * Value held by characteristic
     */
    var valueRange: Range = Range()
}

/**
 * Who or what is in group
 *
 * Identifies the resource instances that are members of the group.
 */
open class GroupMember() : BackboneElement() {
    /**
     * Reference to the group member
     */
    var entity: Reference = Reference()

    /**
     * If member is no longer in group
     */
    var inactive: Boolean? = null

    /**
     * Period member belonged to the group
     */
    var period: Period? = null
}
