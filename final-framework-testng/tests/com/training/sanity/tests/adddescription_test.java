/*To verify whether application allows teacher to enter course description*/
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.addDescriptionPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class adddescription_test {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private addDescriptionPOM description;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		description=new addDescriptionPOM(driver);
		baseUrl = properties.getProperty("baseURL");
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
	public void validloginTest() throws InterruptedException  {
	loginPOM.sendUserName("manmen");
	loginPOM.sendPassword("manmen123");
	loginPOM.clickLoginBtn(); 
	screenShot.captureScreenShot("C1");
	System.out.println("login successful test4");
	}
	@Test(priority=2)
	public void validAdddescTest() throws InterruptedException  {
	description.sendcourselink();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C2");
	description.senddescicon();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C3");
	description.senddesc();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C4");
	description.title_desc("Selenium course");
	Thread.sleep(3000);
	screenShot.captureScreenShot("C5");
	description.desc_body("Selenium is an automation tool");
	Thread.sleep(3000);
	screenShot.captureScreenShot("C6");
	description.sendsubmit();
	Thread.sleep(1000);
	screenShot.captureScreenShot("C7");
	System.out.println("description added test5");
	}
}