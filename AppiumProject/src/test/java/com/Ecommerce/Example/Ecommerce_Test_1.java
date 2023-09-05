package com.Ecommerce.Example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import AppiumProjects.BaseClass;
import io.appium.java_client.AppiumBy;

public class Ecommerce_Test_1 extends BaseClass {
	//Fill the form and verify the toast message
	@Test
	public void fillForm() {
		//gender
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		//name
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ruthvik");
		//driver.hideKeyboard();
		//country
		driver.findElement(By.id("android:id/text1")).click();
		//scroll through country
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Australia']")).click();
		//lets shop
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//verify toast message
		String toastName = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		
		Assert.assertEquals(toastName, "Please enter your name");
		
	}

}
