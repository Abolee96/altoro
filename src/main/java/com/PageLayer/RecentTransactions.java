package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class RecentTransactions extends TestBaseClass
{
	public RecentTransactions()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Object repo
	@FindBy(xpath="//a[text()='View Recent Transactions']") 
	private WebElement recent ;
	
	
	//Action Methods
	public void link()
	{
		recent.click();
	}
	
	

}
