package stepdefinition;



import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HideShowAnimationPage;

public class AnimationHideStep extends BaseTest
{
	@Given("^At first I open my animation page for hide operation$")
	public void at_first_I_open_my_animation_page_for_hide_operation() throws Throwable 
	{
		//start();
		setup();    	    
	}

	@Given("^I click on animation button for hide operation$")
	public void i_click_on_animation_button_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.animation_button();
	}

	@Then("^click on hide and show buttons for hide operation$")
	public void click_on_hide_and_show_buttons_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.hide_and_show_button();
	    
	}

	@Then("^I checked box of custom animation box for hide operation$")
	public void i_checked_box_of_custom_animation_box_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.custom_animations_button();
	}

	@Then("^I checked box of hide box for hide operation$")
	public void i_checked_box_of_hide_box_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.hide_gone_button();
	   
	}

	@Then("^I click on number first number for hide operation$")
	public void i_click_on_number_first_number_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.number_0_button();
	   
	}

	@Then("^I click on number second number for hide operation$")
	public void i_click_on_number_second_number_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.number_1_button();
	}

	@Then("^I click on number third number for hide operation$")
	public void i_click_on_number_third_number_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.number_2_button();
	}

	@Then("^I click on number fourth number for hide operation$")
	public void i_click_on_number_fourth_number_for_hide_operation() throws Throwable 
	{
		HideShowAnimationPage ani_obj = new HideShowAnimationPage();
		ani_obj.number_3_button();
		
		Thread.sleep(5000);
		
//		Assert.assertTrue(false);
	}
	
	
	
	
	
	
	
}
