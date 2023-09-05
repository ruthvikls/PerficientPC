package AppiumProjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class FirstAppium_RS extends BaseClass {

	@Test
	public static void wifiSettings() throws Exception {
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		
		Boolean wifiSettings = driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).isEnabled();
		System.out.println("***************"+   wifiSettings   +"********************************************");
		if(wifiSettings==true) {
			driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		}
		
		
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		
		Assert.assertEquals(alertTitle, "WiFi settings");
		
		
		driver.findElement(By.id("android:id/edit")).sendKeys("Ruthvik123");
		
		driver.findElement(By.id("android:id/button1")).click();
		
		
		

	}

}
