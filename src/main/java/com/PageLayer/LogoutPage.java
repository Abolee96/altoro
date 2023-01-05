package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class LogoutPage extends TestBaseClass
{
	public LogoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Object repo
	@FindBy(xpath="//font[text()='Sign Off']") 
	private WebElement signoff ;
	
	
	//Action Methods
	public void signOfflink ()
	{
		signoff.click();
	}
	
}
