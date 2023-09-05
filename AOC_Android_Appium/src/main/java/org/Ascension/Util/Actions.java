package org.Ascension.Util;

import org.Ascension.Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class Actions extends BaseClass{
	public static AndroidDriver driver;
	
	public Actions(AndroidDriver driver) {
		this.driver = driver;
	}

	public static void longPressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));

	}

	public static void scrollToEnd() throws Exception {
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));
		} while (canScrollMore);
		Thread.sleep(5000);
	}

	public static void scrollIntoView(String text) {
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"));
	}
	
	public void waitFor(long waitSeconds) {
		try {
			Thread.sleep(waitSeconds * 1000);
		} catch (Exception e) {
		}
	}
}
