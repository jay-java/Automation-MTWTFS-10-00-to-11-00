package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//1.Chrome
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passwordEle = driver.findElement(By.id("pass"));
		passwordEle.sendKeys("selenium@123");
		
		WebElement loginBTN = driver.findElement(By.name("login"));
//		loginBTN.click();
//		driver.close();
		
		//Edge
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		W 	driver = new EdgeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.close();
	}
}
