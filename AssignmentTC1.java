package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTC1 {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Sanjuktha");
	driver.findElement(By.id("lastNameField")).sendKeys("Anem");
	driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
	String text=driver.findElement(By.id("viewContact_firstName_sp")).getText();
	System.out.println("First Name :"+text);
	String text1=driver.getTitle();	
	System.out.println("Title: "+text1);
		
	}

}
