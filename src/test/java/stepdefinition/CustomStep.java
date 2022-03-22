package stepdefinition;

import org.testng.Assert;

import Runner.LoggerHelper;
import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CustomPage;

public class CustomStep extends BaseTest {
	LoggerHelper custom_logger = new LoggerHelper("Animation custom logger");

	@Given("^At first I open my animation page for custom operation$")
	public void at_first_I_open_my_animation_page_for_custom_operation() throws Throwable {
		setup();

		custom_logger.log.info("opening animation page");
	}

	@Given("^I click on animation button for custom operation$")
	public void i_click_on_animation_button_for_custom_operation() throws Throwable {
		CustomPage custom_obj = new CustomPage();
		custom_obj.animation_button();

		custom_logger.log.info("click on animation button");
	}

	@Then("^click on custom button to perform operation$")
	public void click_on_custom_button_to_perform_operation() throws Throwable {
		CustomPage custom_obj = new CustomPage();
		custom_obj.custom_button();

		custom_logger.log.info("click on custom button");
	}

	@Then("^click on play button for custom operation$")
	public void click_on_play_button_for_custom_operation() throws Throwable {
		CustomPage custom_obj = new CustomPage();
		custom_obj.play_button();

//		Thread.sleep(10000);

		custom_logger.log.info("click on play button");
	}

	@Then("I perform assertion for custom evaluator")
	public void i_perform_assertion_for_custom_evaluator() {
		CustomPage custom_obj = new CustomPage();
		Assert.assertEquals(custom_obj.custom_page_title(), "Animation/Custom Evaluator");

		custom_logger.log.info("checkin whether page title correct or not");
	}

}
