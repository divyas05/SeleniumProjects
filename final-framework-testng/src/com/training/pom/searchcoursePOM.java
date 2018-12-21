package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchcoursePOM {
	WebDriver driver;
	public  searchcoursePOM(WebDriver driver)
	{
this.driver=driver;
PageFactory.initElements(driver, this);
}
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div[1]/div/div[3]/div/div[2]/div/ul/li[4]/a")
	private WebElement catalogue; 
	
	@FindBy(name="search_term")
	private WebElement searchbox; 
	
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")
	private WebElement clickbutton; 
	
	public void sendcatalogue() {
		this.catalogue.click();
	}
	public void sendsearch(String searchbox) {
		this.searchbox.clear();
		this.searchbox.sendKeys(searchbox);
	}
	public void sendclickbutton() {
		this.clickbutton.click();
	}
}
