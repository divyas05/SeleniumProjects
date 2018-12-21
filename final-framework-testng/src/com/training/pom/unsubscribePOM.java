package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class unsubscribePOM {
	WebDriver driver;
	public unsubscribePOM(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void createdlink()
	{
	driver.findElement(By.xpath("//*[@id=\"page\"]/div/div/div/div/div[2]/h4/a")).click();	
	
	}
	public void usericon() {
		driver.findElement(By.id("toolimage_562")).click();	
	}
	public void checkbox() {
		driver.findElement(By.name("user[]")).click();	
	}
	public void unsubbutton() {
		driver.findElement(By.linkText("Unsubscribe")).click();	
	}
	public void alert() {
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept(); 
	}
	}
