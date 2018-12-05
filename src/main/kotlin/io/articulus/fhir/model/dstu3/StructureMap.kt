//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.738 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * A Map of relationships between 2 structures that can be used to transform data
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 */
open class StructureMap() : DomainResource() {
    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the structure map
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val group: List<StructureMapGroup> = mutableListOf<StructureMapGroup>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    @SerializedName("import")
    val import_fhir: List<String> = mutableListOf<String>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name for this structure map (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this structure map is defined
     */
    var purpose: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    val structure: List<StructureMapStructure> = mutableListOf<StructureMapStructure>()

    /**
     * Name for this structure map (human friendly)
     */
    var title: String? = null

    /**
     * Logical URI to reference this structure map (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the structure map
     */
    var version: String? = null
}

/**
 * Structure Definition used by this map
 *
 * A structure definition used by this map. The structure definition may describe instances that are converted, or the instances that are produced.
 */
open class StructureMapStructure() : BackboneElement() {
    /**
     * Name for type in this map
     */
    var alias: String? = null

    /**
     * Documentation on use of structure
     */
    var documentation: String? = null

    /**
     * source | queried | target | produced
     */
    var mode: String? = null

    /**
     * Canonical URL for structure definition
     */
    var url: String? = null
}

/**
 * Named sections for reader convenience
 *
 * Organizes the mapping into managable chunks for human review/ease of maintenance.
 */
open class StructureMapGroup() : BackboneElement() {
    /**
     * Additional description/explaination for group
     */
    var documentation: String? = null

    /**
     * Another group that this group adds rules to
     */
    var extends: String? = null

    val input: List<StructureMapGroupInput> = mutableListOf<StructureMapGroupInput>()

    /**
     * Human-readable label
     */
    var name: String? = null

    val rule: List<StructureMapGroupRule> = mutableListOf<StructureMapGroupRule>()

    /**
     * none | types | type-and-types
     */
    var typeMode: String? = null
}

/**
 * Named instance provided when invoking the map
 *
 * A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
 */
open class StructureMapGroupInput() : BackboneElement() {
    /**
     * Documentation for this instance of data
     */
    var documentation: String? = null

    /**
     * source | target
     */
    var mode: String? = null

    /**
     * Name for this instance of data
     */
    var name: String? = null

    /**
     * Type for this instance of data
     */
    var type: String? = null
}

/**
 * Transform Rule from source to target
 *
 * Transform Rule from source to target.
 */
open class StructureMapGroupRule() : BackboneElement() {
    val dependent: List<StructureMapGroupRuleDependent> =
            mutableListOf<StructureMapGroupRuleDependent>()

    /**
     * Documentation for this instance of data
     */
    var documentation: String? = null

    /**
     * Name of the rule for internal references
     */
    var name: String? = null

    val rule: List<StructureMapGroupRule> = mutableListOf<StructureMapGroupRule>()

    val source: List<StructureMapGroupRuleSource> = mutableListOf<StructureMapGroupRuleSource>()

    val target: List<StructureMapGroupRuleTarget> = mutableListOf<StructureMapGroupRuleTarget>()
}

/**
 * Source inputs to the mapping
 *
 * Source inputs to the mapping.
 */
open class StructureMapGroupRuleSource() : BackboneElement() {
    /**
     * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing
     */
    var check: String? = null

    /**
     * FHIRPath expression  - must be true or the rule does not apply
     */
    var condition: String? = null

    /**
     * Type or variable this rule applies to
     */
    var context: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueAddress: Address? = null

    /**
     * Default value if no value exists
     */
    var defaultValueAge: Age? = null

    /**
     * Default value if no value exists
     */
    var defaultValueAnnotation: Annotation? = null

    /**
     * Default value if no value exists
     */
    var defaultValueAttachment: Attachment? = null

    /**
     * Default value if no value exists
     */
    var defaultValueBase64Binary: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueBoolean: Boolean? = null

    /**
     * Default value if no value exists
     */
    var defaultValueCode: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueCodeableConcept: CodeableConcept? = null

    /**
     * Default value if no value exists
     */
    var defaultValueCoding: Coding? = null

    /**
     * Default value if no value exists
     */
    var defaultValueContactPoint: ContactPoint? = null

