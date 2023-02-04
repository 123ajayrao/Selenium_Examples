package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import org.openqa.selenium.By;

public class TC_Windhand 
{
	public static void main(String args[]) throws Exception
	{
	    //Test Steps
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//1st wind
		driver.get("file:///D://Selenium Class//multiplewindows.html");
		Thread.sleep(4000);
		//2nd wind
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(4000);
		//3rd wind
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(4000);
		ArrayList<String> windinfo=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(0));
		Thread.sleep(4000);
		//driver.close();
		driver.quit();
	}
}
