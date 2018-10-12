package com.test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CalcTest {

	public static void main(String[] args) {
		
		try {
		AndroidDriver<WebElement> driver;
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setCapability("deviceName", "P8B4C18212085011");
		dc.setCapability("deviceName", "RGLZZDGUR8ZPIFLB");
		dc.setCapability("platformName", "Android");
		//dc.setCapability("platformVersion", "8.0.0");
		dc.setCapability("platformVersion", "6.0");
		dc.setCapability("appPackage", "com.android.calculator2");
		//dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		dc.setCapability("appActivity", "Calculator");
		
		/*URL url= new URL("http://127.0.0.1:4723//wd/hub", dc);
		driver= new AndroidDriver<WebElement>((Capabilities) url);*/
		
		System.out.println("****Android driver is going to be invoked*****");
	
			
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		System.out.println("***Android driver is invoked****");
		
		//RemoteWebDriver driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723//wd/hub"), dc);
		
		WebElement button0=driver.findElement(By.id("com.android.calculator2:id/digit0"));
		WebElement button1=driver.findElement(By.id("com.android.calculator2:id/digit1"));
		WebElement button2=driver.findElement(By.id("com.android.calculator2:id/digit2"));
		WebElement button3=driver.findElement(By.id("com.android.calculator2:id/digit3"));
		WebElement button4=driver.findElement(By.id("com.android.calculator2:id/digit4"));
		WebElement button5=driver.findElement(By.id("com.android.calculator2:id/digit5"));
		WebElement button6=driver.findElement(By.id("com.android.calculator2:id/digit6"));
		WebElement button7=driver.findElement(By.id("com.android.calculator2:id/digit7"));
		WebElement button8=driver.findElement(By.id("com.android.calculator2:id/digit8"));
		WebElement button9=driver.findElement(By.id("com.android.calculator2:id/digit9"));
		
		String xpathPlus="//android.widget.ImageButton[@content-desc=\"plus\"]" ;
		
		WebElement buttonPlus=driver.findElement(By.xpath(xpathPlus));
		
		
		button5.click();
		button8.click();
		buttonPlus.click(); 
		button6.click();
		buttonPlus.click(); 
		button9.click();
		
		Thread.sleep(3000);
		System.out.println("****Going to close the App******");

		driver.quit();
		
		System.out.println("******App is closed******");
		
		
		
		}catch(Exception e) {
			
		}
	
	}

}
