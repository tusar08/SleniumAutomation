package com.hrm.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonlib {
	public void WaitforpageToLoad(){
		Browser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
public void WaitforElementPresent(WebElement dobj){
	WebDriverWait wait=new WebDriverWait(Browser.driver, 10);
}

}
