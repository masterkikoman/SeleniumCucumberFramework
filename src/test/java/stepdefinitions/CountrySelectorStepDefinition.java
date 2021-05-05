package stepdefinitions;

import java.io.IOException;


import org.junit.runner.RunWith;

import com.dscl.cws.usersteps.CountrySelectorSteps;
import com.dscl.cws.usersteps.InitializeDriverSteps;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class CountrySelectorStepDefinition  {

	CountrySelectorSteps userStep = null; 
		
	@Given("I am in the Academic website {string}")
	public void i_am_in_the_academic_website(String stream) throws IOException {
		InitializeDriverSteps init = new InitializeDriverSteps();
		init.getInitializeDriver(stream);
		userStep = new CountrySelectorSteps(init.getDriver());
	}
 
	@When("I change the country locale to {string}")
	public void i_change_the_country_locale_to(String country) {
		userStep.getcountrSelectorSteps(country);
		
	}
	
	@Then("the country locale has changed to {string}")
	public void the_country_locale_has_changed_to(String country) {
		userStep.getCountryIsCorrect(country);

	}


}
