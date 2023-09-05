package Selenium_prac.Prac_Selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

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
		//twitter.click();
		
		Set<String> twitterWindow = driver.getWindowHandles();
		Iterator<String> it = twitterWindow.iterator();
		
		while (it.hasNext()) {
			String child = it.next();
			if (!parentWindow.equals(child)) {
				String titleOfPage = driver.switchTo().window(child).getTitle();
				
				System.out.println(titleOfPage);
			}
			
		}
		System.out.println("***************************************");
		String parentTitle = driver.switchTo().window(parentWindow).getTitle();
		System.out.println(parentTitle);
	}

}
