package AppiumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragAndDrop extends BaseClass {

	@Test
	public static void dragAndDrop() throws Exception {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

		WebElement redThing = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) redThing).getId(), "endX", 645, "endY", 649));

		Thread.sleep(2000);

		String dropped = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();

		Assert.assertEquals(dropped, "Dropped!");

	}

}
