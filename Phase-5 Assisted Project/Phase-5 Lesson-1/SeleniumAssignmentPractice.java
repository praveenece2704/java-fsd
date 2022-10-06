package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignmentPractice {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

	driver.get("http://localhost:8090/show");
    driver.manage().window().maximize();
    driver.findElement(By.id("sid")).sendKeys("123");
    driver.findElement(By.name("sname")).sendKeys("Praveen");
    driver.findElement(By.name("pwd")).sendKeys("Pgr@654");
    driver.findElement(By.id("male")).click();
    driver.findElement(By.id("female")).click();
    driver.findElement(By.xpath("//input[@name='cricket']")).click();
    driver.findElement(By.xpath("//input[@name='football']")).click();
    Select demo1= new Select(driver.findElement(By.cssSelector("#Skills")));
	demo1.selectByVisibleText("Android");
    driver.findElement(By.name("dob")).sendKeys("12-11-2000");
    Select s=new Select(driver.findElement(By.xpath("/html/body/form/table/tbody/tr[8]/td[2]/select")));
    s.selectByVisibleText("python");
    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[9]/td[2]/textarea")).sendKeys("Welcome");
    driver.findElement(By.xpath("//input[@value='register']"));
    
    
	}

}
