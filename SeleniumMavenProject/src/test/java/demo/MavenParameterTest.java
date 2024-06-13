package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class MavenParameterTest {
	public void receiveData() {
		String URL = System.getProperty("url");
		
		Reporter.log(URL);
		String EMAIL = System.getProperty("email");
		String PASSWORD = System.getProperty("password");
		Reporter.log(URL);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();


}
}
