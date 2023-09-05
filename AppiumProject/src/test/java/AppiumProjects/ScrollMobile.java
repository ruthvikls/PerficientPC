package AppiumProjects;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollMobile extends BaseClass {

	@Test
	public static void scrollInto() throws Exception {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// First Method of Scrolling
		// driver.findElement(AppiumBy
		// .androidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"WebView\"));"));
		scrollIntoView("WebView");

		// Second Method of Scrolling

	}

}
