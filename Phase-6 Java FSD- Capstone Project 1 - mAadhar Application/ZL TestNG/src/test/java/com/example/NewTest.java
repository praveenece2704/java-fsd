package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
  }
  
	
	WebDriver wd;
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\95\\chromedriver.exe");
		wd = new ChromeDriver();
		// maximize the screen
		wd.manage().window().maximize();
		//login details testing
		wd.get("http://localhost:4200/");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-homepage/div/div/div[2]/div[1]/button")).click();
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-login/form/input[1]")).sendKeys("98765434567");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-login/form/input[2]")).sendKeys("praveen@gmail.com");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-login/form/input[3]")).sendKeys("12345");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-login/form/div/input")).click();
	}
	
	@Test
	public void Test2()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\95\\chromedriver.exe");
		wd = new ChromeDriver();
		// maximize the screen
		wd.manage().window().maximize();
		//registration details checking
		wd.get("http://localhost:4200/");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-homepage/div/div/div[2]/div[2]/button")).click();
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-registration/form/input[1]")).sendKeys("98765434567");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-registration/form/input[2]")).sendKeys("praveen@gmail.com");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-registration/form/input[3]")).sendKeys("12345");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-registration/form/input[4]")).sendKeys("praveen");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-registration/form/input[5]")).sendKeys("12-11-2000");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-registration/form/input[6]")).sendKeys("4852412345");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-registration/form/input[7]")).sendKeys("123,Jenkins,Salem");
		 
		// wd.findElement(By.xpath("/html/body/app-root/app-registration/form/div/input")).click();
	}
	
	@Test
	public void Test3()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\95\\chromedriver.exe");
		wd = new ChromeDriver();
		// maximize the screen
		wd.manage().window().maximize();
		//admin login testing
		wd.get("http://localhost:4200/");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-homepage/div/div/div[2]/div[3]/button")).click();
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-alogin/form/input[1]")).sendKeys("praveen");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-alogin/form/input[2]")).sendKeys("praveen@123");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-alogin/form/div/input")).click();
		 
	}
	
	@Test
	public void Test4()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\95\\chromedriver.exe");
		wd = new ChromeDriver();
		// maximize the screen
		wd.manage().window().maximize();
		wd.get("http://localhost:4200/adminlogin");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-adminlogin/div/a")).click();
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-verify/table/tbody/tr/td[11]/button[1]")).click();
		 
	}
	
	@Test
	public void done()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\95\\chromedriver.exe");
		wd = new ChromeDriver();
		// maximize the screen
		wd.manage().window().maximize();
		//main page testing
		wd.get("http://localhost:4200/main");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-main/div[1]/input")).sendKeys("praveen@gmail.com");
		 
		 wd.findElement(By.xpath("/html/body/app-root/app-main/div[2]/input")).click();
		 //apply for new aadhar
		 wd.findElement(By.xpath("/html/body/app-root/app-main/div[3]/div/div[1]/button[1]")).click();
		 
		 wd.navigate().to("http://localhost:4200/main");
		 //To update the aadhar details
		 wd.findElement(By.xpath("/html/body/app-root/app-main/div[3]/div/div[2]/button[1]")).click();
		 
		 wd.navigate().to("http://localhost:4200/main");
		 //cancel aadhar for death person
		 wd.findElement(By.xpath("/html/body/app-root/app-main/div[3]/div/div[3]/button[1]")).click();
		 
		 wd.navigate().to("http://localhost:4200/main");
		 //apply for duplicate aadhar
		 wd.findElement(By.xpath("/html/body/app-root/app-main/div[3]/div/div[4]/button[1]")).click();
		 
	}

}
