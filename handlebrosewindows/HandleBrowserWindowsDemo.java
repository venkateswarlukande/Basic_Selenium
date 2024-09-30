package com.infy.handlebrosewindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
//		//a[contains(text(),'OrangeHRM, Inc')]
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
//		//Approach1
//		List<String> windowList = new ArrayList<String>(windowIDs);
//		String parentId =windowList.get(0);
//		String childId =windowList.get(1);
//
////		Switch to child window
//		driver.switchTo().window(childId);
//		
//		System.out.println(driver.getTitle());
//		
////		Switch to parent window
//		driver.switchTo().window(parentId);
//		
//		System.out.println(driver.getTitle());
		
		
//		Approach2
		for(String winId:windowIDs) {
			String title =driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
	}

}
