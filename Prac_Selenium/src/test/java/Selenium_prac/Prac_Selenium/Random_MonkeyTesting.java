package Selenium_prac.Prac_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Random_MonkeyTesting {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		// Thread.sleep(1500);
		List<WebElement> footerLinks = driver
				.findElements(By.xpath("//div[@id='nav-xshop']//a"));
		Thread.sleep(1500);
		int footerSize = footerLinks.size();
		Thread.sleep(1500);
		System.out.println("The Size of the Links are : " + footerSize);

		for (int i = 0; i < footerSize; i++) {
			int randomLink = (int) Math.floor(Math.random() * footerSize);

			System.out.println("Link Number : " + randomLink);

			WebElement element = footerLinks.get(randomLink);

			System.out.println(element.getText());
			element.click();
			driver.navigate().back();
			Thread.sleep(1500);
			footerLinks = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
		}
	}

}
