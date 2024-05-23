package Create_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateEvents {
	WebDriver driver;
	public CreateEvents()
	{
		this.driver=driver;
	}
	@BeforeTest
	public void Tests()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ticketkart.com/home");
	}
	@Test
	public void Event()
	{
		
		WebElement btn = driver.findElement(By.xpath("//button[text()=\"Create an Event\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",btn);
		
	}

}
