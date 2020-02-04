package com.steps.specific;

import com.steps.common.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SpecificStep2 {

    private CommonSteps cs;
    public SpecificStep2(CommonSteps cs){
        this.cs=cs;
    }

    @Then("^My Report 2 is clicked$")
    public void my_report_2_is_clicked()  {
        System.out.println("Report 2 is clicked");
        System.out.println("Common Step Data Report Number: " + cs.reportNumber);
        System.out.println("Common Step Data Menu Hit Number: " + cs.menuHitNumber);
    }

    @And("^perform my testing by validating 10 \\* 5$")
    public void perform_my_testing_by_validating_10_5() {
        System.out.println("10 * 5 = 50");
    }
}
