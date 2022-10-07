package com.example;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Automation {
  @Test(priority=1)
  public void test1() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Desktop\\Phase 5 Documents\\jars\\chromedriver.exe");
		
	  WebDriver driver=new ChromeDriver();
		
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");
	  Thread.sleep(1000);
	  
	  Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
	  
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#ap_email")).sendKeys("praveenkumar");
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	  
	  System.out.println("Login Error"+driver.findElement(By.className("a-alert-heading")).getText());
	  
	  System.out.println(driver.findElement(By.className("a-list-item")).getText());
	  
	  Thread.sleep(1000);
	  driver.findElement(By.id("createAccountSubmit")).click();
	  
	  Thread.sleep(1000);
	  driver.findElement(By.name("customerName")).sendKeys("praveen");
	  
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#ap_phone_number")).sendKeys("8538673947");
	  
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#ap_email")).sendKeys("praveen.com"); //for invalid registration
	  
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#ap_password")).sendKeys("Yuva@123");
	  
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#continue")).click();
	  
	  Thread.sleep(1000);
	  String error=driver.findElement(By.xpath("//*[@id=\"auth-email-invalid-email-alert\"]/div/div")).getText();
	  System.out.println("Registration Error "+error);
	  Thread.sleep(1000);
	  Assert.assertEquals(error, "Enter a valid email address");
	
	    driver.navigate().to("https://www.amazon.in/");
	    
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrives");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("HP")).click();
	    Thread.sleep(1000);
	    driver.getWindowHandle();	
	    Thread.sleep(1000);
	    driver.findElement(By.partialLinkText("HP v236w USB 2.0 64GB Pen Drive")).click();
	    Thread.sleep(3000);
	    String MainWindow=driver.getWindowHandle();		
        System.out.println("current window handler:  "+ MainWindow);
        
        Thread.sleep(3000);
        
        Set<String> s1=driver.getWindowHandles();  
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();	
            System.out.println("current child window handler:  "+ ChildWindow);
            Thread.sleep(2000); 
            
            Assert.assertNotSame(MainWindow,ChildWindow);
            
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
            	   driver.switchTo().window(ChildWindow);
            	  
            	   driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
         	       
         	       driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
                  
            driver.close();		
            }		
        }
	   
  }
  
}
