package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class CustomPage extends BaseTest	
{
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
	
	public CustomPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement animation_button;	
	public void animation_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(animation_button))).perform();
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Custom Evaluator\"]")
	public MobileElement custom_button;	
	public void custom_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Custom Evaluator\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(custom_button))).perform();
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Play\"]")
	public MobileElement play_button;	
	public void play_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"Play\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(play_button))).perform();
	}
	
}





