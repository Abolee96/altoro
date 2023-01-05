package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class TransferFunds extends TestBaseClass 
{
	public TransferFunds()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Object repo
	@FindBy(xpath="//a[text()='Transfer Funds']") 
	private WebElement transferlink;
	
	
	//Action Methods
	public void link()
	{
		transferlink.click();
	}
	
	

}
