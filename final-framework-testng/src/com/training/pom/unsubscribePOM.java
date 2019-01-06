/*To verify whether application allows teacher to unsubscribe registered user from the course*/
package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class unsubscribePOM {
	WebDriver driver;
	public unsubscribePOM(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="SELENIUM FRAMEWORK")
	private WebElement course;
	@FindBy(id="toolimage_3244")
	private WebElement icon;
	@FindBy(name="user[]")
	private WebElement checkbox;
	@FindBy(linkText="Unsubscribe")
	private WebElement unsub;
	public void sendcourse()
	{
    this.course.click();	
	
	}
	public void sendicon() {
		this.icon.click();	
	}
	public void sendcheckbox() {
		this.checkbox.click();	
	}
	public void sendunsub() {
		this.unsub.click();	
	}
	public void alert() {
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept(); 
	}
	}
