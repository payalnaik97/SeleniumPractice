package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue ="com.stepDefination",dryRun = false,
                 plugin={"html:target/index.html"},tags ="@neg-register")
public class TestRunner {

}
