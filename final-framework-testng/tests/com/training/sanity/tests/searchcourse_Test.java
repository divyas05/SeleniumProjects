/*To verify whether application allows teacher to display list of courses created in catalog page*/
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
import com.training.pom.searchcoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class searchcourse_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private  searchcoursePOM course;

@BeforeClass
public  void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginPOM = new LoginPOM(driver); 
	course = new searchcoursePOM(driver);
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
	screenShot.captureScreenShot("E1");
	Thread.sleep(3000);
	System.out.println("login successfull test6");
	
}
@Test(priority=2)
public void validcataloguesearch() throws InterruptedException  {
	System.out.println("abc");
	course.sendcatalogue();
	Thread.sleep(3000);
	screenShot.captureScreenShot("E2");
	course.sendsearch("SELENIUM FRAMEWORK");
	Thread.sleep(1000);
	screenShot.captureScreenShot("E3");
	course.sendclickbutton();
	Thread.sleep(1000);
	screenShot.captureScreenShot("E4");
	System.out.println("search successfull test7");
}

}