package Selenium_prac.Prac_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		System.out.println(driver.getTitle());
		
		WebElement drp = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(drp).build().perform();
		Thread.sleep(2000);
		//WebElement training = driver.findElement(By.xpath("//a[contains(text(),'Try TestCase Studio')]"));
		//training.click();
		
	WebElement pickaDate = 	driver.findElement(By.xpath("//input[contains(@id,'datepicker')]"));
	pickaDate.clear();
			pickaDate.sendKeys("22/03/2015");
	}

}
