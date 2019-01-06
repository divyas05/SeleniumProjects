/*TO verify whether application allows Teacher to Add a new course*/
package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.addcoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class addcourse_Test {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private addcoursePOM course;
	private Robot robot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException, AWTException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		robot= new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		baseUrl = properties.getProperty("baseURL");
		course =new addcoursePOM(driver);
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
		
	@Test(priority=1)
		public void validAddCoursetest() throws InterruptedException  {
		loginPOM.sendUserName("manmen");
		loginPOM.sendPassword("manmen123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("B1");
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		System.out.println("login susscessfull test2");
	}
		@Test(priority=2)
		public void validAddtest() throws InterruptedException  {
		System.out.println("click on add course");
		course.sendcourse();        //click on add course
		screenShot.captureScreenShot("B2");
		Thread.sleep(1000);
		course.sendtitle("SELENIUM FRAMEWORK");//enter title
		Thread.sleep(3000);
		screenShot.captureScreenShot("B3");
		course.sendadvancedbutton(); //click on advanced button
		Thread.sleep(2000);
		screenShot.captureScreenShot("B4");
		course.sendoption();
		Thread.sleep(3000);
		screenShot.captureScreenShot("B5");
		course.sendjava();
		Thread.sleep(3000);
		course.sendcode("Java");
		Thread.sleep(1000);
		screenShot.captureScreenShot("B6");
		course.sendsubmit();
		Thread.sleep(1000);
		screenShot.captureScreenShot("B7");
		course.sendcoursename();
		Thread.sleep(5000);
		course.textenter("this is selenium course");
		screenShot.captureScreenShot("B8");
		Thread.sleep(1000);
		course.sendsave();
		screenShot.captureScreenShot("B9");
		System.out.println("crouse created test3");
	}
}