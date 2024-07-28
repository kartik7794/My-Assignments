package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kartik");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("8248309076");
		driver.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys("peace2024");
		WebElement day = driver.findElement(By.id("day"));
		Select d1=new Select(day);
		d1.selectByIndex(6);
		WebElement month = driver.findElement(By.id("month"));
		Select d2=new Select(month);
		d2.selectByIndex(6);
		WebElement year = driver.findElement(By.id("year"));Select d3=new Select(year);
		Select d33=new Select(year);
		d33.selectByIndex(30);
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		
		
		
		
		
		
		

	}

}
