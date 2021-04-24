package com.hrm.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	public static WebDriver driver;
	public static WebDriver getBrowser(){
		if(Constants.browser.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else if(Constants.browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\TUSkY\\Downloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(Constants.browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TUSkY\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
		
	}
	
	

}
