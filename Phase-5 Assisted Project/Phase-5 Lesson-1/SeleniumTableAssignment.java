package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTableAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   // WebElement baseTable=driver.findElement(By.tagName("table"));
	    
	    WebElement tableRow = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]"));
	   String val=tableRow.getText();
	   System.out.println(val);
	}
}
