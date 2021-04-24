package com.hrm.adminTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrm.PageObjectLibrery.AddEmp;
import com.hrm.PageObjectLibrery.Admin;
import com.hrm.PageObjectLibrery.Common;
import com.hrm.PageObjectLibrery.Dashboard;
import com.hrm.PageObjectLibrery.EmployeeInfo;
import com.hrm.PageObjectLibrery.Login;
import com.hrm.genericlib.Browser;
import com.hrm.genericlib.Constants;
import com.hrm.genericlib.ExcellLib;
import com.hrm.genericlib.WebDriverCommonlib;



public class Deletuser  {
	ExcellLib elib=new ExcellLib();
	WebDriverCommonlib wlib=new WebDriverCommonlib();
	WebDriver driver=Browser.getBrowser();
	Login loginpage=PageFactory.initElements(driver, Login.class);
	Dashboard dashboardpage=PageFactory.initElements(driver, Dashboard.class);
	EmployeeInfo infoemppage=PageFactory.initElements(driver, EmployeeInfo.class);
	AddEmp addemppage=PageFactory.initElements(driver, AddEmp.class);
	Common compage=PageFactory.initElements(driver, Common.class);
	Admin adminpage=PageFactory.initElements(driver, Admin.class);
	
	@Test
	public void deluserTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		driver.get(Constants.URL);
		wlib.WaitforpageToLoad();
		String finame=elib.getExcellData("sheet1", 1, 7);
		String miname=elib.getExcellData("sheet1", 1, 8);
		String laname=elib.getExcellData("sheet1", 1, 9);
		loginpage.LoginToApp();
		adminpage.deluser();
		wlib.WaitforpageToLoad();
		
		
		
	}
	
	

}
