package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001 {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Drivers\\ChromeDriver\\chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver();
		 */
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		
		//driver.get("https://www.google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("orange", Keys.ENTER);
		
		driver.close();
	}

}
