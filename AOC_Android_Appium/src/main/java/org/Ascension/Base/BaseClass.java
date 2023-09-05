package org.Ascension.Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClass {
	public static AppiumDriverLocalService builder;
	public static AndroidDriver driver;

	@BeforeClass

	public static void StartAppium() throws MalformedURLException {
		AppiumDriverLocalService builder = new AppiumServiceBuilder().withAppiumJS(new File(
				"C:\\Users\\r.lakshminarayana\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).withArgument(GeneralServerFlag.SESSION_OVERRIDE).build();
		// builder.start();

		System.out.println("*******STARTING APPIUM SERVER************");

		/*
		 * builder = new AppiumServiceBuilder().withAppiumJS(new File(
		 * "C:\\\\Users\\\\r.lakshminarayana\\\\AppData\\\\Roaming\\\\npm\\\\node_modules\\\\appium\\\\build\\\\lib\\\\main.js"
		 * )) .withArgument(GeneralServerFlag.SESSION_OVERRIDE) .withLogFile(new
		 * File(System.getProperty("user.dir") + "/appiumServerLog.txt")).build();
		 * 
		 * System.out.println("Starting the Appium Server on 127.0.0.1:4723");
		 */
		// builder.start();

//Setting up Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Ruthvik A11");
		// options.setApp(
		// "C:\\Users\\r.lakshminarayana\\Documents\\SMOKE_TEST\\AppiumProject\\src\\test\\java\\com\\resources\\ApiDemos-debug.apk");

		options.setApp(
				"C:\\Users\\r.lakshminarayana\\Documents\\SMOKE_TEST\\AppiumProject\\src\\test\\java\\com\\resources\\General-Store.apk");
//Setting up AndroidDriver for Automation
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	

	@AfterClass
	public static void tearDown() {
		driver.quit();

		// builder.stop();
	}

}
