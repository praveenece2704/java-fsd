package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://accounts.lambdatest.com/register");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Praveen");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Praveen@gmail.com");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Praveen@123");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("12345676898");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//samp[@class='customcheckbox w-20 h-20 inline-block bg-white border border-gray-20 relative cursor-pointer mr-10']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@class='rounded border border-black block w-full xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 lg:h-35 xls:h-40 xlx:h-47 xxxl:h-54 xxld:h-60 h-40 tracking-widest font-bold uppercase g-recaptcha bg-black text-white  hover:bg-transparent hover:text-black']")).click();
	}
}
