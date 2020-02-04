package com.cucumber.runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/*
* Maven steps to run:
* clean -Dtest=MyRunner test -Dtags="@AllFeatures" -DfailIfNoTests=false
* */
public class MyRunner {
    private String tags;

    @BeforeClass
    public void setUp() {
        tags = System.getProperty("tags");
    }

    @Test(invocationCount = 1)
    public void test() {
        System.out.println("Starting test case execution....");
        System.out.println("tags: " + tags);

        try {
            CucumberMain.main(new String[]
                    {
                            "--threads", "5",
                            "-p", "json:target/cucumber-report/cucumber.json",
                            "-p", "rerun:target/rerun.txt",
                            "-g", "com.steps",
                            "-t", tags,
                            "src/test/resources/features"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
