package com.infy.seleniumdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test case
 * ---------
 * Launch browser(chrome)
 * open URL https://www.selenium.dev/
 * validate title should be "Selenium"
 * close browser
 * 
 * */
public class FirstSeleniumProject {

	public static void main(String[] args) {
		
		// ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");
		
		String actualTitle =driver.getTitle();
		
		if(actualTitle.equals("Selenium")) {
			System.out.println("Your title is matched with :  "+actualTitle);
		}else {
			System.out.println("Your title is not matched");
		}
		
		driver.close();
	}

}
