//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.406 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * Describes the results of a TestScript execution
 *
 * A summary of information based on the results of executing a TestScript.
 */
open class TestReport() : DomainResource() {
    /**
     * External identifier
     */
    var identifier: Identifier? = null

    /**
     * When the TestScript was executed and this TestReport was generated
     */
    var issued: String? = null

    /**
     * Informal name of the executed TestScript
     */
    var name: String? = null

    val participant: List<TestReportParticipant> = mutableListOf<TestReportParticipant>()

    /**
     * pass | fail | pending
     */
    var result: String? = null

    /**
     * The final score (percentage of tests passed) resulting from the execution of the TestScript
     */
    var score: Float? = null

    /**
     * The results of the series of required setup operations before the tests were executed
     */
    var setup: TestReportSetup? = null

    /**
     * completed | in-progress | waiting | stopped | entered-in-error
     */
    var status: String? = null

    /**
     * The results of running the series of required clean up steps
     */
    var teardown: TestReportTeardown? = null

    val test: List<TestReportTest> = mutableListOf<TestReportTest>()

    /**
     * Reference to the  version-specific TestScript that was executed to produce this TestReport
     */
    var testScript: Reference = Reference()

    /**
     * Name of the tester producing this report (Organization or individual)
     */
    var tester: String? = null
}

/**
 * A participant in the test execution, either the execution engine, a client, or a server
 *
 * A participant in the test execution, either the execution engine, a client, or a server.
 */
open class TestReportParticipant() : BackboneElement() {
    /**
     * The display name of the participant
     */
    var display: String? = null

    /**
     * test-engine | client | server
     */
    var type: String? = null

    /**
     * The uri of the participant. An absolute URL is preferred
     */
    var uri: String? = null
}

/**
 * The results of the series of required setup operations before the tests were executed
 *
 * The results of the series of required setup operations before the tests were executed.
 */
open class TestReportSetup() : BackboneElement() {
    val action: List<TestReportSetupAction> = mutableListOf<TestReportSetupAction>()
}

/**
 * A setup operation or assert that was executed
 *
 * Action would contain either an operation or an assertion.
 */
open class TestReportSetupAction() : BackboneElement() {
    /**
     * The assertion to perform
     */
    @SerializedName("assert")
    var assert_fhir: TestReportSetupActionAssert? = null

    /**
     * The operation to perform
     */
    var operation: TestReportSetupActionOperation? = null
}

/**
 * The operation to perform
 *
 * The operation performed.
 */
open class TestReportSetupActionOperation() : BackboneElement() {
    /**
     * A link to further details on the result
     */
    var detail: String? = null

    /**
     * A message associated with the result
     */
    var message: String? = null

    /**
     * pass | skip | fail | warning | error
     */
    var result: String? = null
}

/**
 * The assertion to perform
 *
 * The results of the assertion performed on the previous operations.
 */
open class TestReportSetupActionAssert() : BackboneElement() {
    /**
     * A link to further details on the result
     */
    var detail: String? = null

    /**
     * A message associated with the result
     */
    var message: String? = null

    /**
     * pass | skip | fail | warning | error
     */
    var result: String? = null
}

/**
 * A test executed from the test script
 *
 * A test executed from the test script.
 */
open class TestReportTest() : BackboneElement() {
    val action: List<TestReportTestAction> = mutableListOf<TestReportTestAction>()

    /**
     * Tracking/reporting short description of the test
     */
    var description: String? = null

    /**
     * Tracking/logging name of this test
     */
    var name: String? = null
}

/**
 * A test operation or assert that was performed
 *
 * Action would contain either an operation or an assertion.
 */
open class TestReportTestAction() : BackboneElement() {
    /**
     * The assertion performed
     */
    @SerializedName("assert")
    var assert_fhir: TestReportSetupActionAssert? = null

    /**
     * The operation performed
     */
    var operation: TestReportSetupActionOperation? = null
}

/**
 * The results of running the series of required clean up steps
 *
 * The results of the series of operations required to clean up after the all the tests were executed (successfully or otherwise).
 */
open class TestReportTeardown() : BackboneElement() {
    val action: List<TestReportTeardownAction> = mutableListOf<TestReportTeardownAction>()
}

/**
 * One or more teardown operations performed
 *
 * The teardown action will only contain an operation.
 */
open class TestReportTeardownAction() : BackboneElement() {
    /**
     * The teardown operation performed
     */
    var operation: TestReportSetupActionOperation = TestReportSetupActionOperation()
}
