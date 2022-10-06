package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment4 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	    
	    Alert alert=driver.switchTo().alert();
	    String demo=driver.switchTo().alert().getText();
	    alert.accept();
	    
	    
	    System.out.println(demo);
	    
	    driver.close();
	    
	}

}
