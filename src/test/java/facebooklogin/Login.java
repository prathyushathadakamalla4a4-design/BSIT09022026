package facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Login

{
	
WebDriver driver;

@ BeforeClass
public void p1() {
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
	@Test
	public void run() {
	// user name
	driver.findElement(By.id("email")).sendKeys("Prathyusha");
	// password
	driver.findElement(By.id("pass")).sendKeys("");
	// login button
	driver.findElement(By.name("login")).click();
	
}
}
	


