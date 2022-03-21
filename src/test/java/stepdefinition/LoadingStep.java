package stepdefinition;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoadingPage;

public class LoadingStep extends BaseTest
{

	@Given("^At first I open my animation page for loading operation$")
	public void at_first_I_open_my_animation_page_for_loading_operation() throws Throwable 
	{
		setup(); 	
	}
	
	@Given("^I click on animation button for loading operation$")
	public void i_click_on_animation_button_for_loading_operation() throws Throwable 
	{
		LoadingPage loading_obj = new LoadingPage();
		loading_obj.animation_button();			   
	}
	
	@Then("^click on loading button to perform operation$")
	public void click_on_loading_button_to_perform_operation() throws Throwable 
	{
		LoadingPage loading_obj = new LoadingPage();
		loading_obj.loading_button();
			    
	}
	
	@Then("^click on run button for loading operation$")
	public void click_on_run_button_for_loading_operation() throws Throwable 
	{
		LoadingPage loading_obj = new LoadingPage();
		loading_obj.run_button();			    
	}

}
