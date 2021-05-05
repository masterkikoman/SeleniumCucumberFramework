package com.dscl.cws.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcademicRegistrationPage {
	
	public WebDriver driver;

	private By header = By.xpath("//h1");
	private By createAccountButton = By.xpath("//*[@class='button large blue btn ccm-input-submit']");
	
	public AcademicRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTitleHeader() {
		
		return driver.findElement(header);		
	}
	
	public WebElement getCreateAccountButton() {	
		
		return driver.findElement(createAccountButton);		
	}
	
	
}
