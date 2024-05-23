package Sign_IN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSignIN {
	private WebDriver driver;
	
  	public void TestSignIN(WebDriver driver){
		this.driver=driver;
		
	}
	@Test(priority=0)
	public void sign()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ticketkart.com/signup");
	}
	@Test(priority=1)
	public void SingPage()
	{
		Sign_page p=new Sign_page(driver);
		p.username("ay94520@gmail.com");
		p.pass("Abhay@1234");
		p.Login();
		
	}
	@Test(priority=2)
	public void Sassert()
	{
		SoftAssert soft=new SoftAssert();
		String ActualTitle=driver.getCurrentUrl();
		String ExpectedTitle="https://www.ticketkart.com/dashboard";
		soft.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("login successful");
		
		soft.assertAll();
		
		
				
		
	}	
	@Test(priority=3)
	public void afterTest()
	{

		driver.quit();
	}

}
