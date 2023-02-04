package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class TC_Verify {
	public static String un = "nareshit";
	public static String pw = "nareshit";
		public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			Thread.sleep(3000);
			
			if(driver.getTitle().equals("OrangeHRM - New Level HR Management")) {
				System.out.println("Title Matched");
			}
			else {
				System.out.println("Title not matched and expected output is: "+driver.getTitle());
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys(un);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys(pw);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			System.out.println("Login COmpleted");
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout Completed");
			driver.close();
		}
}
