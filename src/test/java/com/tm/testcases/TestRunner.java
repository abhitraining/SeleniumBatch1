package com.tm.testcases;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "FeatureFiles",
        glue="com.tm.stepdefinitions",
        monochrome = true,
        plugin = {"pretty","html:target/Cucumberreport/report.html"}
)
public class TestRunner {


}
