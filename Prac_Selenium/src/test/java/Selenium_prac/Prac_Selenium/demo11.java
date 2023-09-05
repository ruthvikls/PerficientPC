package Selenium_prac.Prac_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo11 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//span[text()='twitter']")).click();
		 System.out.println(driver.getTitle());
}
}
