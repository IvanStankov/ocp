package com.ivan.learning.ocp.cucumber.steps;

import cucumber.api.java.en.When;

public class Steps {

    @When("some step 1")
    public void step1() {
        System.out.println("Step1");
    }

    @When("some step 2")
    public void step2() {
        System.out.println("Step2");
    }

}
