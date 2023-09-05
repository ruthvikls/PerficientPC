package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//By Locators
	private By userName =  By.id("user-name");
	private By password = By.id("password");
	private By loginButton = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	//Actions
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void setUserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	
	public void setPasswordName(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLoginBtn() {
		driver.findElement(loginButton).click();
	}
	public String getCurrentURl() {
		return driver.getCurrentUrl();
	}

}
