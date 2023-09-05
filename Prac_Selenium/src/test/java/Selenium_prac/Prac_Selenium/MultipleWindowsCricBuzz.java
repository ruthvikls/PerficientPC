package Selenium_prac.Prac_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsCricBuzz {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.cricbuzz.com/");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='twitter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='youtube']")).click();

		String parentWindow = driver.getWindowHandle();

		Set<String> CW = driver.getWindowHandles();

		Iterator<String> it = CW.iterator();

		while (it.hasNext()) {
			String childWindow = it.next();

			if (!parentWindow.equals(childWindow)) {
				String titleOfPage = driver.switchTo().window(childWindow).getTitle();
				System.out.println(titleOfPage);
			}
		}
		System.out.println("********************************");
		String parentTitle = driver.switchTo().window(parentWindow).getTitle();
		System.out.println(parentTitle);

	}

}
