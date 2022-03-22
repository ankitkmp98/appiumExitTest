package stepdefinition;

import org.testng.Assert;

import Runner.LoggerHelper;
import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoadingPage;

public class LoadingStep extends BaseTest {
	LoggerHelper loading_logger = new LoggerHelper("Animation loading logger");

	@Given("^At first I open my animation page for loading operation$")
	public void at_first_I_open_my_animation_page_for_loading_operation() throws Throwable {
		setup();

		loading_logger.log.info("opening animation page");
	}

	@Given("^I click on animation button for loading operation$")
	public void i_click_on_animation_button_for_loading_operation() throws Throwable {
		LoadingPage loading_obj = new LoadingPage();
		loading_obj.animation_button();

		loading_logger.log.info("click on animation button");
	}

	@Then("^click on loading button to perform operation$")
	public void click_on_loading_button_to_perform_operation() throws Throwable {
		LoadingPage loading_obj = new LoadingPage();
		loading_obj.loading_button();

		loading_logger.log.info("click on loading button");

	}

	@Then("^click on run button for loading operation$")
	public void click_on_run_button_for_loading_operation() throws Throwable {
		LoadingPage loading_obj = new LoadingPage();
		loading_obj.run_button();

//		Thread.sleep(5000);

		loading_logger.log.info("click on run button");
	}

	@Then("I perform assertion for loading operation")
	public void i_perform_assertion_for_loading_operation() {
		LoadingPage loading_obj = new LoadingPage();
		Assert.assertEquals(loading_obj.loading_page_title(), "Animation/Loading");

		loading_logger.log.info("checkin whether page title correct or not");
	}

}
