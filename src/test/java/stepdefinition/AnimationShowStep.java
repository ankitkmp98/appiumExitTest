package stepdefinition;

import org.testng.Assert;

import Runner.LoggerHelper;
import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HideShowAnimationPage;

public class AnimationShowStep extends BaseTest {
	LoggerHelper show_logger = new LoggerHelper("Animation show logger");

	@Given("^At first I open the page for show operation$")
	public void at_first_I_open_the_page_for_show_operation() throws Throwable {
		setup();

		show_logger.log.info("opening animation page");
	}

	@Given("^At first I perform all hide operations$")
	public void at_first_I_perform_all_hide_operations() throws Throwable {
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.animation_button();
		ani_obj.hide_and_show_button();
		ani_obj.custom_animations_button();
		ani_obj.hide_gone_button();
		ani_obj.number_0_button();
		ani_obj.number_1_button();
		ani_obj.number_2_button();
		ani_obj.number_3_button();

		show_logger.log.info("I perform hide operation");
	}

	@Then("^I unchecked box of custom animation box for show operation$")
	public void i_unchecked_box_of_custom_animation_box_for_show_operation() throws Throwable {
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.custom_animations_button();

		show_logger.log.info("unchecked box of custom animation box");
	}

	@Then("^I unchecked box of hide box for show operation$")
	public void i_unchecked_box_of_hide_box_for_show_operation() throws Throwable {
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.hide_gone_button();

		Thread.sleep(4000);

		show_logger.log.info("unchecked box of hide box");
	}

	@Then("^I click on show buttons for show operation$")
	public void i_click_on_show_buttons_for_show_operation() throws Throwable {
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.show_button();

//		Thread.sleep(4000);

		show_logger.log.info("click on show buttons");
	}

	@Then("I perform assertion for show operation")
	public void i_perform_assertion_for_show_operation() {
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();

		Assert.assertEquals(ani_obj.hide_and_show_title(), "Animation/Hide-Show Animations");

		show_logger.log.info("checkin whether page title correct or not");
	}

}
