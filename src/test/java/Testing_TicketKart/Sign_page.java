package Testing_TicketKart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Sign_page {
	WebDriver driver;
	public Sign_page(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.xpath("//input[@placeholder=\"Enter Full Name\"]");
	By email=By.xpath("//input[@placeholder=\"Enter Email Address\"]");
	By password=By.xpath("(//input[@type=\"password\"])[2]");
	By  pass_confirm= By.xpath("//input[@placeholder=\"Confirm a password (Must be at least 8 characters)\"]");
	
	public void sign()
	{
		driver.findElement(By.id("sign-up-btn")).click();
	}
	
	public void Username(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void Email_id(String emails)
	{
		driver.findElement(email).sendKeys(emails);
	}
	public void pass(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void confirm(String confirmation)
	{
		driver.findElement(pass_confirm).sendKeys(confirmation);
	}
	
	public void sign_up()
	{
		
		WebElement btn = driver.findElement(By.xpath("//input[@value=\"Sign up\"]"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",btn);
	}
	public void Assert()
	{
		String ActualTitle=driver.getCurrentUrl();
		String ExpectedTitle="https://www.ticketkart.com/signup";
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("account created successfully");
	}

}
