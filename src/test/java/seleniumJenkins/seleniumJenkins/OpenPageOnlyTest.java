package seleniumJenkins.seleniumJenkins;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OpenPageOnlyTest {
	
	WebDriver driver;
	
	
	@Test
	public void openPage() {
	 
		driver.get("https://testautomationu.applitools.com/");
		
		String title= driver.getTitle();
		Assert.assertNotNull(title);
		Assert.assertEquals(title, "Test Automation University | Applitools");
		
		driver.quit();
	}
	
	@BeforeTest
	public void beforeTest() {
		driver= new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	

}
