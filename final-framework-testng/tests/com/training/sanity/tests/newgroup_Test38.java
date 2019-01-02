/*To verify whether application allows teacher to create a group & modify the settings*/
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
import com.training.pom.groupsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class newgroup_Test38 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private groupsPOM newgrp;
	
	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		newgrp = new groupsPOM(driver);
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
	public void validLoginTest() throws InterruptedException  {
		loginPOM.sendUserName("manmen");
		loginPOM.sendPassword("manmen123");
		screenShot.captureScreenShot("F1");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("F2");
	
	}
@Test(priority=2)
public void validnewgroupTest()
{
	newgrp.sendcourse();
	screenShot.captureScreenShot("F3");
	newgrp.sendGroups();
	screenShot.captureScreenShot("F4");
	newgrp.sendnewgrp();
	screenShot.captureScreenShot("F5");
	newgrp.sendgroupcount("1");
	screenShot.captureScreenShot("F6");
	newgrp.sendgroupsubmit();
	screenShot.captureScreenShot("F7");
}
@Test(priority=3)
	public void validnewmemberTest()
	{	
	newgrp.sendgroupname("Rockers");
	screenShot.captureScreenShot("F8");
	newgrp.sendnamesubmit();
	screenShot.captureScreenShot("F9");
	newgrp.sendnewmem();
	screenShot.captureScreenShot("F10");
	newgrp.sendnamelist();
	screenShot.captureScreenShot("F11");
	newgrp.sendadd();
	screenShot.captureScreenShot("F12");
	newgrp.senduserlist();
	screenShot.captureScreenShot("F13");
	newgrp.sendadd();
	screenShot.captureScreenShot("F14");
	newgrp.sendusaveset();
	screenShot.captureScreenShot("F15");
	}
@Test(priority=4)
public void valideditTest() throws InterruptedException
{	
	newgrp.sendedit();
	screenShot.captureScreenShot("F16");
	newgrp.sendregister();
	screenShot.captureScreenShot("F17");
	Thread.sleep(3000);
	newgrp.sendunregister();
	screenShot.captureScreenShot("F18");
	newgrp.sendeditbutton();
	screenShot.captureScreenShot("F19");
}}

