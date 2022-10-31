package FaceBook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();  
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Zubair");
		driver.findElement(By.name("lastname")).sendKeys("Ahmed");
		driver.findElement(By.name("reg_email__")).sendKeys("cs195114228@bhc.edu.in");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("cs195114228@bhc.edu.in");
		driver.findElement(By.id("password_step_input")).sendKeys("zubair@02");
		WebElement birthday_day=driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(birthday_day);
		dd1.selectByIndex(19);
		WebElement birthday_month=driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(birthday_month);
		dd2.selectByValue("12");
		WebElement birthday_year=driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(birthday_year);
		dd3.selectByVisibleText("2001");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	}

}
