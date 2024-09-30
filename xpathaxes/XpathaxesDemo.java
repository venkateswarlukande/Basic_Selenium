package com.infy.xpathaxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathaxesDemo {

	public static void main(String[] args) {
		// "C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Google Chrome.lnk"

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
//		self
		String text = driver.findElement(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/self::a")).getText();
		System.out.println(text);
		
//		parent
//		//a[contains(text(),'Rashtriya Chemicals')]/parent::*
//		//a[contains(text(),'Rashtriya Chemicals')]/parent::td
		text =driver.findElement(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/parent::td")).getText();
		System.out.println(text);

//		child
		
//		a-->ancestor-->child
//		//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr
//		//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr/child::td
		
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements :"+childs.size());
	
//		Ancestor
//		//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr
		
		text =driver.findElement(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr")).getText();
		System.out.println(text);
	
//		Descendant
//		//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr/descedants::*
		List<WebElement> desc=  driver.findElements(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr/descendant::*"));
		System.out.println("No Of Descedants Nodes :"+desc.size());
		
//		Following
//		//a[contains(text(),'Rashtriya Chemicals')]/following::*
		List<WebElement> follele = driver.findElements(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/following::*"));
		System.out.println("No of Following Nodes :"+follele.size());

//		Following-sibling
//		//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr/following-sibling::*
		List<WebElement> follosibli=  driver.findElements(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/ancestor::tr/following-sibling::tr"));
		System.out.println("No of Following-siblings Nodes :"+follosibli.size());	
		
//		Preceding
//		//a[contains(text(),'Rashtriya Chemicals')]/preceding::*
		List<WebElement> prele = driver.findElements(By.xpath("//a[contains(text(),'Rashtriya Chemicals')]/preceding::*"));
		System.out.println("No of Preceding Nodes :"+prele.size());
		
		
		
		driver.close();
	}

}
