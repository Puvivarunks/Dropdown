package com.selfour.d;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPaths {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement
		(By.xpath("//input[@aria-label='Email address or phone number']"));
		w.sendKeys("a@gmail.com");
		WebElement e=driver.findElement
		(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String s=e.getText();
		System.out.println(s);
		driver.findElement(By.xpath("//a[contains(@class,'_42ft')]")).click();
	}

}
