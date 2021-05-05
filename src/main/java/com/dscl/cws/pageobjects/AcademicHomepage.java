package com.dscl.cws.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcademicHomepage {
	
	public WebDriver driver;
	
	private By countrSelector = By.xpath("//li[@class='navLocation ']/a");
	private By inputCountryText = By.id("localeText");
	private By saveButton = By.id("saveLocaleButton");
	private By autoComplete = By.xpath("//*[@class='autocomplete-suggestions']");
	private By registerButton = By.xpath("//div[@class='searchTabs hide-for-small']//*[@class='registerButton registerLink']");
	
	
	public AcademicHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCountrSelector() {	
		return driver.findElement(countrSelector);
	}
	
	public WebElement getInputCountryText () {
		return driver.findElement(inputCountryText);
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(saveButton);
	}
	
	public WebElement getAutoComplete() {
		return driver.findElement(autoComplete);
	}
	
	public WebElement getRegisterButton() {
		return driver.findElement(registerButton);
	}

}
