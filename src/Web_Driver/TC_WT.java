package Web_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WT 
{
	public static void main(String args[]) throws Exception
	{
	    //Test Steps
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D://Selenium Class//WebTable.html");
		//count
		int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		//Data - cell
		String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(celldata);
		//data - Table
		// DT var vv
		for(int i=1; i<=row; i++) 
		{
			String data=driver.findElement(By.
			        xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			Thread.sleep(3000);
			System.out.println(data);
		}
	driver.close();
	}
}
