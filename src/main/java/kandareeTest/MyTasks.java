package kandareeTest;
import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		for(int i=0; i<3;i++)
			{
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
				
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
		for(int i=0; i<3;i++)
			{
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
				
		//call to Assignee
		
		driver.findElementByXPath("//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for(int i=0; i<3;i++)
			{
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
	
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
	
//Miscellaneous	
	@Test(priority = 3)
	public void MyTaskMiscellaneous() throws InterruptedException {
		//searching
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_search").click(); 
		driver.hideKeyboard();
		driver.findElementById("android:id/search_src_text").sendKeys("Update For Testing");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//Sorting
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_filter").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_close").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_filter").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/rbTaskStatus").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llDescendingBg").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnApplyALl").click();
				


		//Call from My Task and complete
		String Call = "Update For Testing";
		MobileElement element1 = (MobileElement) driver
						.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
								+ ".scrollIntoView(new UiSelector().text(\"" + Call + "\"))"));
		List<AndroidElement> xyz5=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<xyz5.size();i++)
			{
				if(xyz5.get(i).getText().contains("Update For Testing"))
					{
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/phone_icon").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						for(int j=0; j<=2;j++)
						 {
							driver.pressKey(new KeyEvent(AndroidKey.BACK));
							driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						 }
						//driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.ImageView").click();
						
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llCompleteTask").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						break;
						
					}		
			}
		System.out.println("Miscellaneous Task Executed!!");
		

	}
	
// Reassaign.................	
	public void Reassaign() {
		/*	String TaskCart1 = "Work For Automationnew";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + TaskCart1 + "\"))"));
		
		List<AndroidElement> xyz5=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<xyz5.size();i++)
		{
			if(xyz5.get(i).getText().contains("Work For Automationnew"))
			{
				Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Work For Automationnew']").getCenter();
				 Point point3=driver.findElementByXPath("//android.widget.TextView[@text='Work For Automationnew']").getLocation();
							
				TouchAction tcD=new TouchAction(driver);
							
				tcD.longPress(longPressOptions().withPosition(PointOption.point(point2.x+100, point2.y+20))
				 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point3.x, point3.y+20)).release().perform();
				
				
				 
				 //tcD.longPress(longPressOptions().withPosition(PointOption.point(point3.x+800, point3.y+20)).withDuration(ofSeconds(1))).release().perform();
				//tcD.longPress(point(point2.x+90, point2.y)).release().perform();
				 
				break;
				
			}
						
		}
	
		
		
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_reAssign").click();
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_newAssigneeDropDown").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.widget.TextView[@text='Test 1']").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_remarks").sendKeys("change");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		*/

	}
	//Assign Task
		@Test(priority = 4)
		public void AssignTask() {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/nav_assigned_task").click();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			
			System.out.println("Navigate MyTask to Assign Task!");

		}
		
		@Test(priority = 5)
		public void UpdateAssignTask() {
			String UpdateAssTask = "Update For Testing";
			MobileElement element = (MobileElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"" + UpdateAssTask + "\"))"));
			
			List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
			for(int i=0;i<xyz.size();i++)
			{
				if(xyz.get(i).getText().contains("Update For Testing"))
				{
					driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").click();
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
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_field_value").sendKeys("Update Assign Task");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.hideKeyboard();
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			//call to Assignee
			
			driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			for(int i=0; i<3;i++)
				{
					driver.pressKey(new KeyEvent(AndroidKey.BACK));
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
					
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
			for(int i=0; i<3;i++)
				{
					driver.pressKey(new KeyEvent(AndroidKey.BACK));
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
					
			//call to Assignee
			
			driver.findElementByXPath("//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			for(int i=0; i<3;i++)
				{
					driver.pressKey(new KeyEvent(AndroidKey.BACK));
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
		
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

		
	@Test(priority = 6)
		public void DeleteAssignTask() {
			String DelCart ="Update Assign Task";
			MobileElement element = (MobileElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"" + DelCart + "\"))"));
			
			List<AndroidElement> xyz5=driver.findElementsByClassName("android.widget.TextView");
			for(int i=0;i<xyz5.size();i++)
			{
				if(xyz5.get(i).getText().contains("Update Assign Task"))
				{
					Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Update Assign Task']").getCenter();
					 Point point3=driver.findElementByXPath("//android.widget.TextView[@text='Update Assign Task']").getLocation();
								
					TouchAction tcD=new TouchAction(driver);
								
					tcD.longPress(longPressOptions().withPosition(PointOption.point(point2.x+100, point2.y+20))
					 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point3.x, point3.y+20)).release().perform();

					 
					break;
					
				}
							
			}
			
			System.out.println("DeleteAssignTask Executed!");
	// Need to correct By dev Team	
			/*
			driver.findElementByXPath("//*[contains(text(),'Delete')]").click();
			//driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_reAssign").click();
			//driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			*/
			
			

		}


	//Old Task....

	@Test(priority = 7)
	public void OldTask() {
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/nav_old_task").click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		System.out.println("Navigate Assign Task To OldTask!");

	}
		
	@Test(priority = 8)
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
		for(int i=0; i<=2;i++)
			{
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
				
				 
		//call to Assigner
		
		driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
		for(int i=0; i<=2;i++)
			{
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
				
		//call to Assignee
		
		driver.findElementByXPath("//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for(int i=0; i<=2;i++)
			{
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}

		
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
						for(int j=0; j<=2;j++)
						 {
							driver.pressKey(new KeyEvent(AndroidKey.BACK));
							driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						 }
						
						driver.findElementByXPath("//android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						for(int j=0; j<=2;j++)
						 {
							driver.pressKey(new KeyEvent(AndroidKey.BACK));
							driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						 }
						break;
						
					}		
			}
		
		System.out.println("Check OldTask Executed!");
		//driver.quit();


	}
		

}
