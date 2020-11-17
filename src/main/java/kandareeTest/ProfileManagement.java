package kandareeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ProfileManagement extends BaseClass {
	
	@Test (priority = 0)
	public void navigation() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
	
	    driver.findElementByXPath("//android.widget.TextView[@text='View Profile']").click();
	    System.out.println("Navigate Hamburgare to View Profile!");
	}
	
	@Test (priority = 1)
	public void verifyViewProfile() {
		//Later Dev- save screenshot to view if My Profile is showing correctly.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("verifyViewProfile Executed!");
	}
	
	@Test (priority = 2)
	public void updateProfilePicture() {
		
		 driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[2]").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementByXPath("//android.widget.TextView[@text='Choose from Gallery']").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementByXPath("//android.widget.TextView[@text='Download']").click();	
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Photo taken on Nov 15, 2020 4:16:23 PM\"]").click();
		 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 System.out.println("uploadProfilePicture Executed!");
		
	}
	
	@Test (priority = 3)
	public void UpdateProfileInfo() throws IOException {
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").setValue("Quality Assurance");
		driver.hideKeyboard();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llShortName").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llShortName").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").setValue("QA Auto");
		driver.hideKeyboard();

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userGender").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Female']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").setValue("0123456789");
		driver.hideKeyboard();
		
		String ChangeButton = "Change";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + ChangeButton + "\"))"));

        driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDepartment").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Test Dept.']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDesignation").click();
		driver.findElementByXPath("//android.widget.TextView[@text='System Analyst']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userReportingPerson").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Musharrat Ahmed']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("updateProfileInfo Executed!");
		//driver.quit();
	}
	
	
}
