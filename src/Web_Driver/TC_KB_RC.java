package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_KB_RC {
public static void main(String args[]) throws Exception
{
    //Test Steps
	System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(4000);
	//click : keyboard : 1.TAB  2.ENTER
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(4000);
	System.out.println("TAB");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	System.out.println("ENTER");
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}