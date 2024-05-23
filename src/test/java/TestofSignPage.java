import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestofSignPage {
	WebDriver driver;
	public void Sign_In()
	{
		this.driver=driver;
	}
	By username=By.id("name");
	By pass=By.id("password");
	
	public void username(String name)
	{
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(name);
	}
	public void pass(String password)
	{
     driver.findElement(By.xpath("sendKeys(name);")).sendKeys(password);
	}
	public void Login()
	{
		driver.findElement(By.xpath("//input[@class=\"btn solid\"]"));
	}
	

}
