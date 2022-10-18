package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @BeforeTest
  public void Test() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");

	    driver = new ChromeDriver();

		driver.manage().window().maximize();
  }
  
  @Test
  public void Execution() throws InterruptedException
  {
	  long start = System.currentTimeMillis();

		driver.get("https://www.flipkart.com/");

		long stop = System.currentTimeMillis();

		System.out.println("Total load time " + (stop - start) + " Milli seconds");

		System.out.println("Total load time " + ((stop - start)/1000) + " Seconds");

		System.out.println(driver.getTitle());
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", driver.getTitle());
		System.out.println(driver.getCurrentUrl());
        Assert.assertEquals("https://www.flipkart.com/", driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		 driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone 13");
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	      Thread.sleep(5000);
	      //image present or not
	      WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
	    	      Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " +
	      "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", ImageFile);
	              
	    	      if (ImagePresent) {
	    	          System.out.println("Image Loaded");
	    	       } else {
	    	          System.out.println("Image not Loaded");
	    	       }
	 

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().refresh();
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,3000)", "");
		
		System.out.println("Page has a scroll feature");
		Thread.sleep(6000);

		// scroll to the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		driver.navigate().refresh();
		// scroll till the height mentioned
		js.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(3000);
		ImageFile = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[6]/div/div/div/a/div[1]/div[1]/div/div/img"));
		ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0",
				ImageFile);

		if (ImagePresent) {
			System.out.println("Downloading image while scrolling");
		} else {
			System.out.println("Image not Loaded");
		}
		
		Thread.sleep(6000);
		driver.manage().window().setSize(new Dimension(800, 600));
		
		Thread.sleep(3000);
		Dimension initial_size = driver.manage().window().getSize();
	    int height = initial_size.getHeight();
	    int width = initial_size.getWidth();
	    
	    Assert.assertEquals(600, height);
	    
	    Assert.assertEquals(800, width);
	    
	    System.out.println("Current Resolution is " + width+" x "+height);
  }
  
  @AfterTest
  public void end() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.close();
  }
}
