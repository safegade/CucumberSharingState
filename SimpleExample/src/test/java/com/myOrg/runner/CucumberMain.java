package com.myOrg.runner;

import io.cucumber.core.cli.Main;

public class CucumberMain extends Main {
    public static void main(String... cucumberOptions){
        byte exitStatus = run(cucumberOptions, Thread.currentThread().getContextClassLoader());
    }
}