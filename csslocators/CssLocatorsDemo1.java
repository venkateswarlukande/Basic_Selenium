package com.infy.csslocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		tag id		tag#id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("D5500");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("D5500");
		
//		tag class	tag.class
//		driver.findElement(By.cssSelector("a.ico-register")).click();
//		driver.findElement(By.cssSelector(".ico-register")).click();
		
//		tag attribute	tag[attribute="value"]
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Computer");
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Computer");
		
//		tag class attribute		tag.classv[attribute="value"]
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Mobile");
	}

}
