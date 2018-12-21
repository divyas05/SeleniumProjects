package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class addDescriptionPOM {
	
	WebDriver driver; 
	public addDescriptionPOM(WebDriver driver)
	{
	this.driver = driver; 
	}

	public void createdlink()
	{
	driver.findElement(By.xpath("//*[@id=\"page\"]/div/div/div/div/div[2]/h4/a")).click();	
	}
	public void icon() {
		driver.findElement(By.id("toolimage_553")).click();	
	}
	public void desc()
	{
	driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/a[1]/img")).click();	
	}
	public void title_desc() {
		driver.findElement(By.name("title")).sendKeys("selenium course for beginners");	
	}
	public void desc_body() {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys("selenium course for beginners");
		driver.switchTo().defaultContent();
	}
	public void submit() {
		driver.findElement(By.name("submit")).click();
	}
	}// WebElement introtext =driver.findElement(By.xpath("//*[@id="course_tools"]/div[1]/div/div[1]/p[2]"));