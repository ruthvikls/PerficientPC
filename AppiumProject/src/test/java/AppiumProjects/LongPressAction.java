package AppiumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPressAction extends BaseClass {

	@Test
	public static void performLongPress() {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		WebElement pn = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));

		longPressAction(pn);
		String peopleName = driver.findElement(By.id("android:id/title")).getText();

		Assert.assertEquals(peopleName, "Sample menu");

		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());

	}

}
