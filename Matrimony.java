package Matrimony;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Matrimony {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
		Select anamika=new Select(findElement);
		anamika.selectByVisibleText("Son");
		driver.findElement(By.id("NAME")).sendKeys("Zubair");
		WebElement findElement2 = driver.findElement(By.id("DOBDAY"));
		Select one=new Select(findElement2);
		one.selectByValue("1");
		WebElement findElement3 = driver.findElement(By.id("DOBMONTH"));
		Select two=new Select(findElement3);
		two.selectByVisibleText("Mar");
		WebElement findElement4 = driver.findElement(By.id("DOBYEAR"));
		Select three=new Select(findElement4);
		three.selectByVisibleText("1954");
		WebElement findElement5 = driver.findElement(By.id("RELIGION"));
		Select four=new Select(findElement5);
		four.selectByVisibleText("Muslim - Shia");
		WebElement findElement6 = driver.findElement(By.id("CASTE_NORMAL"));
		Select five=new Select(findElement6);
		five.selectByVisibleText(" Adi Andhra ");
		WebElement findElement7 = driver.findElement(By.id("COUNTRY"));
		Select six =new Select(findElement7);
		six.selectByVisibleText("India");
		WebElement findElement8 = driver.findElement(By.id("M_COUNTRYCODE"));
		Select seven=new Select(findElement8);
		seven.selectByValue("+91");
		driver.findElement(By.id("MOBILENO")).sendKeys("11345567");
		driver.findElement(By.id("EMAIL")).sendKeys("fdcg@gmail");
		driver.findElement(By.id("PASSWORD")).sendKeys("123456789");

	}

}
