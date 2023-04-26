package House_Party.Sample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Main extends Base {

	// #############Filling Form Details############
	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(6000);
		a.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Venkat");
		Thread.sleep(2000);
		a.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(2000);
		a.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		// ########################### DropDown (Scrolling) Code ####################
		a.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		Thread.sleep(2000);
		a.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		// ##############################################################################
		Thread.sleep(4000);
		a.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}

	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(6000);
		// a.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Venkat");
		Thread.sleep(2000);
		a.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		Thread.sleep(2000);
		a.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		a.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));"));
		Thread.sleep(2000);
		a.findElement(By.xpath("//android.widget.TextView[@text='Aruba']")).click();
		Thread.sleep(4000);
		a.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		String toastMessage = a.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		Thread.sleep(2000);
		Assert.assertEquals(toastMessage, "Please enter your name");

	}

}
