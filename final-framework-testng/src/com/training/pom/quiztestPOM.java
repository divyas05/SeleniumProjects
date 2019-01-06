/*TO verify whether application allows teacher to review, rate & send email about the test*/
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quiztestPOM {

	WebDriver driver;
	public quiztestPOM(WebDriver driver)
	{
		this.driver=driver;
				PageFactory.initElements(driver, this);		
	}
	
	@FindBy(linkText="SELENIUM FRAMEWORK")  //click on course
	private WebElement course; 
	@FindBy(linkText="Tests")  //click on test icon
	private WebElement test; 
	@FindBy(xpath="//*[contains(@title,'Results and feedback')]")//results & feedback
	private WebElement validate;
	@FindBy(xpath="//*[contains(@title,'Grade activity')]")//click on grade
	private WebElement grade;
	@FindBy(name="send_notification")
	private WebElement checkbox;
	@FindBy(name="submit")
	private WebElement send;
	
public void sendcourse()
{
	this.course.click();
}
public void sendtest()
{
	this.test.click();
}
public void sendvalidate()
{
	this.validate.click();
}
public void sendgrade()
{
	this.grade.click();
}
public void sendcheckbox()
{
	this.checkbox.click();
}
public void sendsend()
{
	this.send.click();
}
}
	
