package AppiumProjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MyPractice extends BaseClass {
	@Test
	public static void myPractice() throws Exception {
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		
		
		
		
	}

}
