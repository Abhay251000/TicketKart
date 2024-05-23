package Sign_IN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.IAssert;

public class Sign_page {
	private WebDriver driver;
	
	public Sign_page(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.xpath("(//input[@name=\"email\"])[1]");
	By pass=By.xpath("//input[@placeholder=\"Password\"]");
	
	public void username(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	public void pass(String password)
	{
     driver.findElement(pass).sendKeys(password);
	}
	public void Login()
	{
		driver.findElement(By.xpath("//input[@class=\"btn solid\"]")).click();
	}
	

}
