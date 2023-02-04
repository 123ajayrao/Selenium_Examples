package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class Tc_MouseOver 
{
	static String  url     = "http://183.82.103.245/nareshit/login.php";
			static String username = "nareshit";
			static String password = "nareshit";
			static String title1   = "OrangeHRM - New Level of HR Management";
			static String title2   = "OrangeHRM";

			public static void main(String args[]) throws Exception{
			    //Test Steps
			System.setProperty("webdriver.gecko.driver",
			        "D:\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to(url);
			//Verify Page Title
			//Actual Result     compare ExpectedResult
			if(driver.getTitle().equals(title1)) {
			   System.out.println("Title matched");    
			}
			else {
			    System.out.println("Title not matched");
			    System.out.println(driver.getTitle());
			}
			/* //Test Data : hardcoded: mentioned in same step
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");  */

			//Test Data : varible: mentioned in same step
			driver.findElement(By.name("txtUserName")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			Thread.sleep(3000);

			driver.findElement(By.name("Submit")).click();
			System.out.println("Login completed");
			Thread.sleep(4000);
			//Verify Page Title
			if(driver.getTitle().equals(title2)) {
			   System.out.println("Title matched");    
			}
			else {
			    System.out.println("Title not matched ");
			    System.out.println(driver.getTitle());
			}
			//mouseover
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			Thread.sleep(4000);
			System.out.println("mouseover completed");
			driver.findElement(By.linkText("Add Employee")).click();
			System.out.println("clicked on submenu");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
			Thread.sleep(3000);
			driver.close();

			}

}
