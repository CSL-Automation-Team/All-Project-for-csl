package com.cslsoft.KandareeLiteApp;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass {

	public AndroidDriver<AndroidElement>  driver;
	
	@BeforeClass
	public  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{

		File appDir = new File("src/test/resources");
		File app = new File(appDir, "KandareeLiteApp.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.resetApp();
		

		//Login Section
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue("tahsina@cslsoft.com");

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue("1008");

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_log_in").click();
		
		System.out.println("Login Function Executed!");
		
		return driver;
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				String folder_name = "Screenshot/Failed";
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
				File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				new File(folder_name).mkdir();
				String file_name = result.getName() + " - " + sdf.format(date) + ".png";
				FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
				System.out.println("Screenshot taken");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}

		}
		else {
			try {
				String folder_name = "Screenshot/Passed";
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
				File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				new File(folder_name).mkdir();
				String file_name = result.getName() + " - " + sdf.format(date) + ".png";
				FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
				System.out.println("Screenshot taken");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
		
	
	}


	

	
	 @AfterClass
	 public void CloseApps() {
	 driver.quit();
	 }

}
