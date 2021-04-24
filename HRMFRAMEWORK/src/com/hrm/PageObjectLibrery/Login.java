package com.hrm.PageObjectLibrery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.genericlib.Browser;
import com.hrm.genericlib.Constants;
import com.hrm.genericlib.WebDriverCommonlib;

public class Login extends WebDriverCommonlib {
	@FindBy(id="txtUsername")
	  WebElement usernameedt;
	@FindBy(id="txtPassword")
	  WebElement passwordedt;
	@FindBy(id="btnLogin")
	  WebElement button;
	
public void LoginToApp(){
	WaitforpageToLoad();
	Browser.driver.get(Constants.URL);
	usernameedt.sendKeys(Constants.username);
	passwordedt.sendKeys(Constants.password);
	button.click();
	
}
	

}
