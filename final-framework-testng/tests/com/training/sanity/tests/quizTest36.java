/*TO verify whether application allows teacher to review, rate & send email about the test*/
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.quiztestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class quizTest36 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private quiztestPOM quiz;
	
	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		quiz = new quiztestPOM(driver);
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
		screenShot.captureScreenShot("H1");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("H2");
	
	}
@Test(priority=2)
public void validreportTest() throws InterruptedException
{
	quiz.sendcourse(); //click on course
	screenShot.captureScreenShot("H3");
	quiz.sendtest(); //click on test
	Thread.sleep(1000);
	screenShot.captureScreenShot("H4");
	quiz.sendvalidate();  //click on validate
	Thread.sleep(1000);
	screenShot.captureScreenShot("H5");
	quiz.sendgrade(); //click on grade  activity
	Thread.sleep(3000);
	screenShot.captureScreenShot("H6");
	quiz.sendcheckbox(); //select the check box
	Thread.sleep(1000);
	screenShot.captureScreenShot("H7");
	quiz.sendsend(); // click on send button
	Thread.sleep(1000);
	screenShot.captureScreenShot("H8");
}}