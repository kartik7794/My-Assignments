package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("kartik.R");
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaf Taps");
		driver.findElement(By.id("numberEmployees")).sendKeys("100");
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.className("smallSubmit")).click();
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		if (pagetitle.equals("Account Details | opentaps CRM")) {
			System.out.println("page is matching");
		}else {
			System.out.println("page is not maching");
		}driver.close();
		
        
       
		
		

	}

}
