package com.TestLayer;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.PageLayer.ContactUs;
import com.PageLayer.LoginPage;
import com.PageLayer.LogoutPage;
import com.PageLayer.RecentTransactions;
import com.PageLayer.TransferFunds;
import com.TestBase.TestBaseClass;
import com.Utility.UtilClass;

public class TestClass extends TestBaseClass
{ 
	public  static TestBaseClass ts;
	public  static WebDriver driver;
	public static  Logger logger;
	public static  LoginPage log;
	public static  LogoutPage logs;
	TestBaseClass t;
	
	
	@BeforeSuite
	public void testSuite()
	{
		
	}
	@BeforeClass
	public void openBrowser()
	{
		ts=new TestBaseClass();
		ts.initializeBrowser();
		log=new LoginPage(driver); 
		logger=Logger.getLogger("Altoro Mutual website framework starts");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Framework execution started");
	}
	@BeforeMethod
	public void loginsite() throws IOException
	{
	log.signIn();
	log.userName(UtilClass.getDataFromPF("username"));
	log.passWord(UtilClass.getDataFromPF("password"));
	log.loGin();
	}
	@Test
	
	public void verifyinvalidcredentials()
	{ 
		log.signIn();
		log.userName1("username");
		log.passWord1("password");
		log.loGin();
		logger.info("Please enter valid credentials");
	
	}
	@Test
	public void availableBalance() 
	{		
		String str = "87878772560000000";
		Assert.assertNotNull(str);	
	}
	@Test
	public void transfer()
	{
		TransferFunds f=new TransferFunds();
	f.link();
	String Actualmsg=" ";
	String Expected ="9876.0 was sucessfully transfer from 800000 into 800001 at 9/1/2022 at 4.58pm";
	Assert.assertEquals(Expected, Actualmsg);
	}
	@Test
	public void VerifyTransaction()
	{
		RecentTransactions r=new RecentTransactions();
		r.link();
		Assert.assertTrue(false);
	}
	@Test
	public void verifySuccessfulmsg()
	{
		
		String expectedmsg="Thank you for your comments, Admin User. They will be reviewed by our Customer Service staff and given the full attention that they deserve."
				+ " Our reply will be sent to your email: abc@gmail.com";
		ContactUs u=new ContactUs();
		u.contactLink();
		u.emailAddress();
		u.subject();
		u.Comments();
		u.submitbtn();
		Object actualmsg = null;
		Assert.assertEquals(expectedmsg,actualmsg);
	}
	
	@AfterMethod
	public void logoutsite()
	{
		logs=new LogoutPage();
		logs.signOfflink();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		logger.info("Browser closed");
	}
	@AfterSuite
	public void testSuite1()
	{
		
	}
	
}
