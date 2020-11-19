package com.cslsoft.KandareeLiteApp;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class MyTasks extends BaseClass  {
	
	@Test(priority = 0)
	public void Nevigate() {
		
		    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
		 
		driver.findElementByXPath("//android.widget.TextView[@text='My Tasks']").click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Navigate Hamburgare to My Task!");

	}
	@Test (priority = 1)
	public void CreateTask() {
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtDescription").sendKeys("Create New Task");
		
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tv_grievance_type").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userReportingPerson").click();
		driver.findElementByXPath("//android.widget.LinearLayout[1]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llSelectPoDate").click();
		driver.findElementByXPath("//android.view.View[@text='25']").click();
		driver.findElementById("android:id/button1").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtRemarks").sendKeys("click on submite button");
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreateAssignTask").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"back\"]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Create New Task Executed!!");

}
//Update	
	@Test (priority = 2)
	public void UpdateTask() {
		String UpdateTask = "Create New Task";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + UpdateTask + "\"))"));
		
		List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<xyz.size();i++)
		{
			if(xyz.get(i).getText().contains("Create New Task"))
			{
				driver.findElementByXPath("//android.widget.TextView[@text='Create New Task']").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				break;
				
			}
						
		}
		

		//Edit
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_task_edit").click();	
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").sendKeys("Update For Testing");
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//call to Assignee
		
		driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		BackFun();
				
		// Date.
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_deadline_edit").click();
		driver.findElementByXPath("//android.view.View[@text='20']").click();
		driver.findElementById("android:id/button1").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		// task category
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_category_edit").click();
		driver.findElementByXPath("//android.widget.LinearLayout[1]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
		//call to Assigner
		
		driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
		BackFun();
				
		//call to Assignee
		
		driver.findElementByXPath("//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		BackFun();
	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()."+"scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"bd.com.cslsoft.kandareeliteapp:id/remarks\"))"));
		

		String abc=driver.findElementByClassName("android.widget.Button").getText();
		
		if(abc.contains("Add Comment"))
			{

				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_add_comment").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").sendKeys("How mauch time need to complete");
				driver.hideKeyboard();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			}
			
		else
			{
				
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_replay").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").sendKeys("Task Done");
				driver.hideKeyboard();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		
		// Complete and back
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_complete_task").click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"back\"]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Updater MyTask Executed!!");
	}
	
	
