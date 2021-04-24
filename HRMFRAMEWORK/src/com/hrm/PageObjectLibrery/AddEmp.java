package com.hrm.PageObjectLibrery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.genericlib.WebDriverCommonlib;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class AddEmp extends WebDriverCommonlib {
	@FindBy(id="firstName")
	WebElement fname;
	@FindBy(id="middleName")
	WebElement mname;
	@FindBy(id="lastName")
	WebElement lname;
	@FindBy(id="chkLogin")
	WebElement chkbox;
	@FindBy(id="user_name")
	WebElement username1;
	@FindBy(id="user_password")
	WebElement userpass;
	@FindBy(id="re_password")
	WebElement passre;
	@FindBy(id="btnSave")
	WebElement btns;
	public void Createempdetails(String finame,String miname,String laname,String username2,String password2,String repass2 ){
		fname.sendKeys(finame);
		mname.sendKeys(miname);
		lname.sendKeys(laname);
		chkbox.click();
		username1.sendKeys(username2);
		userpass.sendKeys(password2);
		passre.sendKeys(repass2);
		btns.click();
		WaitforpageToLoad();
		
	}
	
	
	
	

}
