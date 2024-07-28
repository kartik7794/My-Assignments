package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")). sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//*[@type='password']")). sendKeys("crmsfa");
		driver.findElement(By.xpath("//*[@type='submit']")). click();

	}

}
//input[@id='password']/preceding::label
//label[text()='Username']/following-sibling::input
//input[@id='username']/preceding-sibling::label