package stepDefinitions;

import org.junit.Assert;

import com.Pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private static String LoginpageTitle;
	private static String homepageTitle;
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		LoginpageTitle = loginpage.getPageTitle();
		System.out.println("The Login page titile is : " + LoginpageTitle);

	}

	@Then("the title of the page should be {string}")
	public void the_title_of_the_page_should_be(String expectedTitle) {
		Assert.assertTrue(LoginpageTitle.contains(expectedTitle));
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginpage.setUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginpage.setPasswordName(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginpage.clickLoginBtn();

	}

	@Then("User gets the title of the homepage")
	public void user_gets_the_title_of_the_homepage() {
		 homepageTitle = loginpage.getPageTitle();
		//String homepageURL = loginpage.getCurrentURl();
		System.out.println("The Home page titile is : " + homepageTitle);
	}

	@Then("homepage title should be {string}")
	public void homepage_title_should_be(String hptitle) {
		Assert.assertTrue(homepageTitle.contains(hptitle));
		
	}

}
