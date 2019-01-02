/*TO verify whether application allows teacher to Report & send mail to student about the test submitted*/
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
import com.training.pom.ReportingPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Reporting_Test37 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ReportingPOM report;
	
	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		report = new ReportingPOM(driver);
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
		screenShot.captureScreenShot("G1");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("G2");
	
	}
@Test(priority=2)
public void validreportTest() throws InterruptedException
{
	report.sendcourse();
	screenShot.captureScreenShot("G3");
	report.sendreport();
	screenShot.captureScreenShot("G4");
	Thread.sleep(5000);
	report.sendstudent();//student
	Thread.sleep(5000);
	screenShot.captureScreenShot("G5");
	report.sendquiz();
	screenShot.captureScreenShot("G6");
	report.sendmail();
	Thread.sleep(5000);
	screenShot.captureScreenShot("G7");
	report.sendcorrecttest();
	Thread.sleep(2000);
	screenShot.captureScreenShot("G8");
	report.sendcoursename();
	screenShot.captureScreenShot("G9");
}}