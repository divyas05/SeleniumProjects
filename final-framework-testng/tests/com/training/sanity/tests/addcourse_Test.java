package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
		
	@Test
		public void validAddCourse() throws InterruptedException  {
		loginPOM.sendUserName("manmen");
		loginPOM.sendPassword("manmen123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("B1");
		addcoursePOM course =new addcoursePOM(driver);
		course.enter();
		screenShot.captureScreenShot("B2");
		course.details();
		screenShot.captureScreenShot("B3");
		course.submit();
		screenShot.captureScreenShot("B4");
		course.introtext();
		screenShot.captureScreenShot("B5");
		course.textenter();
		screenShot.captureScreenShot("B6");
		course.save();
		screenShot.captureScreenShot("B7");
	}
}