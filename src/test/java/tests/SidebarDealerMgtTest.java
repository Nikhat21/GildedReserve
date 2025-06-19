package tests;

import org.testng.annotations.Test;

import Pages.DealerMgtPages;

import base.BaseTest;

public class SidebarDealerMgtTest extends BaseTest {
		
	
	public void dealerMgt() {
		
		DealerMgtPages dmp=new DealerMgtPages(driver);
		dmp.clickDealerMgt();
	}

}
