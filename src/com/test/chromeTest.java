package com.test;

import Utilities.Base;
import io.appium.java_client.android.AndroidDriver;

public class chromeTest extends Base {

	public static void main(String[] args) throws InterruptedException {

		AndroidDriver<?> androidDriver;

		String apppackage = "com.android.chrome";

		String appActivity = "com.google.android.apps.chrome.Main";

		androidDriver = (AndroidDriver<?>) initializeChrome(apppackage, appActivity);

		androidDriver.get("http://www.google.com");
		
		
		quitDriver();

	}

}
