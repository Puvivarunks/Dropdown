package com.selfour.d;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert at=driver.switchTo().alert();
		at.accept();
		driver.findElement(By.className("ui-menuitem-submenu")).click();
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		driver.switchTo().alert();
		at.dismiss();
		driver.findElement(By.name("j_idt88:j_idt104")).click();
		driver.switchTo().alert();
		at.sendKeys("hi");
		at.accept();
		
		
		driver.close();
	}

}
