package com.hrm.PageObjectLibrery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.genericlib.WebDriverCommonlib;

public class Admin extends WebDriverCommonlib{
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminedt;
	@FindBy(id="menu_admin_UserManagement")
	WebElement usermanedt;
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement sysuser;
	@FindBy(xpath="//tr[td[a[text()='jakvrgjrj']]]/td[1]/input[@name='chkSelectRow[]']")
	WebElement chkbox;
	@FindBy(id="btnDelete")
	WebElement del;
	@FindBy(id="dialogDeleteBtn")
	WebElement buttondel;
	public void deluser(){
		adminedt.click();
		usermanedt.click();
		sysuser.click();
		chkbox.click();
		del.click();
		buttondel.click();
		WaitforpageToLoad();
		
		
	}
	
	

}
