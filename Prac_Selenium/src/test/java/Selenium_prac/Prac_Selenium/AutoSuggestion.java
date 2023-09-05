package Selenium_prac.Prac_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("refrigerator ");
		Thread.sleep(2000);
		List<WebElement> drpdwn = driver.findElements(By.xpath("//ul[contains(@class,'col-12-12 _1MRYA1 _38UFBk')]//li"));
		
		for(WebElement drp:drpdwn) {
			String drop = drp.getText();
			System.out.println(drop);
			if(drop.equalsIgnoreCase("refrigerator stand")) {
				drp.click();
			}
		}

	}

}
