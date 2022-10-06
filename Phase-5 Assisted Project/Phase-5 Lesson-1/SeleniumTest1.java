package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://gmail.com");
		 Thread.sleep(4000);
		wd.manage().window().maximize();
		
		System.out.println(wd.getTitle());
		
		wd.findElement(By.id("identifierId")).sendKeys("praveenkumar");
		
		wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		if(wd.getTitle().equalsIgnoreCase("Gmail"))
		{
			System.out.println("Test Successfull");
		}
		else
		{
			System.out.println("Test Not Successfull");
		}
		
	}

}
