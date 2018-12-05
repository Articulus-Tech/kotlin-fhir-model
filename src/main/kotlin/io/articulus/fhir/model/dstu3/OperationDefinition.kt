//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.271 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Definition of an operation or a named query
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 */
open class OperationDefinition() : DomainResource() {
    /**
     * Marks this as a profile of the base
     */
    var base: Reference? = null

    /**
     * Name used to invoke the operation
     */
    var code: String? = null

    /**
     * Additional information about use
     */
    var comment: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the operation definition
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Whether content is unchanged by the operation
     */
    var idempotent: Boolean? = null

    /**
     * Invoke on an instance?
     */
    var instance: Boolean? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * operation | query
     */
    var kind: String? = null

    /**
     * Name for this operation definition (computer friendly)
     */
    var name: String? = null

    val overload: List<OperationDefinitionOverload> = mutableListOf<OperationDefinitionOverload>()

    val parameter: List<OperationDefinitionParameter> =
            mutableListOf<OperationDefinitionParameter>()

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this operation definition is defined
     */
    var purpose: String? = null

    val resource: List<String> = mutableListOf<String>()

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Invoke at the system level?
     */
    var system: Boolean? = null

    /**
     * Invole at the type level?
     */
    var type: Boolean? = null

    /**
     * Logical URI to reference this operation definition (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the operation definition
     */
    var version: String? = null
}

/**
 * Parameters for the operation/query
 *
 * The parameters for the operation/query.
 */
open class OperationDefinitionParameter() : BackboneElement() {
    /**
     * ValueSet details if this is coded
     */
    var binding: OperationDefinitionParameterBinding? = null

    /**
     * Description of meaning/use
     */
    var documentation: String? = null

    /**
     * Maximum Cardinality (a number or *)
     */
    var max: String? = null

    /**
     * Minimum Cardinality
     */
    var min: Int? = null

    /**
     * Name in Parameters.parameter.name or in URL
     */
    var name: String? = null

    val part: List<OperationDefinitionParameter> = mutableListOf<OperationDefinitionParameter>()

    /**
     * Profile on the type
     */
    var profile: Reference? = null

    /**
     * number | date | string | token | reference | composite | quantity | uri
     */
    var searchType: String? = null

    /**
     * What type this parameter has
     */
    var type: String? = null

    /**
     * in | out
     */
    var use: String? = null
}

/**
 * ValueSet details if this is coded
 *
 * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
 */
open class OperationDefinitionParameterBinding() : BackboneElement() {
    /**
     * required | extensible | preferred | example
     */
    var strength: String? = null

    /**
     * Source of value set
     */
    var valueSetReference: Reference = Reference()

    /**
     * Source of value set
     */
    var valueSetUri: String? = null
}

/**
 * Define overloaded variants for when  generating code
 *
 * Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.
 */
open class OperationDefinitionOverload() : BackboneElement() {
    /**
     * Comments to go on overload
     */
    var comment: String? = null

    val parameterName: List<String> = mutableListOf<String>()
}
