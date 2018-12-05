//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.605 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A structured set of questions and their answers
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 */
open class QuestionnaireResponse() : DomainResource() {
    /**
     * Person who received and recorded the answers
     */
    var author: Reference? = null

    /**
     * Date the answers were gathered
     */
    var authored: String? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Encounter or Episode during which questionnaire was completed
     */
    var context: Reference? = null

    /**
     * Unique id for this set of answers
     */
    var identifier: Identifier? = null

    val item: List<QuestionnaireResponseItem> = mutableListOf<QuestionnaireResponseItem>()

    val parent: List<Reference> = mutableListOf<Reference>()

    /**
     * Form being answered
     */
    var questionnaire: Reference? = null

    /**
     * The person who answered the questions
     */
    var source: Reference? = null

    /**
     * in-progress | completed | amended | entered-in-error | stopped
     */
    var status: String? = null

    /**
     * The subject of the questions
     */
    var subject: Reference? = null
}

/**
 * Groups and questions
 *
 * A group or question item from the original questionnaire for which answers are provided.
 */
open class QuestionnaireResponseItem() : BackboneElement() {
    val answer: List<QuestionnaireResponseItemAnswer> =
            mutableListOf<QuestionnaireResponseItemAnswer>()

    /**
     * ElementDefinition - details for the item
     */
    var definition: String? = null

    val item: List<QuestionnaireResponseItem> = mutableListOf<QuestionnaireResponseItem>()

    /**
     * Pointer to specific item from Questionnaire
     */
    var linkId: String? = null

    /**
     * The subject this group's answers are about
     */
    var subject: Reference? = null

    /**
     * Name for group or question text
     */
    var text: String? = null
}

/**
 * The response(s) to the question
 *
 * The respondent's answer(s) to the question.
 */
open class QuestionnaireResponseItemAnswer() : BackboneElement() {
    val item: List<QuestionnaireResponseItem> = mutableListOf<QuestionnaireResponseItem>()

    /**
     * Single-valued answer to the question
     */
    var valueAttachment: Attachment? = null

    /**
     * Single-valued answer to the question
     */
    var valueBoolean: Boolean? = null

    /**
     * Single-valued answer to the question
     */
    var valueCoding: Coding? = null

    /**
     * Single-valued answer to the question
     */
    var valueDate: String? = null

    /**
     * Single-valued answer to the question
     */
    var valueDateTime: String? = null

    /**
     * Single-valued answer to the question
     */
    var valueDecimal: Float? = null

    /**
     * Single-valued answer to the question
     */
    var valueInteger: Int? = null

    /**
     * Single-valued answer to the question
     */
    var valueQuantity: Quantity? = null

    /**
     * Single-valued answer to the question
     */
    var valueReference: Reference? = null

    /**
     * Single-valued answer to the question
     */
    var valueString: String? = null

    /**
     * Single-valued answer to the question
     */
    var valueTime: String? = null

    /**
     * Single-valued answer to the question
     */
    var valueUri: String? = null
}
