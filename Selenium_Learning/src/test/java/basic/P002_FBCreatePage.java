package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P002_FBCreatePage {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement createAccountEle = driver.findElement(By.linkText("Create new account"));
		createAccountEle.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement firstNameEle = driver.findElement(By.name("firstname"));
		firstNameEle.sendKeys("selenium");

		WebElement lastNameEle = driver.findElement(By.name("lastname"));
		lastNameEle.sendKeys("learning");

		//select by index
		WebElement daysEle = driver.findElement(By.id("day"));
		Select day = new Select(daysEle);
		day.selectByIndex(14);
		
		//select by value
		WebElement monthEle = driver.findElement(By.id("month"));
		Select months = new Select(monthEle);
		months.selectByValue("10");
		
		//select by visibleText
		WebElement yearEle = driver.findElement(By.id("year"));
		Select years = new Select(yearEle);
		years.selectByVisibleText("2020");
		
		
	 	List<WebElement> gender = driver.findElements(By.id("sex"));
	 	System.out.println(gender.size());
	 	gender.get(1).click();
	 	for(WebElement e:gender) {
	 		System.out.println(e);
	 	}
	 	
	 	WebElement mobileOrEmail= driver.findElement(By.name("reg_email__"));
	 	mobileOrEmail.sendKeys("987653210");
	 	
	 	WebElement passElee =driver.findElement(By.name("reg_passwd__"));
	 	passElee.sendKeys("selenium@123");
	}
}
