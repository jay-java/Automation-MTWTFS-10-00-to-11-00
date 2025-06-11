package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_WebTable {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/webtables.php";
//		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
		
//		WebElement contactEle = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[6]/td[2]/span"));
//		WebElement contactEle = driver.findElement(By.cssSelector("#customers > tbody > tr:nth-child(6) > td:nth-child(2) > span"));
		
		WebElement nameTextEle = driver.findElement(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr[4]/td[2]"));
		System.out.println(nameTextEle.getText());
		
		
		
	}
}
