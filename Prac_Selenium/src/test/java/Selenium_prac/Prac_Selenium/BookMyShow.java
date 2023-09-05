package Selenium_prac.Prac_Selenium;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
//		
//		
	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		//driver.get("https://selectorshub.com/xpath-practice-page/");
	//driver.switchTo().frame(1);
	//	 int size = driver.findElements(By.tagName("iframe")).size();
		
		 driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		WebElement present =  driver.findElement(By.xpath("//span[@class='sc-kZmsYB ekDEWP ellipsis']"));
		// new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(present));
		 
		//JavascriptExecutor jse =  (JavascriptExecutor)driver;
		
	//WebElement element = (WebElement) jse.executeScript("return document.querySelector(\"#modal-root > div > div > div > div.sc-bvTASY.hZBmDF > div > div > input\")");
	//String js = 	"arguments[0].setAttribute('value' , 'Tumkur')";
	//jse.executeScript(js,element);
		//WebElement cityName = driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']"));
		//cityName.sendKeys("Tumkur");
		//cityName.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-fQejPQ jWuMjc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobileNo")).sendKeys("9988888888");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		//div[text()='Enter OTP ']
	
Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Enter OTP ']")).isDisplayed());	
	}
}
