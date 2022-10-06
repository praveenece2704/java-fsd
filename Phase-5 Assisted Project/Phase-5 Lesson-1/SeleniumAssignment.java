package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

	driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(4000);
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrives");
    Thread.sleep(4000);
    driver.findElement(By.id("nav-search-submit-button")).click();
    Thread.sleep(6000);
    driver.findElement(By.linkText("Kingston")).click();
    Thread.sleep(6000);
    
    driver.findElement(By.partialLinkText("Kingston DataTraveler Exodia DTX/32 GB Pen Drive")).click();
    Thread.sleep(6000);
    driver.navigate().back();  // it will move back to the immedaite parent window
    
    Thread.sleep(6000);
    driver.navigate().to("https://www.facebook.com");
    
    Thread.sleep(2000);
    driver.quit();
	}

}
