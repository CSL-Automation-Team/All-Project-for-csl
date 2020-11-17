package kandareeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LogInWithOTP extends BaseClass{

	Date date = java.util.Calendar.getInstance().getTime();

	@Test
	public void login() throws MalformedURLException {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address")
				.setValue("tahsina@cslsoft.com");

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue("1008");

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_log_in").click();
		
	}

}
