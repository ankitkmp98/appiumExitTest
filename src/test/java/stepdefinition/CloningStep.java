package stepdefinition;

import org.testng.Assert;

import Runner.LoggerHelper;
import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CloningPage;

public class CloningStep extends BaseTest {
	LoggerHelper cloning_logger = new LoggerHelper("Animation cloning logger");

	@Given("^At first I open my animation page for cloning operation$")
	public void at_first_I_open_my_animation_page_for_cloning_operation() throws Throwable {
		setup();

		cloning_logger.log.info("opening animation page");
	}

	@Given("^I click on animation button for cloning operation$")
	public void i_click_on_animation_button_for_cloning_operation() throws Throwable {
		CloningPage cloning_obj = new CloningPage();
		cloning_obj.animation_button();

		cloning_logger.log.info("click on animation button");
	}

	@Then("^click on cloning button to perform operation$")
	public void click_on_cloning_button_to_perform_operation() throws Throwable {
		CloningPage cloning_obj = new CloningPage();
		cloning_obj.cloning_button();

		cloning_logger.log.info("click on cloning button");
	}

	@Then("^click on run button$")
	public void click_on_run_button() throws Throwable {
		CloningPage cloning_obj = new CloningPage();
		cloning_obj.run_button();

//		Thread.sleep(10000);

		cloning_logger.log.info("click on run button");
	}

	@Then("I perform assertion for cloning operation")
	public void i_perform_assertion_for_cloning_operation() {
		CloningPage cloning_obj = new CloningPage();
		Assert.assertEquals(cloning_obj.cloning_page_title(), "Animation/Cloning");

		cloning_logger.log.info("checkin whether page title correct or not");
	}

}
