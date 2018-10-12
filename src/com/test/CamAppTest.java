package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CamAppTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "RGLZZDGUR8ZPIFLB");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("plateformversion", "6.0");
		capabilities.setCapability("appPackage", "com.android.camera");
		capabilities.setCapability("appActivity", "Camera");
		
		System.out.println("****Launching the App****");
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		System.out.println("App is launched");
		driver.findElement(By.id("com.android.camera:id/camera_shutter_middle_button")).click();
		
		System.out.println("Picture is taken");
		
	}
}
