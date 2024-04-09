package com.selfour;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruit=driver.findElement(By.id("fruits"));
	    Select s=new Select(fruit);
        s.selectByVisibleText("Banana");
        WebElement superhero=driver.findElement(By.id("superheros"));
        Select s1=new Select(superhero);
        s1.selectByValue("am");
        s1.selectByValue("aq");
        List<WebElement> allSelected=s1.getAllSelectedOptions();
        for(WebElement selects:allSelected) {
        	System.out.println(selects.getText());
        }
        s1.deselectByIndex(1);
      	WebElement language=driver.findElement(By.id("lang"));
      	Select s2=new Select(language);
      	s2.selectByIndex(4);
      	WebElement country=driver.findElement(By.id("country"));
      	Select s3=new Select(country);
      	s3.selectByValue("India");
}
}