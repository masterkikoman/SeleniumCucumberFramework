package com.dscl.cws.usersteps;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dscl.cws.pageobjects.AcademicHomepage;

public class CountrySelectorSteps {
	
	private WebDriver driver;
	AcademicHomepage action = null;
	
	public CountrySelectorSteps(WebDriver driver) {
		
		this.driver = driver;
	}

	public AcademicHomepage getcountrSelectorSteps(String country) {
		action = new AcademicHomepage(driver);	
		action.getCountrSelector().click();
		action.getInputCountryText().sendKeys(country,Keys.ENTER);
		
		/*List<WebElement> countries = action.getAutoComplete().findElements(By.xpath("//*[@class='autocomplete-suggestion']"));
		int size = countries.size();
		for (int i = 0; i < size; i++) {
			
			if (countries.get(i).getText().contains("States")) {
				countries.get(i).click();
				break;
			}
		}*/
		
		action.getSaveButton().click();
		return action;
		
	}
	
	public AcademicHomepage getCountryIsCorrect(String country) {
		action.getCountrSelector().getText().equals(country);
		return action;
		
	}

}
