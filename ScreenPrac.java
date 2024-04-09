package com.selfour;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenPrac {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement we=driver.findElement(By.id("email"));
		File source=we.getScreenshotAs(OutputType.FILE);
		File target=new File("J:\\SeleniumFour\\ScreenShots\\ss2.png");
		Files.copy(source, target);
	}

}
