/*To verify whether application allows teacher to unsubscribe registered user from the course*/
package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
	private unsubscribePOM unsub;

@BeforeClass
public  void setUpBeforeClass() throws IOException, AWTException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginPOM = new LoginPOM(driver); 
	unsub =new unsubscribePOM(driver);
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
	unsub.sendcourse();
	screenShot.captureScreenShot("D2");
	unsub.sendicon();
	screenShot.captureScreenShot("D3");
	unsub.sendcheckbox();//selenium framework only subscribed by the student
	screenShot.captureScreenShot("D4");
	unsub.sendunsub();
	screenShot.captureScreenShot("D5");
	unsub.alert();
	screenShot.captureScreenShot("D6");
}

}