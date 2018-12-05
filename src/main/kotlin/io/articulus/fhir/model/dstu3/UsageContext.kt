//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.340 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Describes the context of use for a conformance or knowledge resource
 *
 * Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 */
open class UsageContext() : Element() {
    /**
     * Type of context being specified
     */
    var code: Coding = Coding()

    /**
     * Value that defines the context
     */
    var valueCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Value that defines the context
     */
    var valueQuantity: Quantity = Quantity()

    /**
     * Value that defines the context
     */
    var valueRange: Range = Range()
}
