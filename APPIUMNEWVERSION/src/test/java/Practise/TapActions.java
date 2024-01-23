package Practise;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TapActions {
	static AndroidDriver driver;
	@Test
	public void hardCoreScript() throws InterruptedException, MalformedURLException {
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		desiredcapabilities.setCapability("appPackage", "com.flipkart.android");
		desiredcapabilities.setCapability("appActivity", ".activity.HomeFragmentHolderActivity");
		desiredcapabilities.setCapability("noReset", true);

		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver  driver=new AndroidDriver  (url, desiredcapabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AndroidElement search = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Search for products\")"));
		tapActions(search);

	}
	
	public void tapActions(WebElement element) {
		TouchAction touch=new TouchAction(driver);
		touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)));
	}

	public void tapActions(WebElement element1 ,int x, int y) {
		TouchAction touch=new TouchAction(driver);
		touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(element1, x, y)));
	}
	
	public void tapActions(int c, int d) {
		TouchAction touch=new TouchAction(driver);
			touch.tap(PointOption.point(c,d));
	}
	
	public void dragAndDrop(int c,int d ,WebElement element1 ) {
		TouchAction touch=new TouchAction(driver);
		touch.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(c,d))
		.withDuration(Duration.ofMillis(5000))).moveTo(PointOption.point(c,d)).release().perform();
		touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element1))
		.withDuration(Duration.ofMillis(5000))).moveTo(PointOption.point(c,d)).release().perform();
		
	}
	
	
	
}









