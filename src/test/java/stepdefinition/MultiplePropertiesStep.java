package stepdefinition;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MultiplePropertiesPage;

public class MultiplePropertiesStep extends BaseTest
{

	@Given("^At first I open my animation page for multiple operation$")
	public void at_first_I_open_my_animation_page_for_multiple_operation() throws Throwable 
	{
		setup(); 			
	}
	
	@Given("^I click on animation button for multiple operation$")
	public void i_click_on_animation_button_for_multiple_operation() throws Throwable 
	{
		MultiplePropertiesPage multi_obj = new MultiplePropertiesPage();
		multi_obj.animation_button();			    
	}
	
	@Then("^click on multiple properties button to perform operation$")
	public void click_on_multiple_properties_button_to_perform_operation() throws Throwable 
	{
		MultiplePropertiesPage multi_obj = new MultiplePropertiesPage();
		multi_obj.multiple_properties_button();			    
	}
	
	@Then("^click on run button for multiple operation$")
	public void click_on_run_button_for_multiple_operation() throws Throwable 
	{
		MultiplePropertiesPage multi_obj = new MultiplePropertiesPage();
		multi_obj.run_button();			    
	}
	
}

