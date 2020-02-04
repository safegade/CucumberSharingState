package com.steps.specific;

import com.steps.common.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SpecificStep1 {

    private CommonSteps cs;
    public SpecificStep1(CommonSteps cs){
        this.cs=cs;
    }

    @Then("^My Report 1 is clicked$")
    public void my_report_1_is_clicked()  {
        System.out.println("Report 1 is clicked");
        System.out.println("Common Step Data Report Number: " + cs.reportNumber);
        System.out.println("Common Step Data Menu Hit Number: " + cs.menuHitNumber);
    }

    @And("^perform my testing by validating 10 \\* 10$")
    public void perform_my_testing_by_validating_10_10() {
        System.out.println("10 * 10 = 100");
    }
}
