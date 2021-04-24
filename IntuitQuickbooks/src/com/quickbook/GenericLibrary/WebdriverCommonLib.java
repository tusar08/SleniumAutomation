package com.quickbook.GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLib {

	public void waitforpagetoload () {
		Browsers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
	public void waitforElementToBePresent() {
		WebDriverWait wait= new WebDriverWait(Browsers.driver,20);
		//wait.until(ExpectedConditions.visibilityOf(Obj));
	}

}
