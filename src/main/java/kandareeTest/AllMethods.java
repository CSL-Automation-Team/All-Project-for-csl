package com.cslsoft.KandareeLiteApp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AllMethods extends BaseClass {
	
	public void searching(String ser) {
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_search").click(); 
		driver.findElementById("android:id/search_src_text").sendKeys(ser);	
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	public void Scroll()
	{
		for(int i=0; i<3; i++)
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