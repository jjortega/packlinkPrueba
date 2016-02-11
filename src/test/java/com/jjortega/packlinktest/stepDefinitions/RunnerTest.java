package com.jjortega.packlinktest.stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/html/", "json:target/json/cucumber.json" },
                 features = "src/test/features")
public class RunnerTest {
}
