package Selenium_prac.Prac_Selenium;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindADoctor_ADH {

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

		// Find A Doctor
		driver.findElement(By.xpath("//span[contains(text(),'Find a Doctor')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='asc-select-dropdown-input-header-title placeholder'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'asc-select-dropdown-search-field')]"))
				.sendKeys("Cardiology");
		Thread.sleep(2000);
try {
		List<WebElement> specialityList = driver.findElements(By.xpath("//ul[@id='specialties']//li"));

		for (WebElement el : specialityList) {
			String spec = el.getText();
			specialityList = driver.findElements(By.xpath("//ul[@id='specialties']//li"));
			if (spec.equalsIgnoreCase("Cardiology")) {
				el.click();
				Thread.sleep(2000);

				break;

				
			}
		}
		
}catch(StaleElementReferenceException e) {
	driver.findElements(By.xpath("//ul[@id='specialties']//li"));
}

driver.findElement(By.xpath("//input[@class='fad-search-button']")).click();
		Thread.sleep(4000);

		// find a List of providers and click on Noa Holoshitz, MD form cardiology
		List<WebElement> providerList = driver.findElements(By.xpath("//div[@class='provider-results']//span//h2//a"));
		for (WebElement pl : providerList) {
			String providerName = pl.getText();
			if (providerName.equalsIgnoreCase("Noa Holoshitz, MD")) {
				pl.click();
			}
		}
	}

	}
