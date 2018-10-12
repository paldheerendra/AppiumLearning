package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TouchActionTest {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver driver;

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "RGLZZDGUR8ZPIFLB");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "6.0");
		dc.setCapability("appPackage", "com.yulong.android.launcherL");
		dc.setCapability("appActivity", "Launcher");

		dc.setCapability("autoGrantPermissions", true);

		System.out.println("****Android driver is going to be invoked*****");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println("****Android driver is invoked and App is opened*****");

		WebElement googleSearch = driver
				.findElement(By.id("com.google.android.googlequicksearchbox:id/hint_text_alignment"));
		googleSearch.click();
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[@content-desc=\"Google Search\"]/android.widget.EditText"))
				.sendKeys("SQS india");

		/*
		 * String
		 * irctcXpath="//android.widget.TextView[@content-desc=\"IRCTC Rail Connect\"]";
		 * 
		 * WebElement irctcEle=driver.findElement(By.xpath(irctcXpath));
		 * 
		 * TouchAction action=new TouchAction(driver);
		 */

		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		// Find x1 point which is at right side of screen.
		int x1 = (int) (size.width * 0.20);
		// Find x2 point which is at left side of screen.
		int x2 = (int) (size.width * 0.80);

		// action.press(irctcEle).moveTo(x1,580).release().perform();

	}

}
