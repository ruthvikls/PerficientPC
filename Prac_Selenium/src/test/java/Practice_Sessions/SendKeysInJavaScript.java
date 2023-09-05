package Practice_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysInJavaScript {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		WebElement loginName = driver.findElement(By.id("user-name"));
				loginName	.sendKeys("standard_user");
				Thread.sleep(4000);
		WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce");
				Thread.sleep(4000);
		//JavascriptExecutor js =  (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].value='standard_user'", loginName);
	//	js.executeScript("arguments[0].value='secret_sauce'", password);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		//dropdown
		WebElement dropDown = driver.findElement(By.className("product_sort_container"));
		dropDown.click();
		Select slt = new Select(dropDown);
		
		slt.selectByValue("za");
		
		
		
		
		
	}

}
