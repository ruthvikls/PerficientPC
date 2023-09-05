package Selenium_prac.Prac_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/auction");
		WebElement teams = driver.findElement(By.xpath("(//a[text()='Teams'])[2]"));

		Actions action = new Actions(driver);

		action.moveToElement(teams).build().perform();
		
		//action.keyDown(Keys.ARROW_DOWN).click().build().perform();
		
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[2]"));
		men.click();
		

	}

}
