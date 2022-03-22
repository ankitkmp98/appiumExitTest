package stepdefinition;

import org.testng.Assert;

import Runner.LoggerHelper;
import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MultiplePropertiesPage;

public class MultiplePropertiesStep extends BaseTest {

	LoggerHelper multiple_logger = new LoggerHelper("Animation multiple logger");

	@Given("^At first I open my animation page for multiple operation$")
	public void at_first_I_open_my_animation_page_for_multiple_operation() throws Throwable {
		setup();

		multiple_logger.log.info("opening animation page");
	}

	@Given("^I click on animation button for multiple operation$")
	public void i_click_on_animation_button_for_multiple_operation() throws Throwable {
		MultiplePropertiesPage multi_obj = new MultiplePropertiesPage();
		multi_obj.animation_button();

		multiple_logger.log.info("click on animation button");
	}

	@Then("^click on multiple properties button to perform operation$")
	public void click_on_multiple_properties_button_to_perform_operation() throws Throwable {
		MultiplePropertiesPage multi_obj = new MultiplePropertiesPage();
		multi_obj.multiple_properties_button();

		multiple_logger.log.info("click on multiple properties button");
	}

	@Then("^click on run button for multiple operation$")
	public void click_on_run_button_for_multiple_operation() throws Throwable {
		MultiplePropertiesPage multi_obj = new MultiplePropertiesPage();
		multi_obj.run_button();

//		Thread.sleep(5000);

		multiple_logger.log.info("click on run button");
	}

	@Then("I perform assertion for multiple properties operation")
	public void i_perform_assertion_for_multiple_properties_operation() {
		MultiplePropertiesPage multi_obj = new MultiplePropertiesPage();
		Assert.assertEquals(multi_obj.multiple_properties_page_title(), "Animation/Multiple Properties");

		multiple_logger.log.info("checkin whether page title correct or not");
	}

}
