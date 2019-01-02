/*To verify whether application allows teacher to add project details*/
package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.newProjectPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class newproject_Test40 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private newProjectPOM newpro;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		newpro = new newProjectPOM(driver);
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
		screenShot.captureScreenShot("E1");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("E2");
	
	}
@Test(priority=2)
public void validProjectTest1() throws InterruptedException  {
newpro.sendcourse();
screenShot.captureScreenShot("E3");
Thread.sleep(5000);
newpro.sendproject();
screenShot.captureScreenShot("E4");
newpro.sendnewproject();
newpro.sendtitle("eLearning");
System.out.println("elearning");
newpro.sendsubtitle("eLearning project");
screenShot.captureScreenShot("E5");
newpro.sendsubmit();                   //project created
screenShot.captureScreenShot("E6");
newpro.sendelearn();
screenShot.captureScreenShot("E7");
newpro.sendmsg();
String Expected ="Welcome !";
String Actual=newpro.message.getText();
System.out.println("Actual" + Actual + " " + "expected" + Expected);
assertEquals(Actual, Expected);
newpro.sendnewtask();
newpro.sendtasktitle("Design");
screenShot.captureScreenShot("E8");
newpro.sendSubmit();                   //task created
screenShot.captureScreenShot("E9");
}
@Test(priority=3)
public void validProjectTest2() throws InterruptedException  {
newpro.sendroles();              //roles creation
screenShot.captureScreenShot("E10");
newpro.sendnewroles();
newpro.sendroletitle("developer");
screenShot.captureScreenShot("E11");
newpro.sendrolesave();
screenShot.captureScreenShot("E12");
newpro.sendassign();
//newpro.senduser();
//newpro.sendteacher();
screenShot.captureScreenShot("E13");
newpro.sendusersubmit();
screenShot.captureScreenShot("E14");
}
@Test(priority=4)
public void validProjectTest3() throws InterruptedException  {
newpro.sendusermanage();
newpro.senduserlist();
screenShot.captureScreenShot("E15");
newpro.sendregister();
screenShot.captureScreenShot("E16");
}

}
