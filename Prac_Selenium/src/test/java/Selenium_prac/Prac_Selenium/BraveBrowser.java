package Selenium_prac.Prac_Selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BraveBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			ChromeOptions cp = new ChromeOptions();
			cp.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			
			WebDriver driver=new ChromeDriver(cp);
		    driver.get("https://www.google.com/");
			
	}

	public void waitFor(int seconds)
	{
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	

}
