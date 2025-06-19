package tests;


import org.testng.annotations.Test;

import Pages.DealerMgtPages;
import Pages.LoginPage;
import base.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void testLogin() throws InterruptedException {
		driver.get("https://sandbox.admin.gildedreserve.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("mohammadsaad.mantiqh@gmail.com", "Test@1234");
        Thread.sleep(3000);
        DealerMgtPages dealerPage = new DealerMgtPages(driver);
        dealerPage.clickDealerMgt();
       // Thread.sleep(3000);
        dealerPage.createDealer();
        dealerPage.enterCompanyName("TestCompany001");
        dealerPage.entercontactName("TestContactName");
        dealerPage.enterphoneNumber("1212122323");
        dealerPage.enteremail("testing001@gmail.com");
        dealerPage.enterstreetAddress("test");
        dealerPage.entercity("Edmonton");
        
        		
        
      
	}
	
	
}



