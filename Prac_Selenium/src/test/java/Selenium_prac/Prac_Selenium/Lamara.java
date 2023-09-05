package Selenium_prac.Prac_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lamara {

	public static void main(String[] args) {

		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().window().maximize();

		driver.get("https://lamara.in/#");
		System.out.println(driver.getTitle());
		WebElement finalElement = driver.findElement(By.xpath("//h5[contains(text(),'Information')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", finalElement);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Thread.sleep(2000);
		driver.close();

		// driver.findElement(By.xpath("//h5[contains(text(),'Brownies')]")).click();

	}

}
