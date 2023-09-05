package com.Ecommerce.Example;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import AppiumProjects.BaseClass;
import io.appium.java_client.AppiumBy;

public class Ecommerce_Test_3 extends BaseClass {
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
	/*	driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"));"));
		int numberOfProducts = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for (int i = 0; i < numberOfProducts; i++) {

			String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i)
					.getText();
			if (productName.equals("PG 3")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}
		*/
		
		//verify two products in cart
		driver.findElement(By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]")).click();
		
		driver.findElement(By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]")).click();
		
		// cart button
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);

		List<WebElement> productPrices= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		
		double countPrice = 0;
		for(int i=0;i<productPrices.size();i++) {
		 String product = 	productPrices.get(i).getText();
		 		double prices = Double.parseDouble(product.substring(1));
		 		countPrice = countPrice +prices;
		}
		
	String actualAmount = 	driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	double actualPrice = Double.parseDouble(actualAmount.substring(1));
	
	Assert.assertEquals(actualPrice, countPrice,"Product Prices are matching");
	driver.findElement(By.className("android.widget.CheckBox")).click();
	
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	//webView
	Thread.sleep(5000);
	
	Set<String> contexts = driver.getContextHandles();
	
	for(String con : contexts) {
		System.out.println(con);
	}
	
	}

}
