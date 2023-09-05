package AOC_Project;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	public static AndroidDriver driver;
	@Test
	public static void setUp() throws Exception {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Ruthvik A11");
		options.setApp(
				"C:\\Users\\r.lakshminarayana\\Downloads\\app-universal-debug.apk");

		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
	

	public static void scrollIntoView(String text) {
		driver.findElement(AppiumBy
		.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}

}
