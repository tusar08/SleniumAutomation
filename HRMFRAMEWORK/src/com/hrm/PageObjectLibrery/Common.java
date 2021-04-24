package com.hrm.PageObjectLibrery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	@FindBy(id="welcome")
	WebElement logoutimage;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutlink;
	public void Logout(){
		logoutimage.click();
		logoutlink.click();
	}

}
