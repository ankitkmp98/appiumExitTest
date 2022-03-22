package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class HideShowAnimationPage extends BaseTest {
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);

	AndroidDriver<MobileElement> driver;

	public HideShowAnimationPage() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement animation_button;

	public void animation_button() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(animation_button))).perform();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")
	public MobileElement hide_and_show_button;

	public void hide_and_show_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hide_and_show_button))).perform();
	}

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Custom Animations\"]")
	public MobileElement custom_animations_button;

	public void custom_animations_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//android.widget.CheckBox[@content-desc=\"Custom Animations\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(custom_animations_button))).perform();
	}

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Hide (GONE)\"]")
	public MobileElement hide_gone_button;

	public void hide_gone_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//android.widget.CheckBox[@content-desc=\"Hide (GONE)\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hide_gone_button))).perform();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement number_0_button;

	public void number_0_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(number_0_button))).perform();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement number_1_button;

	public void number_1_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(number_1_button))).perform();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement number_2_button;

	public void number_2_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(number_2_button))).perform();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement number_3_button;

	public void number_3_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(number_3_button))).perform();
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Show Buttons\"]")
	public MobileElement show_button;

	public void show_button() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"Show Buttons\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(show_button))).perform();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement hide_and_show_title;

	public String hide_and_show_title() {
		String result = hide_and_show_title.getText();
		return result;
	}

}
