package com.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class LoginPage extends TestBaseClass
{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Object repo
	@FindBy(xpath="//font[text()='Sign In']") 
	private WebElement signin;
	@FindBy(xpath="//input[@id='uid']")
	private WebElement user;
	@FindBy(xpath="//input[@id='passw']")
	private WebElement pass;
	@FindBy(xpath="//input[@name='btnSubmit']")
	private WebElement login;
	
	//Action Methods
	//invalid credentials
	public void signIn()
	{
		signin.click();
	}
	public void userName(String username)
	{
		user.sendKeys(username);
	}
	public void passWord(String password)
	{
		pass.sendKeys(password);
	}
	public void loGin()
	{
		login.click();
	}
	
	//valid credentials
	public void signIn1()
	{
		signin.click();
	}
	public void userName1(String Username)
	{
		user.sendKeys(Username);
	}
	public void passWord1(String Password)
	{
		pass.sendKeys(Password);
	}
	public void loGin1()
	{
		login.click();
	}
	
	
	
	

}
