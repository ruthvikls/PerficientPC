package Selenium_prac.Prac_Selenium;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ADH_BasicTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://healthcare.ascension.org/");

		// set the location
		driver.findElement(By.xpath("//span[contains(text(),'Enter Your Location')]")).click();
		driver.findElement(By.id("searchTextField")).sendKeys("53226");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'js-search-btn button-primary')]")).click();
		Thread.sleep(2000);

		// assert the location entered
		final String locationEntered = "Wauwatosa, WI 53226";
		WebElement currentLocation = driver.findElement(By.xpath("//div[@class='current-location-div']//span"));
		String cL = currentLocation.getText();
		System.out.println(cL);
		Assert.assertEquals(locationEntered, cL);
		System.out.println("Entered Location Matches");

		// verify all the header links and ENdPoints
		List<WebElement> headerLinks = driver
				.findElements(By.xpath("//ul[contains(@class,'primary-navigation-heading')]//li"));

		

		for (WebElement hL : headerLinks) {
			hL.click();

			if (driver.getTitle().contains("Specialty Care")) {

				System.out.println("Specialty Care is visible");

				Thread.sleep(2000);

			} else if (driver.getTitle().contains("Find a Location")) {

				System.out.println("Find a Location is visible");

				Thread.sleep(2000);

			} else if (driver.getTitle().contains("Find a doctor")) {

				System.out.println("Find a doctor is visible");

				Thread.sleep(2000);

			} else if (driver.getTitle().contains("Schedule an Appointment")) {

				System.out.println("Schedule an Appointment is visible");

				Thread.sleep(2000);
			}

			driver.navigate().back();
		}
	}
}
