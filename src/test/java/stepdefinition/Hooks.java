package stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest 
{
	@Before
	public void appiumStart()
	{
		start();
	}
	
	@After
	public void tearDown() 
	{
		stopAppium();
		closeService();
	}
	
	
	@AfterStep
	public void addScreenshot(Scenario scenario)
	{
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) wd).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
		
	}

}
