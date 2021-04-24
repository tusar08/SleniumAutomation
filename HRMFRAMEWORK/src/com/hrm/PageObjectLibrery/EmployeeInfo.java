package com.hrm.PageObjectLibrery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.genericlib.WebDriverCommonlib;

public class EmployeeInfo extends WebDriverCommonlib {
	@FindBy(id="menu_pim_addEmployee")
	WebElement addemp;
	
	public void navigateToAddEmpPage(){
		addemp.click();
		WaitforpageToLoad();
	}
	
	
	

}
