package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealerMgtPages {
	 WebDriver driver;
	 
	 public DealerMgtPages(WebDriver driver) {
			this.driver=driver;
		}

	 By sidebarDealerMgt = By.xpath("//*[@id=\"Dealer's Management\"]");
	 By addNewDealer = By.xpath("//*[@id=\"add-new-dealer\"]");
	 By companyName = By.xpath("//input[@name='companyName']");
	 By contactName = By.xpath("//input[@name='contactName']");
	 By phoneNumber = By.xpath("//input[@name='phoneNumber']");
	 By email = By.xpath("//input[@name='email']");
	 By streetAddress = By.xpath("//input[@name='streetAddress']");
	 By city = By.xpath("//input[@name='city']");
	 
	
	
	public void clickDealerMgt() {
		driver.findElement(sidebarDealerMgt).click();
		
	}
	
	public void createDealer() {
		driver.findElement(addNewDealer).click();
		
	}
	
	public void enterCompanyName(String company) {
		driver.findElement(companyName).sendKeys(company);
		
	}
	public void entercontactName(String contact) {
		driver.findElement(contactName).sendKeys(contact);
		
	}
	public void enterphoneNumber(String phone) {
		driver.findElement(phoneNumber).sendKeys(phone);
		
	}
	public void enteremail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
		
	}
	public void enterstreetAddress(String address) {
		driver.findElement(streetAddress).sendKeys(address);
		
	}
	public void entercity(String cityName) {
		driver.findElement(city).sendKeys(cityName);
		
	}
	
	
	
}


