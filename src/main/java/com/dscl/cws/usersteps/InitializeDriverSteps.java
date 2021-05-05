package com.dscl.cws.usersteps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.dscl.cws.resources.Base;


public class InitializeDriverSteps extends Base{
	
	
	public void getInitializeDriver (String stream) throws IOException {
		
		driver.get("https://wmpstaging.cambridgedev.org/gb/"+stream);
		
	}
	
	public WebDriver getDriver() {
		
		return driver;
	}
	
	

}
