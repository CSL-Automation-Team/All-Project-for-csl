package com.cslsoft.KandareeLiteApp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.lang.NullPointerException;
public class CallingMethods{
	public AndroidDriver<AndroidElement>  driver;
	public CallingMethods(AndroidDriver<AndroidElement> driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	 
	 
	 
	 
		public void Swipping(Point p1,Point p2) {
			TouchAction tcD=new TouchAction(driver);
			tcD.longPress(longPressOptions().withPosition(PointOption.point(p1.x+100, p1.y+20))
					 .withDuration(ofSeconds(3))).moveTo(PointOption.point(p2.x, p2.y+20)).release().perform();
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