package Selenium_prac.Prac_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NAV_SeleniumSeries {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		//driver.get("https://www.google.com/?&bih=657&biw=1366&hl=en");
		
		
		driver.switchTo().frame(0);
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		
		WebElement element = (WebElement) jse.executeScript("return document.querySelector(\"#california\")");
	//	jse.executeScript("arguments[0].scrollIntoView();", element);
		jse.executeScript("arguments[0].click();",element);
		//element.click();
		//jse.executeScript("document.getElementById('california').click()",element);
		
		//document.getElementById('gbqfb').click();
		
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement listLinks:links) {
			System.out.println(listLinks.getText() +" --> "+listLinks.getAttribute("href"));
		}
	}

}
