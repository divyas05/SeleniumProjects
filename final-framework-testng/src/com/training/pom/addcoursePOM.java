package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class addcoursePOM{
	
	WebDriver driver; 
	public addcoursePOM(WebDriver driver)
	{
	this.driver = driver; 
	}

		
	public void enter() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div[1]/div/div[3]/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys("SELENIUM FRAMEWORK");
		Thread.sleep(3000);
	}
		
	public void details() throws InterruptedException {
		driver.findElement(By.id("advanced_params")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/button/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.name("wanted_code")).sendKeys("java");
		
	}
	public void submit() {
		driver.findElement(By.name("submit")).click();
	}
	public void introtext() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"course_tools\"]/div[1]/div/div[1]/a")).click();
		Thread.sleep(5000);
	}
	public void textenter() {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys("this is seleniumcourse");
		driver.switchTo().defaultContent();
		
	}
	public void save() {
		driver.findElement(By.name("intro_cmdUpdate")).click();
		
	}
}