package StepForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {
	WebDriver driver = null;
	
	@Before
	public void browserSetup() {
		System.out.println("===== I'm Inside browserSetup =====");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		System.out.println("===== I'm Inside tearDown =====");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("===== I'm Inside beforeSteps =====");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("===== I'm Inside afterSteps =====");
	}

	@Given("User is on the login page")
	public void User_is_on_the_login_page() {
		System.out.println("Inside Step - user is on the login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("Inside Step - user enters valid username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step - user click on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is navigated to home page");
	}

}
