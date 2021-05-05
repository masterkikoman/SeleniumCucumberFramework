package com.dscl.cws.usersteps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.dscl.cws.pageobjects.AcademicHomepage;
import com.dscl.cws.pageobjects.AcademicRegistrationPage;

public class CustomerRegistrationSteps {
	
	public WebDriver driver;
	AcademicHomepage action = null;
	AcademicRegistrationPage regAction = null;
	InitializeDriverSteps init = null;
	
	public CustomerRegistrationSteps (WebDriver driver) {
		this.driver = driver;
	}
	
	public AcademicHomepage getClickRegisterButton() {
		//init = new InitializeDriverSteps();	
		action = new AcademicHomepage(driver);	
		action.getRegisterButton().click();	
		return action;
	}
	
	public AcademicRegistrationPage getTitlePage() {
		regAction = new AcademicRegistrationPage(driver);
		String header = regAction.getTitleHeader().getText();
		Assert.assertTrue((header.contains("Register")));
		return regAction;
		
	}
	
	/*public AcademicRegistrationPage getInputCustomerDetails(String stream) throws IOException {
		stream = "academic";
		InitializeDriverSteps regInput = new InitializeDriverSteps();
		regInput.getInitializeDriver(stream);
		getClickRegisterButton();
		driver.getCurrentUrl();
		return ;
	
	}*/
	
	

}
