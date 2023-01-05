package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class ContactUs extends TestBaseClass{
	public ContactUs()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Object repo
	@FindBy(xpath="//a[text()='Contact Us']") 
	private WebElement contact ;
	@FindBy(xpath="//a[text()='online form']") 
	private WebElement form ;
	@FindBy(xpath="//input[@name='email_addr']") 
	private WebElement email ;
	@FindBy(xpath="//input[@name='subject']") 
	private WebElement subject;
	@FindBy(xpath="//textarea[@name='comments']") 
	private WebElement comment  ;
	@FindBy(xpath="//input[@name='submit']") 
	private WebElement submit  ;
	
	//Action Methods
	public void contactLink()
	{
		contact.click();
	}
	public void formLink()
	{
		form.click();
	}
	public void emailAddress()
	{
		email.sendKeys("abc@gmail.com");
	}
	public void subject()
	{
		subject.sendKeys("Fund Transfer");
	}
	public void Comments()
	{
		comment.sendKeys("It is very useful to do online transaction, "
				+ "fund transfer to multiple "
				+ "users on this application."
				+ " So we can say it is very effective and simple.");
	}
	public void submitbtn()
	{
		submit.click();
	}
	
	

}
