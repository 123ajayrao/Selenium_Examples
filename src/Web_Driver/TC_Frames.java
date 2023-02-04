package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Frames {
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
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		System.out.println("Click on Add Button");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Selenium");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Ajay");
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("New Employee Added");
		Thread.sleep(3000);
		// Exit iFrame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
