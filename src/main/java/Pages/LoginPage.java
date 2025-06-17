package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;

private By usernameInput=By.xpath("//input[@placeholder='Enter your username']");
private By passwordInput=By.xpath("//input[@placeholder='Enter your password']");
private By loginButton=By.xpath("//button[@type='submit']");

public LoginPage(WebDriver driver) {
	this.driver=driver;
}

public void enterUsername(String username) {
	driver.findElement(usernameInput).sendKeys(username);
}

public void enterPassword(String password) {
	driver.findElement(passwordInput).sendKeys(password);
}
	
public void clickLogin() {
	driver.findElement(loginButton).click();
}

public void loginAs(String username, String password) {
    enterUsername(username);
    enterPassword(password);
    clickLogin();
}
}
