package AscensionProviderLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProviderProd {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ascensiononlinecare.org/loginPhysician.htm");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ascension.demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vcteam2020!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		
		if(driver.getTitle().equalsIgnoreCase("End Previous Session")) {
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
		}
		else if(driver.getTitle().equalsIgnoreCase("Practice Availability")) {
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
		}
	}

}
