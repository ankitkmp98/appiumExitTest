package stepdefinition;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CustomPage;

public class CustomStep extends BaseTest
{

	@Given("^At first I open my animation page for custom operation$")
	public void at_first_I_open_my_animation_page_for_custom_operation() throws Throwable 
	{
		setup(); 		   
	}
	
	@Given("^I click on animation button for custom operation$")
	public void i_click_on_animation_button_for_custom_operation() throws Throwable 
	{
		CustomPage custom_obj = new CustomPage();
		custom_obj.animation_button();	   
	}
	
	@Then("^click on custom button to perform operation$")
	public void click_on_custom_button_to_perform_operation() throws Throwable 
	{
		CustomPage custom_obj = new CustomPage();
		custom_obj.custom_button();
	}
	
	@Then("^click on play button for custom operation$")
	public void click_on_play_button_for_custom_operation() throws Throwable 
	{
		CustomPage custom_obj = new CustomPage();
		custom_obj.play_button();
	}

}
