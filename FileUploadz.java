package com.selfour.d;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadz {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement uploadElement=driver.findElement(By.id("j_idt97:j_idt98_input"));
		uploadElement.sendKeys("I:\\screenshots 23\\1.befLogin.png");
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
