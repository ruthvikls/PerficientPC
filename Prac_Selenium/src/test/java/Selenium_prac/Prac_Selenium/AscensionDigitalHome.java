package Selenium_prac.Prac_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AscensionDigitalHome {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://healthcare.ascension.org/");
		waitFor(2);
		driver.findElement(By.xpath("//div[@class='current-location-div']")).click();
		waitFor(2);
		driver.findElement(By.xpath("(//input[@id='searchTextField'])[1]")).sendKeys("90202");
		waitFor(3);
		driver.findElement(By.xpath("//button[@class='js-search-btn button-primary']")).click();
		

	}
	
	public static void waitFor(long seconds) throws Exception {
		Thread.sleep(1000 * seconds);
		
	}

}
