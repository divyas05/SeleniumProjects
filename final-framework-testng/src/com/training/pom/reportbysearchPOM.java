package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reportbysearchPOM {
	WebDriver driver;
	public reportbysearchPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(linkText="SELENIUM FRAMEWORK")  //click on course icon
	private WebElement course; 
	@FindBy(xpath="//*[@id=\"toolimage_1811\"]")//click on reporting icon
	private WebElement Report;
	@FindBy(name="user_keyword")
	private WebElement name;//enter name in search box
	@FindBy(name="submit")
	private WebElement search;
	@FindBy(xpath="//*[contains(@title,'2rightarrow.png')]") //click on student icon
	private WebElement student;
	@FindBy(xpath="/html/body/div[1]/section/div/div[4]/table/tbody/tr/td[5]/a/img")
	private WebElement quiz;
	@FindBy(name="send_notification") //click on check box
	private WebElement sendmail; 
	@FindBy(name="submit")  
	private WebElement correcttest; 
	@FindBy(linkText="SELENIUM FRAMEWORK") 
	private WebElement coursename; 
	
	public void sendcourse()
	{
		this.course.click();
	}
	public void sendreport()
	{
		this.Report.click();
	}
	public void sendname(String names)
	{
		this.name.sendKeys(names);
	}
	public void sendsearch()
	{
		this.search.click();
	}
	public void sendstudent()
		{
			this.student.click();
	}
	public void sendquiz()
	{
		this.quiz.click();
}
	public void sendmail()
{
	this.sendmail.click();
}
	public void sendcorrecttest()
	{
		this.correcttest.click();
	}
	public void sendcoursename()
	{
		this.coursename.click();
	}


	}


