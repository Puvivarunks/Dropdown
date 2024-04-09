package com.selfour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMeths {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().back();//insta
		driver.navigate().back();//google
		driver.navigate().forward();//insta
		driver.navigate().refresh();
		driver.close();
	}

}
