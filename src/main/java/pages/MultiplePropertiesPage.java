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

public class MultiplePropertiesPage extends BaseTest {
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);

	public MultiplePropertiesPage() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement animation_button;

	public void animation_button() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(animation_button))).perform();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Multiple Properties\"]")
	public MobileElement multiple_properties_button;

	public void multiple_properties_button() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//android.widget.TextView[@content-desc=\"Multiple Properties\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(multiple_properties_button))).perform();
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Run\"]")
	public MobileElement run_button;

	public void run_button() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"Run\"]")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(run_button))).perform();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement multiple_properties_page_title;

	public String multiple_properties_page_title() {
		String result = multiple_properties_page_title.getText();
		return result;
	}

}
