package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTest2 {
	WebDriver driver;

	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@When("user enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String uname, String pwd) {
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {

		String loginPageTitle = "https://www.saucedemo.com/";
		String homePageTitle = "https://www.saucedemo.com/inventory.html";
		if (driver.getCurrentUrl().equalsIgnoreCase(homePageTitle)) {
			driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
		} else if (driver.getCurrentUrl().equalsIgnoreCase(loginPageTitle)) {
			driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface')]")).isDisplayed();
		}
	}

	@Then("application should be closed")
	public void application_should_be_closed() {
		driver.quit();
	}

}
