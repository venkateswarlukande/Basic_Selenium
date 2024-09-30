package com.infy.conditionalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalmethodsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
//		isDisplayed()
		boolean displayStatus =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status of logo :"+displayStatus);
	
//		isEnabled() on firstname //input[@Id='FirstName']
		boolean enabledStatus =driver.findElement(By.xpath("//input[@Id='FirstName']")).isEnabled();
		System.out.println("Enabled Status of FirstName :"+enabledStatus);
		if(enabledStatus==true) {
			driver.findElement(By.xpath("//input[@Id='FirstName']")).sendKeys("Venkateswarlu");
		}
	
//		isSelected
//		//*[@id="gender-male"]
//		//*[@id="gender-female"]
		
		WebElement male_rd= driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		WebElement female_rd= driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		
		System.out.println("Before Selection........");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		System.out.println("*****************************");
		
		male_rd.click();
		System.out.println("After Selecting male........");
		System.out.println(male_rd.isSelected());//true
		System.out.println(female_rd.isSelected());//false
		
		System.out.println("*****************************");
		
		female_rd.click();
		System.out.println("After Selecting female........");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//true
		
		
		WebElement chkbx = driver.findElement(By.xpath("//input[@id=\"Newsletter\"]"));
		System.out.println("Is Check Box Selected ? :"+chkbx.isSelected());
		
		chkbx.click();
		WebElement chkbx2 = driver.findElement(By.xpath("//input[@id=\"Newsletter\"]"));
		System.out.println("Is Check Box Selected After Click ? :"+chkbx2.isSelected());
	}

}
