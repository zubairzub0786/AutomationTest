package Uibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiBank {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		Thread.sleep(400);
		driver.findElement(By.id("firstName")).sendKeys("Zubair");
		WebElement findElement = driver.findElement(By.name("title"));
		Select iris=new Select(findElement);
		iris.selectByVisibleText("Ms");
		driver.findElement(By.id("middleName")).sendKeys("Ahmed");
		driver.findElement(By.name("lastName")).sendKeys("A");
		WebElement findElement2 = driver.findElement(By.id("sex"));
		Select naruto=new Select(findElement2);
		naruto.selectByVisibleText("Male");
		WebElement findElement3 = driver.findElement(By.id("employmentStatus"));
		Select buruto=new Select(findElement3);
		buruto.selectByVisibleText("Full-time");
		driver.findElement(By.id("age")).sendKeys("01/02/1888");
		WebElement findElement4 = driver.findElement(By.id("maritalStatus"));
		Select karoti=new Select (findElement4);
		karoti.selectByVisibleText("Divorced");
		//WebElement findElement5 = driver.findElement(By.id("numberOfDependents"));
		//Select groot=new Select(findElement5);
		driver.findElement(By.id("username")).sendKeys("xxxyyy");
		driver.findElement(By.id("email")).sendKeys("dfg@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@class='btn btn-blue-outline form-button btn-xl']")).click();
	}
}
