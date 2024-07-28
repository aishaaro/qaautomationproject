package com.qaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckCssValue {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://anilmishraqatesting.com/");
	
WebElement element=driver.findElement(By.id("um-submit-btn"));
String color=element.getCssValue("background-color");

System.out.println(color);
	
	
	}

}
