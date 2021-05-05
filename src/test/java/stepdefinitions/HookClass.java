package stepdefinitions;


import java.io.IOException;

import java.util.concurrent.TimeUnit;


import com.dscl.cws.resources.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends Base{
	

	
	
	@Before
	public void initDriver() throws IOException {
		driver = initializeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@After
	public void teardown() {
		driver.quit();
		
	}
	
	

}
