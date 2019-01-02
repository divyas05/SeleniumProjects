package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportingPOM {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public ReportingPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 
	}
	

	@FindBy(linkText="SELENIUM FRAMEWORK")  //crate group
	private WebElement course; 
	@FindBy(xpath="//*[@id=\"toolimage_646\"]")//report
	private WebElement Report;
	@FindBy(xpath="//*[contains(@href,'myStudents.php?student=15')contains(@title,'2rightarrow.png')]") //student
	private WebElement student;
	@FindBy(xpath="/html/body/div[1]/section/div/div[4]/table/tbody/tr/td[5]/a/img")//click on quiz
	private WebElement quiz;
	@FindBy(linkText="Send email") //click on checkbox
	private WebElement sendmail; 
	@FindBy(name="submit")  //click on submit
	private WebElement correcttest; 
	@FindBy(linkText="SELENIUM FRAMEWORK") 
	private WebElement coursename;//click on course
	
	public void sendcourse()
	{
		this.course.click();
	}
	public void sendreport()
	{
		this.Report.click();//report
	}
	
	public void sendstudent()
		{
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			this.student.click();//
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


