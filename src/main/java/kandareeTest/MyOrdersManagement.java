package com.cslsoft.KandareeLiteApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MyOrdersManagement {
AndroidDriver<AndroidElement>  driver;
	
	@Test (priority = 0)
	public void navigation() {
        
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
	
	    driver.findElementByXPath("//android.widget.TextView[@text='My Orders']").click();
		
	}
	
	
	@Test
	public void verifyOrderListView() {
		//Later Dev- save screenshot to view if My Orders are showing correctly.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("verifyOrderListView Executed!");
	}
	
	@Test (priority = 1)
	public void addNewOrder() {
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPoNumber").setValue("AutoOrder_12/11");
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectPoDate").click();
		
		//Code to set date from Calendar Box
		//driver.findElementById("//android.view.View[@content-desc=\"12 November 2020\"]").click();
		driver.findElementById("android:id/button1").click();
		//driver.findElementById("android:id/button2").click();
		//driver.findElementById("android:id/date_picker_header_year").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llCustomerSelect").click();
		
		//Need Code for scrolling for exact option?
		driver.findElementByXPath("//android.widget.TextView[@text='abc']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectProductCategory").click();
		
		//Need Code for scrolling for exact option?
		driver.findElementByXPath("//android.widget.TextView[@text='Test 2']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llStyleNumber").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK)); //Hide keyboard from view.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtStyleNumber").setValue("Auto StyleNo_123_12/11");
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectShipmentDate").click();
		//Code to set date from Calendar Box
		//driver.findElementById("//android.view.View[@content-desc=\"12 November 2020\"]").click();
		driver.findElementById("android:id/button1").click();
		//driver.findElementById("android:id/button2").click();
		//driver.findElementById("android:id/date_picker_header_year").click();
		
		String CreateButton = "Create";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + CreateButton + "\"))"));

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectCurrency").click();
		driver.findElementByXPath("//android.widget.TextView[@text='BDT']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectUnitOfMeasurement").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Pcs']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtOrderQuality").setValue("1000");
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFOB").setValue("10");
		//driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtOrderAmount").setValue("Auto StyleNo_456");
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectShipMode").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Test 1']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectPOStatus").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Test2']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectTnaTemplate").click();
		driver.findElementByXPath("//android.widget.TextView[@text='0.17 iOS']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtRemarks").setValue("Auto QA Remarks");
	
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
		
		System.out.println("addNewOrder Executed!");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	}
	
}
