package stepdefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {
//	LoggerHelper hooks_logger = new LoggerHelper("Hooks logger");

	@Before
	public void appiumStart() {
		start();

//		hooks_logger.log.info("appium starting");
	}

	@After
	public void tearDown() {
		stopAppium();
//		hooks_logger.log.info("Quitting appium");

		closeService();
//		hooks_logger.log.info("Closing serive");

	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) wd).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");

//			hooks_logger.log.info("adding screenshot for failure test cases");
		}

	}
}

