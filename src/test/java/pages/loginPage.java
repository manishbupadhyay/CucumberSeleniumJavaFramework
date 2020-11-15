package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	
	By txt_username = By.xpath("//input[@placeholder='Username']");
	By txt_password = By.xpath("//input[@placeholder='Password']");
	By btn_login = By.xpath("//input[@value='Login']");
	
	// constructor
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(btn_login).click();
	}

}
