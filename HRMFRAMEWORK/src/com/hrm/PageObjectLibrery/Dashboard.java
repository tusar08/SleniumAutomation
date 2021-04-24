package com.hrm.PageObjectLibrery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.genericlib.WebDriverCommonlib;

public class Dashboard extends WebDriverCommonlib {
   @FindBy(id="menu_dashboard_index")
    WebElement dash;
   @FindBy(id="menu_pim_viewPimModule")
    WebElement pimmodu;
   public void GotoPIMpage(){
	   pimmodu.click();
	   WaitforpageToLoad();
   }
   
}
