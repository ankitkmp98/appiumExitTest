package base;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	public static AppiumDriver<MobileElement> wd = null;
	protected static AppiumDriverLocalService service;

	public void start() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	public void setup() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "MyAndroid");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		capabilities.setCapability("app", "./Test app/ApiDemos-debug.apk");

		try {
			wd = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stopAppium() {
		wd.quit();
	}

	public void closeService() {
		service.stop();
	}

}
