//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.386 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
 *
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different signature approaches have different utilities.
 */
open class Signature() : Element() {
    /**
     * The actual signature content (XML DigSig. JWT, picture, etc.)
     */
    var blob: String? = null

    /**
     * The technical format of the signature
     */
    var contentType: String? = null

    /**
     * The party represented
     */
    var onBehalfOfReference: Reference? = null

    /**
     * The party represented
     */
    var onBehalfOfUri: String? = null

    val type: List<Coding> = mutableListOf<Coding>()

    /**
     * When the signature was created
     */
    @SerializedName("when")
    var when_fhir: String? = null

    /**
     * Who signed
     */
    var whoReference: Reference = Reference()

    /**
     * Who signed
     */
    var whoUri: String? = null
}
