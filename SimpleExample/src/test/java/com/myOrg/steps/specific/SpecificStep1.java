package com.myOrg.steps.specific;

import com.myOrg.steps.common.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SpecificStep1 {

    private CommonSteps cs;

    public SpecificStep1(CommonSteps cs) {
        this.cs = cs;
    }

    @Then("^read state break down summary table$")
    public void read_state_break_down_summary_table() {
        //retrieving shared state
        System.out.println("In reading summary table step: " + cs.reportName);
    }

    @And("^assert all numbers for their correctness$")
    public void assert_all_numbers_for_their_correctness() {
        //retrieving shared state
        System.out.println("In report numbers assertion step: " + cs.reportName);
    }
}
