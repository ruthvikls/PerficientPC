package org.Ascension.PageObjects;

import org.Ascension.Util.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignupPage extends Actions {

	AndroidDriver driver;

	public SignupPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// SignUp Button Landing Page
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/createAccountButton")
	private WebElement signUpOnLandingPage;

	// firstName
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/firstNameInput")
	private WebElement firstName;

	// lastName
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/lastNameInput")
	private WebElement lastName;

	// DOB
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/birthDayInput")
	private WebElement dateOfBirth;

	// BiogicalSex
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/biologicalSexInput")
	private WebElement biogicalSex;

	// genderInput
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/genderInput")
	private WebElement genderInput;

	// whatStateAreUIn
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/currentLocationInput")
	private WebElement whatStateAreUIn;

	// OkButtoninDropDown
	@AndroidFindBy(id = "android:id/button1")
	private WebElement OkButtoninDropDown;

	// homeAddress
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/addressLine1Input")
	private WebElement homeAddress;

	// cityInput
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/cityInput")
	private WebElement cityInput;

	// zipCode
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/zipcodeInput")
	private WebElement zipCode;

	// stateDropDown
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/stateInput")
	private WebElement stateDropDown;

	// emailID
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/emailInput")
	private WebElement emailID;

	// password
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/passwordInput")
	private WebElement password;

	// termsAndConditions
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/termsAgreementInput")
	private WebElement termsAndConditions;

	// SignUpButton
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/signUpButton")
	private WebElement SignUpButton;
	
	//****************************************************
	//org.ascension.android.ascn.onlinecare:id/dobLabel
	//biologicalSexInput male or female
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/dobLabel")
	private WebElement biologicalSexInput;
	
	//org.ascension.android.ascn.onlinecare:id/genderLabel
	//genderLabel for gender
	@AndroidFindBy(id = "org.ascension.android.ascn.onlinecare:id/genderLabel")
	private WebElement genderLabel;
	
	public void setFirstName(String nameFirst) {
		signUpOnLandingPage.click();
		firstName.sendKeys(nameFirst);
		}
	
	public void setLastName(String nameLast) {
			lastName.sendKeys(nameLast);
		}
	
	public void setDOB(String DOB) {
		dateOfBirth.sendKeys(DOB);
	}
	
	public void setbiologicalSex() {
		biogicalSex.click();
		biologicalSexInput.click();
		
	}
	
	public void setGender( ) {
		genderInput.click();
		genderLabel.click();
		scrollIntoView("Apartment, Building, Suite etc.");
		}
	
	public void whichState(String state) {
		whatStateAreUIn.click();
		
		
		
	}
	
}