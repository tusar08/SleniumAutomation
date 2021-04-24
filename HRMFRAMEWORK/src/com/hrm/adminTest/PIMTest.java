package com.hrm.adminTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
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
@Listeners(com.hrm.genericlib.ScreenshotTest.class)
public class PIMTest {
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
	public void CreatEmpTest() throws Throwable{
		
		driver.get(Constants.URL);
		loginpage.LoginToApp();
		wlib.WaitforpageToLoad();
		
		String finame=elib.getExcellData("sheet1", 1, 4);
		String miname=elib.getExcellData("sheet1", 1, 5);
		String laname=elib.getExcellData("sheet1", 1, 6);
		String username2=elib.getExcellData("sheet1", 1, 7);
		String password2=elib.getExcellData("sheet1", 1, 8);
		String repass2=elib.getExcellData("sheet1", 1, 9);
		dashboardpage.GotoPIMpage();
		infoemppage.navigateToAddEmpPage();
		addemppage.Createempdetails(finame, miname, laname,username2,password2,repass2);
		
		compage.Logout();
		
	}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

	
