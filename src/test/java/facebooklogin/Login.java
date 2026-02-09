package facebooklogin;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class Login

{
// driver 	intilalization
WebDriver driver;
String browser = System.getProperty("browser");

@ BeforeTest
//@Parameters (  "browser" )
public void p1() 
{
	System.out.println(browser);
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
	@Test
	public void run() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THADAKAMALLA\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		  //WebDriverManager.chromedriver().setup();
		  ChromeOptions options = new ChromeOptions();
	      //options.addArguments("--start-maximized");
	      options.addArguments("--remote-allow-origins=*"); 
	      options.addArguments("--start-maximized");
	// user name
	driver.findElement(By.id("email")).sendKeys("Prathyusha");
	// password
	driver.findElement(By.id("pass")).sendKeys("");
	// login button
	driver.findElement(By.name("login")).click();
	
}
}
	


