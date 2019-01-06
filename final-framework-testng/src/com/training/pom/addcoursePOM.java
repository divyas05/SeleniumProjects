/*TO verify whether application allows Teacher to Add a new course*/
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addcoursePOM{
	
	WebDriver driver; 
	public addcoursePOM(WebDriver driver)
	{
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[contains(@title,'Create a course')]")
private WebElement course;		  //click on add course
@FindBy(name="title")
private WebElement title;  //enter title
@FindBy(id="advanced_params")//click on advanced button
private WebElement advancedbutton;
@FindBy(xpath="//*[contains(@title,'none')]")
private WebElement options;		//select code
@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/ul/li[4]/a")
private WebElement java; //select  code
@FindBy(name="wanted_code")
private WebElement code;//enter code
@FindBy(name="submit")
private WebElement submit;		//click on create button
@FindBy(xpath="//*[contains(@title,'Add an introduction text')]")		
private WebElement coursename;		//click on add intro icon
@FindBy(xpath="//*[@id='cke_1_contents']//iframe")	
private WebElement textenter;//enter text in iframe
@FindBy(name="intro_cmdUpdate")
private WebElement save; //click on save button

public void sendcourse() {
	this.course.click();
	
}public void sendtitle(String Title) {
	this.title.sendKeys(Title);
	
}
public void sendadvancedbutton() {
	this.advancedbutton.click();
	
}	
public void sendoption() {
	this.options.click();	
}
public void sendjava() {
	this.java.click();	
}
public void sendcode(String code) {
	this.code.sendKeys(code);	
}
public void sendsubmit() {
	this.submit.click();	
}
public void sendcoursename() {
	this.coursename.click();	
}
	public void textenter(String body) {
		driver.switchTo().frame(textenter);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);//enter body
		driver.switchTo().defaultContent();
		
	}
	public void sendsave() {
		this.save.click();
		
	}
}