// Reassaign.................	
	@Test(priority = 3)
	public void Reassaign() {
		
		String ser="Update For Testing";
		Searching(ser);
		Scroll();
		
		Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getCenter();
		Point point3=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getLocation();
					
		TouchAction tcD=new TouchAction(driver);
					
		tcD.longPress(longPressOptions().withPosition(PointOption.point(point2.x+100, point2.y+20))
		 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point3.x, point3.y+20)).release().perform();
		
		
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_reAssign").click();
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_newAssigneeDropDown").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.widget.TextView[@text='Musharrat Ahmed']").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_remarks").sendKeys("change");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}
	
	//Miscellaneous	
		@Test(priority = 4)
		public void MyTaskMiscellaneous() throws InterruptedException {

			//Sorting
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_filter").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_close").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_filter").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/rbTaskStatus").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llDescendingBg").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnApplyALl").click();
					


			//Call from My Task and complete
			

			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/phone_icon").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			BackFun();
			//driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.ImageView").click();
					
		    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llCompleteTask").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
			//driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			System.out.println("Miscellaneous Task Executed!!");
			
			
		}


	//Assign Task
		@Test(priority = 5)
		public void AssignTask() {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/nav_assigned_task").click();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			
			System.out.println("Navigate MyTask to Assign Task!");
			
			

		}
		
		@Test(priority = 6)
		public void UpdateAssignTask() {
			String UpdateAssTask = "Update Assign Task";
			MobileElement element = (MobileElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"" + UpdateAssTask + "\"))"));
			
			List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
			for(int i=0;i<xyz.size();i++)
			{
				if(xyz.get(i).getText().contains("Update Assign Task"))
				{
					driver.findElementByXPath("//android.widget.TextView[@text='Update Assign Task']").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					break;
					
				}
							
			}
			//Edit
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_task_edit").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").clear();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").sendKeys("Update For Testing");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.hideKeyboard();
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			//call to Assignee
			
			driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			BackFun();
					
			// Date.
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_deadline_edit").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementByXPath("//android.view.View[@text='25']").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("android:id/button1").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			// task category
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_category_edit").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementByXPath("//android.widget.LinearLayout[1]").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 
			//call to Assigner
			
			driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
			BackFun();
					
			//call to Assignee
			
			driver.findElementByXPath("//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			BackFun();
		
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()."+"scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"bd.com.cslsoft.kandareeliteapp:id/remarks\"))"));
			

			String abc=driver.findElementByClassName("android.widget.Button").getText();
			
			if(abc.contains("Add Comment"))
				{

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_add_comment").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").sendKeys("How mauch time need to complete");
					driver.hideKeyboard();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
				}
				
			else
				{
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_replay").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").sendKeys("Task Done");
					driver.hideKeyboard();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
			
			// Complete and back
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_complete_task").click();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			System.out.println("UpdateAssignTask Executed!");
		}

		
	@Test(priority = 7)
		public void DeleteAssignTask() {

			
			String ser="Update Assign Task";
			Searching(ser);
			Scroll();
			Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Update Assign Task']").getCenter();
			Point point3=driver.findElementByXPath("//android.widget.TextView[@text='Update Assign Task']").getLocation();
								
			TouchAction tcD=new TouchAction(driver);
								
			tcD.longPress(longPressOptions().withPosition(PointOption.point(point2.x+100, point2.y+20))
					 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point3.x, point3.y+20)).release().perform();
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_reAssign").click();
			//driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			
			System.out.println("DeleteAssignTask Executed!");
			

		}

	//Old Task....

	@Test(priority = 8)
	public void OldTask() {
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/nav_old_task").click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		System.out.println("Navigate Assign Task To OldTask!");

	}
		
	@Test(priority = 9)
	public void UpdateOldTask() {
		String UpdateAssTask = "DIP";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + UpdateAssTask + "\"))"));
		
		List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<xyz.size();i++)
		{
			if(xyz.get(i).getText().contains("DIP"))
			{
				driver.findElementByXPath("//android.widget.TextView[@text='DIP']").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				break;
				
			}
						
		}
		
			
		//call to Assignee
		
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		BackFun();		
				 
		//call to Assigner
		
		driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
		BackFun();
				
		//call to Assignee
		
		driver.findElementByXPath("//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		BackFun();
		
		// back
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Miscellaneous
		String Call = "DIP";
		MobileElement element1 = (MobileElement) driver
						.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
								+ ".scrollIntoView(new UiSelector().text(\"" + Call + "\"))"));
		List<AndroidElement> xyz5=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<xyz5.size();i++)
			{
				if(xyz5.get(i).getText().contains("DIP"))
					{
						driver.findElementByXPath("//android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageView").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						BackFun();
						
						driver.findElementByXPath("//android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						BackFun();
						break;
						
					}		
			}
		
		System.out.println("Check OldTask Executed!");
		//driver.quit();


	}
	
	@Test(priority = 10)
	public void IncompleteTask() {

		
		String ser="Update For Testing";
		Searching(ser);
		//AllMethods scr=new AllMethods();
		//scr.Scroll();
		Scroll();
		Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getCenter();
		Point point3=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getLocation();
							
		TouchAction tcD=new TouchAction(driver);
							
		tcD.longPress(longPressOptions().withPosition(PointOption.point(point2.x+100, point2.y+20))
				 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point3.x, point3.y+20)).release().perform();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_reAssign").click();
		//driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		
		System.out.println("IncompleteTask Executed!");
		

	}
	
	
	
	
	
	public void Searching(String ser) {
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_search").click(); 
		driver.findElementById("android:id/search_src_text").sendKeys(ser);	
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	public void BackFun()
	{
		for(int j=0; j<=2;j++)
		 {
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 }
	}
	public void Scroll()
	{
		for(int i=0; i<4; i++)
		{
			Dimension dimension=driver.manage().window().getSize();
			int start_x=(int) (dimension.width*0.5);
			int start_y=(int) (dimension.height*0.2);
			
			int end_x=(int) (dimension.width*0.5);
			int end_y=(int) (dimension.height*0.8);
			
			TouchAction tcD=new TouchAction(driver);
			tcD.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(end_x, end_y)).release().perform();
		}

		
	}


}

