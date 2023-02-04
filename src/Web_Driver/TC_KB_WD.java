package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TC_KB_WD {
public static void main(String args[]) throws Exception
{
    //Test Steps
	System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.close();
}
}