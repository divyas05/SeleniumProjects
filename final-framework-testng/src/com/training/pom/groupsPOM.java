package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class groupsPOM {

	WebDriver driver;
	public groupsPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="SELENIUM FRAMEWORK")  //crate group
	private WebElement course; 
	@FindBy(linkText="Groups")
	private WebElement Groups;
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div/div[1]/a[1]/img")
	private WebElement newgrp;
	@FindBy(name="number_of_groups")
	private WebElement groupcount; 
	@FindBy(name="submit")
	private WebElement groupsubmit; 
	                                        //enter group name
	@FindBy(name="group_0_name")
	private WebElement groupname;  
	@FindBy(name="submit")
	private WebElement namesubmit; 
	                                           //add members
	@FindBy(xpath="/html/body/div[1]/section/div/div[4]/table[1]/tbody/tr[2]/td[4]/a[3]/img")
	private WebElement newmem;   
	@FindBy(xpath="//*[@id=\"group_members-f\"]/option[5]") 
    private WebElement namelist;
	@FindBy(name="add")
	private WebElement add; 
	@FindBy(xpath="//*[@id=\"group_members-f\"]/option[5]") 
    private WebElement userlist;
	@FindBy(id="group_edit_submit") 
    private WebElement saveset;
	                                       //edit settings
    @FindBy(xpath="/html/body/div[1]/section/div/div[3]/div/div[1]/a[2]/img")
    private WebElement edit;        
    @FindBy(name="self_reg_allowed")
	private WebElement register; 
    @FindBy(name="self_unreg_allowed")
   	private WebElement unregister; 
    @FindBy(id="group_category_submit")
	private WebElement editbutton; 
    
    public void sendcourse()
	{
		this.course.click();
	}
	public void sendGroups()
	{
		this.Groups.click();
	}
	public void sendnewgrp()
	{
		this.newgrp.click();
	}
	public void sendgroupcount(String title)
	{
		this.groupcount.clear();
		this.groupcount.sendKeys(title);
	}
	public void sendgroupsubmit()
	{
		this.groupsubmit.click();
	}
	public void sendgroupname(String name)
	{
		this.groupname.clear();
		this.groupname.sendKeys(name);
	}
	public void sendnamesubmit()
	{
		this.namesubmit.click();
	}
	public void sendnewmem()
	{
		this.newmem.click();
	}
	public void sendnamelist()
	{
		this.namelist.click();
	}
	public void sendadd()
	{
		this.add.click();
	}
	public void senduserlist()
	{
		this.userlist.click();
	}
	public void sendusaveset()
	{
		this.saveset.click();
	}
	public void sendedit()
	{
		this.edit.click();
	}
	public void sendregister()
	{
		this.register.click();
	}
	public void sendunregister()
	{
		this.unregister.click();
	}
	public void sendeditbutton()
	{
		this.editbutton.click();
	}
		
	}
	

