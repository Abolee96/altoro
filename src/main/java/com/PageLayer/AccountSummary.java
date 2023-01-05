package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class AccountSummary extends TestBaseClass
{
	public AccountSummary()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Object repo
	@FindBy(xpath="//a[text()='View Account Summary']") 
	private WebElement account ;
	
	//Action Methods
	public void signIn()
	{
		account.click();
	}
	

}
