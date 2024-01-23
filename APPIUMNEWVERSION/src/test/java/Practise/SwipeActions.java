package Practise;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeActions {
	static AndroidDriver driver;
	@Test
	public void hardCoreScript() throws InterruptedException, MalformedURLException {
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredcapabilities.setCapability("appActivity", ".ApiDemos");
		desiredcapabilities.setCapability("noReset", true);

		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver  driver=new AndroidDriver  (url, desiredcapabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);






	}
	public void swipeAction(int c,int d ,WebElement element1 ) {
		TouchAction touch=new TouchAction(driver);



	}
}



