/*To verify whether application allows teacher to add project details*/
package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ReportingPOM;
import com.training.pom.reportbysearchPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class reportbysearchTest39 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private reportbysearchPOM reporting;
	private  JavascriptExecutor jse;
	private Robot robot;

	
	@BeforeClass
	public  void setUpBeforeClass() throws IOException, AWTException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		robot= new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		reporting = new reportbysearchPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test(priority=1)
	public void validLoginTest() throws InterruptedException  {
		loginPOM.sendUserName("manmen");
		loginPOM.sendPassword("manmen123");
		screenShot.captureScreenShot("I1");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("I2");

	}
@Test(priority=2)
public void validreportTest() throws InterruptedException,IOException
{
	reporting.sendcourse();
	screenShot.captureScreenShot("I3");
	reporting.sendreport();
	screenShot.captureScreenShot("I4");
	reporting.sendname("learner");
	Thread.sleep(2000);
	reporting.sendsearch();
	screenShot.captureScreenShot("I4");
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	reporting.sendstudent();
	Thread.sleep(3000);
	screenShot.captureScreenShot("I5");
	reporting.sendquiz();
	screenShot.captureScreenShot("I6");
	reporting.sendmail();
	Thread.sleep(5000);
	screenShot.captureScreenShot("I7");
	reporting.sendcorrecttest();
	Thread.sleep(2000);
	screenShot.captureScreenShot("I8");
	reporting.sendcoursename();
	screenShot.captureScreenShot("I9");
}}