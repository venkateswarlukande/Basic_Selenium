package com.infy.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		Xpath with single attribute
//		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Venkateswarlu Kande");
	
//		Xpath with multiple attributes
//		driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("mobile");
		
//	    Xpath with 'and' 'or' operators
//		//input[@name='q' and @placeholder='Search store']
//		driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("laptop");
		
//		//input[@name='q' or @placeholder='Search store']
//		driver.findElement(By.xpath("//input[@name='p' or @placeholder='Search store']")).sendKeys("Tshirt");
	
	
//		xpath with innertext
//		driver.findElement(By.xpath("//*[text()='Computers ']")).click();
		
//		//h2[text()='Welcome to our store']
//		boolean displaystatus= driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
//		System.out.println(displaystatus);
//		
//		String text = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
//		System.out.println(text);
		
//		Xpath with contains() Method
//		//input[contains(@placeholder,'Sea')]		
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");

		
//		Xpath with stats-with() Method
//		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");
		
//		chained Xpath
		driver.findElement(By.xpath("//div[@class='item-box']/div/div/a/img")).click();

		
		
		
		
		
//		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
