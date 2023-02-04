package Web_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Checkbox 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Thread.sleep(3000);
		// Enter into Frame
		driver.switchTo().frame("rightMenu");
		//DT Var VV for alternate i = i+2
		for(int i=1; i<=10; i++)
		{
			driver.findElement(By.xpath("")).click();
			System.out.println("Clicked on Checkbox "+ i);
			Thread.sleep(4000);
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
