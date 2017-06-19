package com.ivan.learning.ocp.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.ivan.learning.ocp.cucumber.steps",
        features = "src/test/resources/com/ivan/learning/ocp/",
        plugin = "com.ivan.learning.ocp.cucumber.plugin.CustomPlugin:cuc-reports/cuc-reports.json"
)
public class CucumberTestRunner {



}
