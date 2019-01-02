/*To verify whether application allows teacher to add project details*/
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class newProjectPOM {
	
	WebDriver driver; 
	public newProjectPOM(WebDriver driver)
	{
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="SELENIUM FRAMEWORK")
	private WebElement course; 
	@FindBy(id="toolimage_645")
	private WebElement project;
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/a/img")
    private WebElement newproject;
	@FindBy(id="add_blog_blog_name")
	private WebElement title;
	@FindBy(name="blog_subtitle")
	private WebElement subtitle;
	@FindBy(name="submit")
	private WebElement savebutton; //till this step project created
	
	@FindBy(linkText="eLearning")       //NEWTASK CREATION
	private WebElement elearn; 
	@FindBy(linkText="Welcome !")
	public WebElement message; 
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a[2]/img")
	private WebElement newtask;
	@FindBy(name="title")
	private WebElement tasktitle;
	@FindBy(name="save")
	private WebElement Submit;           //task created
	
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a[3]/img")//ROLES  MANAGEMENT
	private WebElement roles;
	@FindBy(linkText="Add a new role")
	private WebElement newrole;
	@FindBy(name="task_name")
	private WebElement roletitle;
	@FindBy(name="Submit")
	private WebElement rolesave;     // role created
	
	@FindBy(linkText="Assign roles")//Assign Roles
	private WebElement assign;
	@FindBy(name="task_user_id")
	private WebElement user;
	@FindBy(linkText="man men")
	private WebElement teacher;
	@FindBy(name="submit")
	private WebElement usersubmit;  //Roles assigned
	
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a[4]/img") //user management
	private WebElement usermanage;
    @FindBy(css="input[value='15']") 
    private WebElement userlist;
	@FindBy(linkText="Register")
	private WebElement register;
	
public void sendcourse()
{
	this.course.click();
	}
public void sendproject()
{
	this.project.click();
	}
public void sendnewproject()
{
	this.newproject.click();
	}
public void sendtitle(String Title)
{
	this.title.clear();
	this.title.sendKeys(Title);
	}
public void sendsubtitle(String subTitle)
{
	this.subtitle.sendKeys(subTitle);
	}
public void sendsubmit()
{
	this.savebutton.click();
	}                                       //project created

public void sendelearn()
{
	this.elearn.click();
	}
public void sendmsg()
{
	this.message.getText();
	}
public void sendnewtask()
{
	this.newtask.click();
	}
public void sendtasktitle(String Title)
{
	this.tasktitle.clear();
	this.tasktitle.sendKeys(Title);
	}
public void sendSubmit()
{
	this.Submit.click();                     //task created
	}
public void sendroles()
{this.roles.click();                         //role creation
}
public void sendnewroles()
{this.newrole.click();       
}
public void sendroletitle(String Title)
{
	this.roletitle.clear();
	this.roletitle.sendKeys(Title);
	}
public void sendrolesave()
{this.rolesave.click();       //role created
}

public void sendassign()       //assign role
{
this.assign.click();
}
public void senduser()
{
this.user.click();
}
public void sendteacher()
{
this.teacher.click();        
}
public void sendusersubmit()
{
this.usersubmit.click();        //role assigned
}

public void sendusermanage()
{
this.usermanage.click();
}
public void senduserlist()
{
this.userlist.click();        //role assigned
}

public void sendregister()
{
this.register.click();        //role assigned
}



}