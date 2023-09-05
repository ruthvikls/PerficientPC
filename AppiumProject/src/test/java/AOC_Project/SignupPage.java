package AOC_Project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignupPage extends BaseClass {

	@Test
	public void signup_AOC() throws Exception {
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/createAccountButton")).click();
		Thread.sleep(2000);
		// firstName\
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/firstNameInput")).sendKeys("Steve");
		Thread.sleep(2000);
		// lastName
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/lastNameInput")).sendKeys("Fleming");
		Thread.sleep(2000);
		// DOB
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/birthDayInput")).sendKeys("12/22/1995");
		Thread.sleep(2000);
		// BiogicalSex
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/biologicalSexInput")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/dobLabel")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/genderInput")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/genderLabel")).click();
		Thread.sleep(2000);

		// scroll
		scrollIntoView("Apartment, Building, Suite etc.");
		// driver.findElement(AppiumBy.androidUIAutomator(
		// "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Apartment,
		// Building, Suite etc.\"));"));

		// what state are u in??
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/currentLocationInput")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Florida']")).click();
		driver.findElement(By.id("android:id/button1")).click();

		// Home ADdress
		Thread.sleep(2000);
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/addressLine1Input"))
				.sendKeys("NewTown, Ascend District");

		// city Input
		Thread.sleep(2000);
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/cityInput")).sendKeys("Miami");

		// ZipCode
		Thread.sleep(2000);
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/zipcodeInput")).sendKeys("45433");

		// state
		Thread.sleep(2000);
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/stateInput")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Florida']")).click();
		driver.findElement(By.id("android:id/button1")).click();

		// scroll until signup button
		Thread.sleep(2000);
		scrollIntoView("I agree to the Terms of Use*");
		// driver.findElement(AppiumBy.androidUIAutomator(
		// "new UiScrollable(new UiSelector()).scrollIntoView(text(\"I agree to the
		// Terms of Use*\"));"));
		Thread.sleep(2000);

		// emailID
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/emailInput")).sendKeys("StevenFleming@gmail.co");
		Thread.sleep(2000);
		// Password
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/passwordInput")).sendKeys("Allprograms1!");
		Thread.sleep(2000);
		// terms checkbox
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/termsAgreementInput")).click();
		Thread.sleep(2000);
		// signUpButton
		driver.findElement(By.id("org.ascension.android.ascn.onlinecare:id/signUpButton")).click();

	}
}
