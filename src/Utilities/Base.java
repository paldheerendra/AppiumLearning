package Utilities;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Base {

	static AndroidDriver<?> androidDriver;

	public static AndroidDriver<?> initializeApp(String appPackageValue, String appActivityValue) {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "RGLZZDGUR8ZPIFLB");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("appPackage", appPackageValue);
		capabilities.setCapability("appActivity", appActivityValue);
		capabilities.setCapability("autoGrantPermissions", true);

		try {

			System.out.println("****Android driver is going to be invoked*****");

			androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return androidDriver;
	}

	public static AndroidDriver<?> initializeChrome(String appPackageValue, String appActivityValue) {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "RGLZZDGUR8ZPIFLB");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("appPackage", appPackageValue);
		capabilities.setCapability("appActivity", appActivityValue);

		capabilities.setCapability("browserName", "Chrome");

		try {
			System.out.println("****Browser is going to be invoked*****");

			androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		return androidDriver;
	}

	public static void quitDriver() {

		androidDriver.closeApp();

		androidDriver.quit();

	}
}
