package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.TestBase.TestBaseClass;

public class UtilClass extends TestBaseClass
{
	
	public WebDriver driver;
	//data fetching code from property file
	@Test
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\AltoroMutual\\testdata.properties");
	   Properties prop=new Properties();
	   prop.load(file);
	   return prop.getProperty(key);
	}
	//mouse hover code for sign in website
	public static void movetoSignIn(WebDriver driver)
	{
		WebElement signin = driver.findElement(By.xpath("//font[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		a.click();
	}
	
	//code for taking screenshot of failed testcases
	static String path="C:\\Users\\admin\\Desktop\\teams\\screenshots";
		public static void screenShots(WebDriver driver)
		{
			try
			{
				TakesScreenshot ts=((TakesScreenshot)driver);
				File src=ts.getScreenshotAs(OutputType.FILE);
				File des=new File(path);
				FileHandler.copy(src, des);
			}
			catch(IOException e)
			{
				System.out.println("Please provide correct path");
				e.printStackTrace();
			}
		}
		@Test
	public static void checkingAccountNo(WebDriver driver)
	{
		//Dropdown code for checking of available balance
		WebElement option = driver.findElement(By.xpath("//select[@name='listAccounts']"));
		Select s=new Select(option);
		s.selectByValue("800001");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
	}
		@Test
		public static void fundtransfer(WebDriver driver)
		{
		//Dropdown code for fund transfer
//		WebElement options = driver.findElement(By.xpath("//select[@id='fromAccount']"));
//		Select s1=new Select(options);
//		s.selectByVisibleText("800000");
		WebElement optionss = driver.findElement(By.xpath("//select[@id='toAccount']"));
		Select s2=new Select(optionss);
		s2.selectByIndex(800001);
		driver.findElement(By.xpath("//input[@id='transferAmount']")).sendKeys("9876");
		driver.findElement(By.xpath("//input[@name='transfer']")).click();
		}
		
		
	}
	
	
	


