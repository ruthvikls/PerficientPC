package com.Ecommerce.Example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import AppiumProjects.BaseClass;
import io.appium.java_client.AppiumBy;

public class Ecommerce_Test_2 extends BaseClass {
	// Fill the form and verify the toast message
	@Test
	public void fillForm() throws Exception {
		// gender
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		// name
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ruthvik");
		driver.hideKeyboard();
		// country
		driver.findElement(By.id("android:id/text1")).click();
		// scroll through country
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Australia']")).click();
		// lets shop
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		Thread.sleep(2000);
		// add a product to the cart
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"));"));
		int numberOfProducts = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for (int i = 0; i < numberOfProducts; i++) {

			String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i)
					.getText();
			if (productName.equals("PG 3")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}

		// cart button
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		Boolean inCart = driver.findElement(By.xpath("//android.widget.TextView[@text='PG 3']")).isDisplayed();
		Assert.assertTrue(inCart);
	}

}
