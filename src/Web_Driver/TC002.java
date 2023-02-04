package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC002 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		System.out.println("Applicatino Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Thread.sleep(3000);
		driver.close();
		
	}

}
