/*To verify whether application allows teacher to enter course description*/
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addDescriptionPOM {
	
	WebDriver driver; 
	public addDescriptionPOM(WebDriver driver)
	{
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
@FindBy(linkText="SELENIUM FRAMEWORK")//click course link
private WebElement courselink;
@FindBy(xpath="//*[contains(@title,'Course description')]")//click on course desc icon
private WebElement descicon; 
@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a[1]/img")  //click on desc icon
private WebElement desc;
@FindBy(name="title")  //enter title
private WebElement title_desc;
@FindBy(xpath="//*[@id='cke_1_contents']//iframe") //enter description
private WebElement description;
@FindBy(name="submit")
private WebElement submit;


	public void sendcourselink()
	{
	this.courselink.click();	
	}
	public void senddescicon() {
		this.descicon.click();
	}
	public void senddesc()
	{
	this.desc.click();	
	}
	public void title_desc(String title) {
		this.title_desc.sendKeys(title);
	}
	public void desc_body(String body) {
		driver.switchTo().frame(description);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);
		driver.switchTo().defaultContent();
		
	}
	public void sendsubmit() {
		this.submit.click();
	}
	}