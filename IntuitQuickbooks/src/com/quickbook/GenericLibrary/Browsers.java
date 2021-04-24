package com.quickbook.GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	 static WebDriver driver;
	 
public static WebDriver getBrowser() {
	if(Constants.browser.equals("chrome")) {
	System.setProperty("Webdriver.chrome.driver", "/Users/troutray/Downloads/chromedriver");
	driver=new ChromeDriver();
	
	}
	
	else if(Constants.browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/troutray/Downloads");
		driver=new FirefoxDriver();
	}
	return driver;
	
}
	 
	
}
