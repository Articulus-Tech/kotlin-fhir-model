//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.370 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Optional Extensions Element
 *
 * Optional Extension Element - found in all resources.
 */
open class Extension() : Element() {
    /**
     * identifies the meaning of the extension
     */
    var url: String? = null

    /**
     * Value of extension
     */
    var valueAddress: Address? = null

    /**
     * Value of extension
     */
    var valueAge: Age? = null

    /**
     * Value of extension
     */
    var valueAnnotation: Annotation? = null

    /**
     * Value of extension
     */
    var valueAttachment: Attachment? = null

    /**
     * Value of extension
     */
    var valueBase64Binary: String? = null

    /**
     * Value of extension
     */
    var valueBoolean: Boolean? = null

    /**
     * Value of extension
     */
    var valueCode: String? = null

    /**
     * Value of extension
     */
    var valueCodeableConcept: CodeableConcept? = null

    /**
     * Value of extension
     */
    var valueCoding: Coding? = null

    /**
     * Value of extension
     */
    var valueContactPoint: ContactPoint? = null

    /**
     * Value of extension
     */
    var valueCount: Count? = null

    /**
     * Value of extension
     */
    var valueDate: String? = null

    /**
     * Value of extension
     */
    var valueDateTime: String? = null

    /**
     * Value of extension
     */
    var valueDecimal: Float? = null

    /**
     * Value of extension
     */
    var valueDistance: Distance? = null

    /**
     * Value of extension
     */
    var valueDuration: Duration? = null

    /**
     * Value of extension
     */
    var valueHumanName: HumanName? = null

    /**
     * Value of extension
     */
    var valueId: String? = null

    /**
     * Value of extension
     */
    var valueIdentifier: Identifier? = null

    /**
     * Value of extension
     */
    var valueInstant: String? = null

    /**
     * Value of extension
     */
    var valueInteger: Int? = null

    /**
     * Value of extension
     */
    var valueMarkdown: String? = null

    /**
     * Value of extension
     */
    var valueMeta: Meta? = null

    /**
     * Value of extension
     */
    var valueMoney: Money? = null

    /**
     * Value of extension
     */
    var valueOid: String? = null

    /**
     * Value of extension
     */
    var valuePeriod: Period? = null

    /**
     * Value of extension
     */
    var valuePositiveInt: Int? = null

    /**
     * Value of extension
     */
    var valueQuantity: Quantity? = null

    /**
     * Value of extension
     */
    var valueRange: Range? = null

    /**
     * Value of extension
     */
    var valueRatio: Ratio? = null

    /**
     * Value of extension
     */
    var valueReference: Reference? = null

    /**
     * Value of extension
     */
    var valueSampledData: SampledData? = null

    /**
     * Value of extension
     */
    var valueSignature: Signature? = null

    /**
     * Value of extension
     */
    var valueString: String? = null

    /**
     * Value of extension
     */
    var valueTime: String? = null

    /**
     * Value of extension
     */
    var valueTiming: Timing? = null

    /**
     * Value of extension
     */
    var valueUnsignedInt: Int? = null

    /**
     * Value of extension
     */
    var valueUri: String? = null
}
