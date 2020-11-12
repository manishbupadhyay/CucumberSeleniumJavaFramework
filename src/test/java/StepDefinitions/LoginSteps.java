package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
	WebDriver driver = null;

	@Given("use has opened the browser")
	public void use_has_opened_the_browser() {
		System.out.println("Inside Step - use has opened the browser");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step - user is on login page");
		driver.navigate().to("https://classic.freecrm.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password ) throws InterruptedException {
		System.out.println("Inside step - user enters username and password");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(4000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - clicks on login button");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside step - user is navigated to home page");
		String pageTitle = driver.getTitle();
		Assert.assertEquals("CRMPRO", pageTitle);
		driver.close();
		driver.quit();
	}

}
