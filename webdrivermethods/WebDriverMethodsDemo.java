package com.infy.webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
		Thread.sleep(5000);
//		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());

//		String windowId = driver.getWindowHandle();
//		System.out.println("Window ID :"+windowId);

//		//a[contains(text(),'OrangeHRM')]
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		Set<String> hndls = driver.getWindowHandles();
		System.out.println(hndls);
	}

}
