package com.steps.specific;

import com.steps.common.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SpecificStep2 {

    private CommonSteps cs;
    public SpecificStep2(CommonSteps cs){
        this.cs=cs;
    }

    @Then("^read dashboard metrics figures$")
    public void read_dashboard_metrics_figures() {
        System.out.println("In Dashboard Reading Step: " + cs.reportName);
    }

    @And("^assert dashboard metrics correctness$")
    public void assert_dashboard_metrics_correctness() {
        System.out.println("In Dashboard Assertion Step: " + cs.reportName);
    }

}
