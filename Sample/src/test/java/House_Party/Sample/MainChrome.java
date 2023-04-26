package House_Party.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MainChrome extends BaseChrome {
	
	@Test
	public void test1() throws InterruptedException {
		a.get("https://www.google.com/");
		Thread.sleep(2000);
		a.findElement(By.name("q")).sendKeys("https://www.innojc.com/");
		Thread.sleep(2000);
		a.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	}
	
	
}
