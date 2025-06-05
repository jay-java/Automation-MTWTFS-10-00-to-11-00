package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//1.Chrome
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.close();
		
		//Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
}
