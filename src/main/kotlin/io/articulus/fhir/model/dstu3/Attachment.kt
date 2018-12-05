//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.719 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Content in a format defined elsewhere
 *
 * For referring to data content defined in other formats.
 */
open class Attachment() : Element() {
    /**
     * Mime type of the content, with charset etc.
     */
    var contentType: String? = null

    /**
     * Date attachment was first created
     */
    var creation: String? = null

    /**
     * Data inline, base64ed
     */
    var data: String? = null

    /**
     * Hash of the data (sha-1, base64ed)
     */
    var hash: String? = null

    /**
     * Human language of the content (BCP-47)
     */
    var language: String? = null

    /**
     * Number of bytes of content (if url provided)
     */
    var size: Int? = null

    /**
     * Label to display in place of the data
     */
    var title: String? = null

    /**
     * Uri where the data can be found
     */
    var url: String? = null
}
