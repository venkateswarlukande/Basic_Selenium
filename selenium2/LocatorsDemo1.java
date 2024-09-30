package com.infy.selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.name("q")).sendKeys("Apple iCam");
//		
//		boolean res =driver.findElement(By.className("header-lower")).isDisplayed();
//	
//		System.out.println(res);
		
//		driver.findElement(By.linkText("Electronics")).click();
		
//		driver.findElement(By.partialLinkText("tronics")).click();
//		
//		driver.findElement(By.linkText("Camera & photo")).click();
//		
//		driver.findElement(By.partialLinkText("D5500")).click(); //Nikon D5500 DSLR
		
		
//		List<WebElement> listOfElements = driver.findElements(By.className("sublist-toggle"));
//		System.out.println(listOfElements.size());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
//		for(WebElement lnk:links) {
//			System.out.println(lnk.getText());
//		}
		System.out.println("Total no of Links :"+links.size());
		
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("Total no of Images :"+imgList.size());
		
		
		
		driver.close();
		
	}

}
