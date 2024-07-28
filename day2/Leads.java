package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kartik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1= new Select(dropdown1);
		dd1.selectByIndex(8);
		driver.findElement(By.className("smallSubmit")).click();
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		if (pageTitle.equals("View Lead | opentaps CRM")) {
		System.out.println("page title is matching");}
		else {
			System.out.println("page title is not matching");
		}
	
		driver.quit();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
