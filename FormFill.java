package com.selfour.d;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.id("name")).sendKeys("vghvh");
		driver.findElement(By.id("phone")).sendKeys("7894561237");
		driver.findElement(By.id("email")).sendKeys("a@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("address")).sendKeys("7,Nehru Nagar,Chennai");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("monday")).click();
	}

}
