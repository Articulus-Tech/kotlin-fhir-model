//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.329 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Investigation to increase healthcare-related patient-independent knowledge
 *
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 */
open class ResearchSubject() : DomainResource() {
    /**
     * What path was followed
     */
    var actualArm: String? = null

    /**
     * What path should be followed
     */
    var assignedArm: String? = null

    /**
     * Agreement to participate in study
     */
    var consent: Reference? = null

    /**
     * Business Identifier for research subject
     */
    var identifier: Identifier? = null

    /**
     * Who is part of study
     */
    var individual: Reference = Reference()

    /**
     * Start and end of participation
     */
    var period: Period? = null

    /**
     * candidate | enrolled | active | suspended | withdrawn | completed
     */
    var status: String? = null

    /**
     * Study subject is part of
     */
    var study: Reference = Reference()
}
