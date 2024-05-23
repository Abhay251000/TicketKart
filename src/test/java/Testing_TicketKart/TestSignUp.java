package Testing_TicketKart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSignUp {
	WebDriver driver;
	@BeforeTest
	public void Tests()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ticketkart.com/signup");
	}
	@Test
	public void signupPage() throws InterruptedException
	{
		Sign_page page=new Sign_page(driver);
		page.sign();
		Thread.sleep(5000);
		page.Username("Abhay Pratap Yadav");
		page.Email_id("vm.lanka2510@gmail.com");
		page.pass("Abhay@1234");
		page.confirm("Abhay@1234");
		page.sign_up();
		page.Assert();
		
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}

}
