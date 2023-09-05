package Selenium_prac.Prac_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NBA {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sportingnews.com/in/nba?gr=www");

		List<WebElement> topMenu = driver.findElements(By.xpath("//div[@class='nba-menu-inner']//ul//a"));
		Thread.sleep(2000);
		for (WebElement menu : topMenu) {
			String title = menu.getText();

			if (title.equalsIgnoreCase("Standings")) {

				menu.click();
				Thread.sleep(2000);
				String currentURL = driver.getCurrentUrl();
				String scheduleURL = "https://in.global.nba.com/standings/";
				Assert.assertEquals(currentURL, scheduleURL);
			}
		

		}

	}

}