    /**
     * Default value if no value exists
     */
    var defaultValueCount: Count? = null

    /**
     * Default value if no value exists
     */
    var defaultValueDate: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueDateTime: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueDecimal: Float? = null

    /**
     * Default value if no value exists
     */
    var defaultValueDistance: Distance? = null

    /**
     * Default value if no value exists
     */
    var defaultValueDuration: Duration? = null

    /**
     * Default value if no value exists
     */
    var defaultValueHumanName: HumanName? = null

    /**
     * Default value if no value exists
     */
    var defaultValueId: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueIdentifier: Identifier? = null

    /**
     * Default value if no value exists
     */
    var defaultValueInstant: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueInteger: Int? = null

    /**
     * Default value if no value exists
     */
    var defaultValueMarkdown: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueMeta: Meta? = null

    /**
     * Default value if no value exists
     */
    var defaultValueMoney: Money? = null

    /**
     * Default value if no value exists
     */
    var defaultValueOid: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValuePeriod: Period? = null

    /**
     * Default value if no value exists
     */
    var defaultValuePositiveInt: Int? = null

    /**
     * Default value if no value exists
     */
    var defaultValueQuantity: Quantity? = null

    /**
     * Default value if no value exists
     */
    var defaultValueRange: Range? = null

    /**
     * Default value if no value exists
     */
    var defaultValueRatio: Ratio? = null

    /**
     * Default value if no value exists
     */
    var defaultValueReference: Reference? = null

    /**
     * Default value if no value exists
     */
    var defaultValueSampledData: SampledData? = null

    /**
     * Default value if no value exists
     */
    var defaultValueSignature: Signature? = null

    /**
     * Default value if no value exists
     */
    var defaultValueString: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueTime: String? = null

    /**
     * Default value if no value exists
     */
    var defaultValueTiming: Timing? = null

    /**
     * Default value if no value exists
     */
    var defaultValueUnsignedInt: Int? = null

    /**
     * Default value if no value exists
     */
    var defaultValueUri: String? = null

    /**
     * Optional field for this source
     */
    var element: String? = null

    /**
     * first | not_first | last | not_last | only_one
     */
    var listMode: String? = null

    /**
     * Specified maximum cardinality (number or *)
     */
    var max: String? = null

    /**
     * Specified minimum cardinality
     */
    var min: Int? = null

    /**
     * Rule only applies if source has this type
     */
    var type: String? = null

    /**
     * Named context for field, if a field is specified
     */
    var variable: String? = null
}

/**
 * Content to create because of this mapping rule
 *
 * Content to create because of this mapping rule.
 */
open class StructureMapGroupRuleTarget() : BackboneElement() {
    /**
     * Type or variable this rule applies to
     */
    var context: String? = null

    /**
     * type | variable
     */
    var contextType: String? = null

    /**
     * Field to create in the context
     */
    var element: String? = null

    val listMode: List<String> = mutableListOf<String>()

    /**
     * Internal rule reference for shared list items
     */
    var listRuleId: String? = null

    val parameter: List<StructureMapGroupRuleTargetParameter> =
            mutableListOf<StructureMapGroupRuleTargetParameter>()

    /**
     * create | copy +
     */
    var transform: String? = null

    /**
     * Named context for field, if desired, and a field is specified
     */
    var variable: String? = null
}

/**
 * Parameters to the transform
 *
 * Parameters to the transform.
 */
open class StructureMapGroupRuleTargetParameter() : BackboneElement() {
    /**
     * Parameter value - variable or literal
     */
    var valueBoolean: Boolean? = null

    /**
     * Parameter value - variable or literal
     */
    var valueDecimal: Float? = null

    /**
     * Parameter value - variable or literal
     */
    var valueId: String? = null

    /**
     * Parameter value - variable or literal
     */
    var valueInteger: Int? = null

    /**
     * Parameter value - variable or literal
     */
    var valueString: String? = null
}

/**
 * Which other rules to apply in the context of this rule
 *
 * Which other rules to apply in the context of this rule.
 */
open class StructureMapGroupRuleDependent() : BackboneElement() {
    /**
     * Name of a rule or group to apply
     */
    var name: String? = null

    val variable: List<String> = mutableListOf<String>()
}
