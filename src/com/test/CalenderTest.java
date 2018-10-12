package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CalenderTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		AndroidDriver<WebElement> driver;
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setCapability("deviceName", "P8B4C18212085011");
		dc.setCapability("deviceName", "RGLZZDGUR8ZPIFLB");
		dc.setCapability("platformName", "Android");
		//dc.setCapability("platformVersion", "8.0.0");
		dc.setCapability("platformVersion", "6.0");
		dc.setCapability("appPackage", "com.yulong.android.calendar");
		//dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		dc.setCapability("appActivity", "ui.MenuAnimationActivity");		
			
		System.out.println("****Android driver is going to be invoked*****");
				
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		System.out.println("***Android driver is invoked****");
		
		
		String xpath22="//android.view.View[@index=\"5\" and @instance=\"20\"]" ;
		
		System.out.println("***Finding Element 14****");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(xpath22)).click();
		
		System.out.println("***Clicked on 14****");
		
		driver.quit();

	}

}
