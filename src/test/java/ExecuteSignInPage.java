import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ExecuteSignInPage {
	WebDriver driver;
	
	public void Tests()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ticketkart.com/signup");
		System.out.println(driver.getCurrentUrl());

	}

}
