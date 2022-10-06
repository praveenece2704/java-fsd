package com.example;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://demo.automationtesting.in/Register.html");
		
		wd.manage().window().maximize();
		
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("praveen");
		// Thread.sleep(4000);
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("praveen");
		// Thread.sleep(4000);
		wd.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Mecheri,Salem");
		// Thread.sleep(4000);
		wd.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("praveen@gmail.com");
		// Thread.sleep(4000);
		wd.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
		// Thread.sleep(4000);
		wd.findElement(By.xpath("//input[@value='Male']")).click();
		//Thread.sleep(4000);
		wd.findElement(By.xpath("//input[@value='FeMale']")).click();
		//Thread.sleep(4000);
		wd.findElement(By.id("checkbox1")).click();
		
		wd.findElement(By.id("checkbox2")).click();
		
		wd.findElement(By.id("checkbox3")).click();
		
		wd.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[2]")).click();
		wd.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[4]")).click();
		wd.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[5]")).click();
		
		
		
		Select demo1= new Select(wd.findElement(By.cssSelector("#Skills")));
		demo1.selectByVisibleText("Android");
		
        wd.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]")).click();
        wd.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("India");
        wd.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);

		
		Select demo3= new Select(wd.findElement(By.id("yearbox")));
		demo3.selectByVisibleText("1916");
		
		Select demo4= new Select(wd.findElement(By.xpath("//select[@placeholder='Month']")));
		demo4.selectByVisibleText("January");
		
		Select demo5= new Select(wd.findElement(By.id("daybox")));
		demo5.selectByVisibleText("10");
		
		wd.findElement(By.cssSelector("#firstpassword")).sendKeys("praveen");
		
		wd.findElement(By.cssSelector("#secondpassword")).sendKeys("praveen");
		
		wd.findElement(By.id("submitbtn")).click();
		
		
	}
		
}
