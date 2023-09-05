package AscensionProviderLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProviderStage {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.ascensiononlinecare.org:8444/loginPhysician.htm");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("John.Doe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(4000);
		String continueSession = driver.findElement(By.xpath("//div[@class='concurrentHeader fontI32']")).getText();
		if(driver.getPageSource().contains(continueSession)) {
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		}
		else
		{
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
		}
	}

}
