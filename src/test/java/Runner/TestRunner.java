package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "./src/test/java/features"
		,glue = "stepdefinition"		
		,monochrome = true				
		,tags ="@test"		
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "usage", "html:target/cucumber-reports" }
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
