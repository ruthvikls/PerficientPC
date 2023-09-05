package Selenium_prac.Prac_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2Xpaths {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://ascensiononlinecare.org/landing.htm");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'first')]")).sendKeys("Johansson");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'last')]")).sendKeys("Rogers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'emailAddress')]")).sendKeys("jo.Rogers@gam.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'emailAddress2')]")).sendKeys("jo.Rogers@gam.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'password1')]")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'disclaimerAccept')]")).click();
	}

}
