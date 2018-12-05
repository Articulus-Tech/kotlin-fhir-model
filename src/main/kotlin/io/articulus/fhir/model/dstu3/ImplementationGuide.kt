//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.539 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * A set of rules about how FHIR is used
 *
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 */
open class ImplementationGuide() : DomainResource() {
    val binary: List<String> = mutableListOf<String>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    val dependency: List<ImplementationGuideDependency> =
            mutableListOf<ImplementationGuideDependency>()

    /**
     * Natural language description of the implementation guide
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * FHIR Version this Implementation Guide targets
     */
    var fhirVersion: String? = null

    @SerializedName("global")
    val global_fhir: List<ImplementationGuideGlobal> = mutableListOf<ImplementationGuideGlobal>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name for this implementation guide (computer friendly)
     */
    var name: String? = null

    @SerializedName("package")
    val package_fhir: List<ImplementationGuidePackage> = mutableListOf<ImplementationGuidePackage>()

    /**
     * Page/Section in the Guide
     */
    var page: ImplementationGuidePage? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Logical URI to reference this implementation guide (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the implementation guide
     */
    var version: String? = null
}

/**
 * Another Implementation guide this depends on
 *
 * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
 */
open class ImplementationGuideDependency() : BackboneElement() {
    /**
     * reference | inclusion
     */
    var type: String? = null

    /**
     * Where to find dependency
     */
    var uri: String? = null
}

/**
 * Group of resources as used in .page.package
 *
 * A logical group of resources. Logical groups can be used when building pages.
 */
open class ImplementationGuidePackage() : BackboneElement() {
    /**
     * Human readable text describing the package
     */
    var description: String? = null

    /**
     * Name used .page.package
     */
    var name: String? = null

    val resource: List<ImplementationGuidePackageResource> =
            mutableListOf<ImplementationGuidePackageResource>()
}

/**
 * Resource in the implementation guide
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
 */
open class ImplementationGuidePackageResource() : BackboneElement() {
    /**
     * Short code to identify the resource
     */
    var acronym: String? = null

    /**
     * Reason why included in guide
     */
    var description: String? = null

    /**
     * If not an example, has its normal meaning
     */
    var example: Boolean? = null

    /**
     * Resource this is an example of (if applicable)
     */
    var exampleFor: Reference? = null

    /**
     * Human Name for the resource
     */
    var name: String? = null

    /**
     * Location of the resource
     */
    var sourceReference: Reference = Reference()

    /**
     * Location of the resource
     */
    var sourceUri: String? = null
}

/**
 * Profiles that apply globally
 *
 * A set of profiles that all resources covered by this implementation guide must conform to.
 */
open class ImplementationGuideGlobal() : BackboneElement() {
    /**
     * Profile that all resources must conform to
     */
    var profile: Reference = Reference()

    /**
     * Type this profiles applies to
     */
    var type: String? = null
}

/**
 * Page/Section in the Guide
 *
 * A page / section in the implementation guide. The root page is the implementation guide home page.
 */
open class ImplementationGuidePage() : BackboneElement() {
    /**
     * Format of the page (e.g. html, markdown, etc.)
     */
    var format: String? = null

    /**
     * page | example | list | include | directory | dictionary | toc | resource
     */
    var kind: String? = null

    @SerializedName("package")
    val package_fhir: List<String> = mutableListOf<String>()

    val page: List<ImplementationGuidePage> = mutableListOf<ImplementationGuidePage>()

    /**
     * Where to find that page
     */
    var source: String? = null

    /**
     * Short title shown for navigational assistance
     */
    var title: String? = null

    val type: List<String> = mutableListOf<String>()
}
