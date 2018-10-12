package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class RecorderTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<WebElement> driver;

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "RGLZZDGUR8ZPIFLB");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "6.0");
		dc.setCapability("appPackage", "com.yulong.android.soundrecorder");	
		dc.setCapability("appActivity", "RecordNormalActivity");
		
		dc.setCapability("autoGrantPermissions", true);
		
		System.out.println("****Android driver is going to be invoked*****");
		
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("****Android driver is invoked and App is opened*****");
		

		WebElement startButton = driver.findElement(By.id("com.yulong.android.soundrecorder:id/start_btn"));

		System.out.println("***Start the recording***");
		startButton.click(); //start recording
		
		//Thread.sleep(3000); //record for 5 seconds
		
		WebElement stopButton=driver.findElement(By.id("com.yulong.android.soundrecorder:id/stop_btn"));
		
		System.out.println("***Stop the recording***");
		stopButton.click(); //stop recording
		
		String fileXpath="//android.widget.ImageView[@index=\"2\"]";		
		driver.findElement(By.xpath(fileXpath)).click();
		
		System.out.println("***closing the App***");

		driver.quit();
		
		System.out.println("Driver is closed");
	}

}
