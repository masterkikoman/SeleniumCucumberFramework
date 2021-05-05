package stepdefinitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.dscl.cws.usersteps.CustomerRegistrationSteps;
import com.dscl.cws.usersteps.InitializeDriverSteps;

import io.cucumber.java.en.*;


public class AcademicRegisterPageStepDefinition {
	CustomerRegistrationSteps userStep = null;
	InitializeDriverSteps init = null;
	
	
	@When("I select the Register link")
	public void i_select_the_register_link() throws IOException {
		init = new InitializeDriverSteps();	
		userStep = new CustomerRegistrationSteps(init.getDriver());
		userStep.getClickRegisterButton();
	    
	}

	@Then("I expect to be redirected at Register page")
	public void i_expect_to_be_redirected_at_register_page() {
		userStep.getTitlePage();
	   
	}

	@Given("I am on the Register Page")
	public void i_am_on_the_register_page() throws IOException {
		//init = new InitializeDriverSteps();
		//init.getInitializeDriver("academic");
		i_select_the_register_link();
		
	}

	@When("I register with required fields not complete")
	public void i_register_with_required_fields_not_complete() {
		
	    
	}

	@Then("I should see an error message requiring to fill the missing fields")
	public void i_should_see_an_error_message_requiring_to_fill_the_missing_fields() {
	   
	}

	@When("I register through the Academic Register button with complete and valid fields")
	public void i_register_through_the_academic_register_button_with_complete_and_valid_fields(io.cucumber.datatable.DataTable dataTable) {
	 
	}

	@Then("I am registered successfully")
	public void i_am_registered_successfully() {
	    
	}

	@Then("I am redirected to the Academic website")
	public void i_am_redirected_to_the_academic_website() {
	   
	}

	@When("I look on my profile")
	public void i_look_on_my_profile() {
	    
	}

	@Then("I should be able to delete my account")
	public void i_should_be_able_to_delete_my_account() {
	    
	}


}
