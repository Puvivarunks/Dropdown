package com.selfour.d;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShots {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File target=new File("J:\\SeleniumFour\\ScreenShots\\ssone.png");
	    Files.copy(source, target);
	}

}
