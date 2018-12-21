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
import com.training.pom.addDescriptionPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class adddescription_test {

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
	public void validAdddesc() throws InterruptedException  {
	loginPOM.sendUserName("manmen");
	loginPOM.sendPassword("manmen123");
	loginPOM.clickLoginBtn(); 
	screenShot.captureScreenShot("C1");
	addDescriptionPOM description=new addDescriptionPOM(driver);
	description.createdlink();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C2");
	description.icon();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C3");
	description.desc();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C4");
	description.title_desc();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C5");
	description.desc_body();
	Thread.sleep(3000);
	screenShot.captureScreenShot("C6");
	description.submit();
	Thread.sleep(1000);
	screenShot.captureScreenShot("C7");
	}
}