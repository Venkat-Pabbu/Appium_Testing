package House_Party.Sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Base {
	
	public AndroidDriver a;
	
	@BeforeClass
	public void AppCall() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Ammu APPIUM");
		options.setApp("C:\\Users\\venka\\eclipse-workspace\\Sample\\src\\test\\java\\resources\\General-Store.apk");
		a = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	}
	
	@AfterClass
	public void closeApp() {
		a.quit();
	}

}
