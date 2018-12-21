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
import com.training.pom.unsubscribePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class unsubscribe_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

@BeforeClass
public  void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginPOM = new LoginPOM(driver); 
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
	public void validAddCourse() throws InterruptedException  {
	loginPOM.sendUserName("manmen");
	loginPOM.sendPassword("manmen123");
	loginPOM.clickLoginBtn(); 
	screenShot.captureScreenShot("D1");
	
}
@Test(priority=2)
public void validunsubscribe() throws InterruptedException  {
	unsubscribePOM  unsub =new unsubscribePOM(driver);
	unsub.createdlink();
	Thread.sleep(3000);
	screenShot.captureScreenShot("D2");
	unsub.usericon();
	Thread.sleep(1000);
	screenShot.captureScreenShot("D3");
	unsub.checkbox();//selenium framework only subscribed by the student
	Thread.sleep(1000);
	screenShot.captureScreenShot("D4");
	unsub.unsubbutton();
	screenShot.captureScreenShot("D5");
	Thread.sleep(2000);
	unsub.alert();
	Thread.sleep(3000);
	screenShot.captureScreenShot("D6");
}

}