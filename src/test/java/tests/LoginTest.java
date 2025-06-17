package tests;


import org.testng.annotations.Test;
import base.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testLogin() {
		driver.get("https://sandbox.admin.gildedreserve.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("mohammadsaad.mantiqh@gmail.com", "Test@1234");
	}

}
