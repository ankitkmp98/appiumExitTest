package stepdefinition;

import java.util.concurrent.TimeUnit;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CloningPage;

public class CloningStep extends BaseTest
{

	@Given("^At first I open my animation page for cloning operation$")
	public void at_first_I_open_my_animation_page_for_cloning_operation() throws Throwable 
	{
		setup(); 			    
	}
	
	@Given("^I click on animation button for cloning operation$")
	public void i_click_on_animation_button_for_cloning_operation() throws Throwable 
	{
		CloningPage cloning_obj = new CloningPage();
		cloning_obj.animation_button();
	}


	@Then("^click on cloning button to perform operation$")
	public void click_on_cloning_button_to_perform_operation() throws Throwable 
	{
		CloningPage cloning_obj = new CloningPage();
		cloning_obj.cloning_button();
	}
	
	@Then("^click on run button$")
	public void click_on_run_button() throws Throwable 
	{
		CloningPage cloning_obj = new CloningPage();	
		cloning_obj.run_button();
		
		wd.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}
	
}
