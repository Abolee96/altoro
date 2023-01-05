package com.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {
	public WebDriver driver;
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Programming Tools\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testfire.net/index.jsp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
		
	}
}