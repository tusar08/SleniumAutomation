package com.hrm.genericlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class ReportLib { 
	
	public void getscreenshot(String fileName) throws IOException{
		
		
		EventFiringWebDriver ed=new EventFiringWebDriver(Browser.driver);
		File srcfile=ed.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\TUSkY\\WebDriver\\HRMFRAMEWORK\\Screenshot");
	    org.apache.commons.io.FileUtils.copyFile(srcfile, destfile);
	    
		
		}
	    
		
	}


