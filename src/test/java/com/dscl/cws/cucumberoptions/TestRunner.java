package com.dscl.cws.cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Add Feature
//Add stepDefinitions
@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/com/dscl/cws/features",
		glue="stepdefinitions",
		tags = "@ACARegister",
		stepNotifications = true)

public class TestRunner {

}
