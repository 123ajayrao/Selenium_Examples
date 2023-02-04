package Web_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

public class TC_DaragDrop 
{
	public static void main(String[] args) throws Exception
	{
		//Test Steps
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/#content");
		Thread.sleep(4000);
		//Verify the title: stop the exe in case of cond: fail
		assertEquals(driver.getTitle(), "Droppable | JQuery UI");
		System.out.println("Title matched");
		//Enter into frame
		driver.switchTo().frame(0);
		//dragdrop
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")),
				driver.findElement(By.id("droppable"))).perform();
		System.out.println("Dargdrop");
		Thread.sleep(4000);
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.close();
	}

}
