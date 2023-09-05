package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoLogin {
	WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@When("Title of the page is {string}")
	public void title_of_the_page_is(String string) {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, string);

	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws Exception {
		driver.findElement(By.id("user-name")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		Thread.sleep(2000);
	}

	@Then("clicks on SignIn btn")
	public void clicks_on_sign_in_btn() throws Exception {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("User is on the homePage {string}")
	public void user_is_on_the_home_page(String string) {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, string);
		 System.out.println("valid Scenario Succesfully passed");
	}
	
	@Then("User is Prompted with an {string}")
	public void user_is_prompted_with_an(String string) throws Exception {
	 Boolean errorMessage =  driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']")).isDisplayed();
	    Assert.assertTrue(errorMessage);
	    System.out.println("Invalid Scenario Succesfully passed");
	    Thread.sleep(2000);
	    
	}

	@Then("User is Prompted with an when no credentials is entered {string}")
	public void user_is_prompted_with_an_when_no_credentials_is_entered(String string) {
		Boolean errorMessageWithoutCred =  driver.findElement(By.xpath("//div[@class='error-message-container error']")).isDisplayed();
	    Assert.assertTrue(errorMessageWithoutCred);
	    System.out.println("Invalid Scenario Succesfully passed with no credentials entered");
	}
	
	@Then("User is Prompted with an {string} message when only username is entered")
	public void user_is_prompted_with_an_message_when_only_username_is_entered(String string) {
		Boolean errorMessageWithoutPassword =  driver.findElement(By.xpath("//div[@class='error-message-container error']")).isDisplayed();
	    Assert.assertTrue(errorMessageWithoutPassword);
	    System.out.println("Invalid Scenario Succesfully passed with no credentials entered");
	}

}
