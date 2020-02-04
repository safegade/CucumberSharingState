package com.steps.common;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps {

    public double reportNumber;
    public double menuHitNumber;

    @Given("^I log in to \"([^\"]*)\"$")
    public void i_log_in_to_something(String strArg1) {
        System.out.println("Logged in now..");
        reportNumber = Math.random();
        System.out.println("State of Report Number is: " + reportNumber);
    }

    @And("^Hit reports menu$")
    public void hit_reports_menu()  {
        System.out.println("Reports menu is visible now.");
        menuHitNumber = Math.random();
        System.out.println("State of Menu Hit Number: " + menuHitNumber);
    }
}
