package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript1 {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	String title=driver.getTitle();
	System.out.println("Title is :" +title);
	
	WebElement emailbox=driver.findElement(By.id("Email"));
	emailbox.clear();
	emailbox.sendKeys("admin@yourstore.com");
	
	WebElement password=driver.findElement(By.id("Email"));
	password.clear();
	password.sendKeys("admin");
	
	
}
}
