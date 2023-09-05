package Practice_Sessions;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		
		//prompt alert
		Thread.sleep(4000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		WebElement ele = driver.findElement(By.id("promtButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("alright then");
		prompt.accept();
		Thread.sleep(2000);
		
		//alert to be present after 5 seconds
		WebElement timer  = driver.findElement(By.id("timerAlertButton"));
		
		js.executeScript("arguments[0].scrollIntoView();", timer);
		timer.click();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
	}
}
