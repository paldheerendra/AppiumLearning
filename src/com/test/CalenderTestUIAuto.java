package com.test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.appium.java_client.android.AndroidDriver;

public class CalenderTestUIAuto extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<WebElement> androiddriver;

		String apppackage = "com.yulong.android.calendar";

		String appActivity = "ui.MenuAnimationActivity";

		androiddriver = (AndroidDriver<WebElement>) initializeApp(apppackage, appActivity);

		System.out.println("***Android driver is invoked****");

		String xpath22 = "//android.view.View[@index=\"5\" and @instance=\"20\"]";

		System.out.println("***Finding Element 14****");

		Thread.sleep(3000);

		androiddriver.findElement(By.xpath(xpath22)).click();

		System.out.println("***Clicked on 14****");

		quitDriver();

	}

}
