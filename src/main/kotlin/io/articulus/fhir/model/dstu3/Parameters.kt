//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.673 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Operation Request or Response
 *
 * This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.
 */
open class Parameters() : Resource() {
    val parameter: List<ParametersParameter> = mutableListOf<ParametersParameter>()
}

/**
 * Operation Parameter
 *
 * A parameter passed to or received from the operation.
 */
open class ParametersParameter() : BackboneElement() {
    /**
     * Name from the definition
     */
    var name: String? = null

    val part: List<ParametersParameter> = mutableListOf<ParametersParameter>()

    /**
     * If parameter is a whole resource
     */
    var resource: Resource? = null

    /**
     * If parameter is a data type
     */
    var valueAddress: Address? = null

    /**
     * If parameter is a data type
     */
    var valueAge: Age? = null

    /**
     * If parameter is a data type
     */
    var valueAnnotation: Annotation? = null

    /**
     * If parameter is a data type
     */
    var valueAttachment: Attachment? = null

    /**
     * If parameter is a data type
     */
    var valueBase64Binary: String? = null

    /**
     * If parameter is a data type
     */
    var valueBoolean: Boolean? = null

    /**
     * If parameter is a data type
     */
    var valueCode: String? = null

    /**
     * If parameter is a data type
     */
    var valueCodeableConcept: CodeableConcept? = null

    /**
     * If parameter is a data type
     */
    var valueCoding: Coding? = null

    /**
     * If parameter is a data type
     */
    var valueContactPoint: ContactPoint? = null

    /**
     * If parameter is a data type
     */
    var valueCount: Count? = null

    /**
     * If parameter is a data type
     */
    var valueDate: String? = null

    /**
     * If parameter is a data type
     */
    var valueDateTime: String? = null

    /**
     * If parameter is a data type
     */
    var valueDecimal: Float? = null

    /**
     * If parameter is a data type
     */
    var valueDistance: Distance? = null

    /**
     * If parameter is a data type
     */
    var valueDuration: Duration? = null

    /**
     * If parameter is a data type
     */
    var valueHumanName: HumanName? = null

    /**
     * If parameter is a data type
     */
    var valueId: String? = null

    /**
     * If parameter is a data type
     */
    var valueIdentifier: Identifier? = null

    /**
     * If parameter is a data type
     */
    var valueInstant: String? = null

    /**
     * If parameter is a data type
     */
    var valueInteger: Int? = null

    /**
     * If parameter is a data type
     */
    var valueMarkdown: String? = null

    /**
     * If parameter is a data type
     */
    var valueMeta: Meta? = null

    /**
     * If parameter is a data type
     */
    var valueMoney: Money? = null

    /**
     * If parameter is a data type
     */
    var valueOid: String? = null

    /**
     * If parameter is a data type
     */
    var valuePeriod: Period? = null

    /**
     * If parameter is a data type
     */
    var valuePositiveInt: Int? = null

    /**
     * If parameter is a data type
     */
    var valueQuantity: Quantity? = null

    /**
     * If parameter is a data type
     */
    var valueRange: Range? = null

    /**
     * If parameter is a data type
     */
    var valueRatio: Ratio? = null

    /**
     * If parameter is a data type
     */
    var valueReference: Reference? = null

    /**
     * If parameter is a data type
     */
    var valueSampledData: SampledData? = null

    /**
     * If parameter is a data type
     */
    var valueSignature: Signature? = null

    /**
     * If parameter is a data type
     */
    var valueString: String? = null

    /**
     * If parameter is a data type
     */
    var valueTime: String? = null

    /**
     * If parameter is a data type
     */
    var valueTiming: Timing? = null

    /**
     * If parameter is a data type
     */
    var valueUnsignedInt: Int? = null

    /**
     * If parameter is a data type
     */
    var valueUri: String? = null
}
