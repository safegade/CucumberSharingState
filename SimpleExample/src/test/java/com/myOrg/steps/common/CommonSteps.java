package com.myOrg.steps.common;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps {

    public String reportName;

    @Given("^User logs in to portal and navigates \"([^\"]*)\"$")
    public void LaunchAndLogin(String reportName) {
        this.reportName = reportName;
        System.out.println("Logged in and navigated to: " + reportName);
    }
}
