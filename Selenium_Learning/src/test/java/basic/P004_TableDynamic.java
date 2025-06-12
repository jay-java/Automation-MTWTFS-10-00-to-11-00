package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P004_TableDynamic {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/webtables.php";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> thead = driver
				.findElements(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/thead/tr/th"));
		System.out.println(thead.size());

		for (int i = 1; i <= thead.size(); i++) {
			WebElement head = driver.findElement(
					By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/thead/tr/th[" + i + "]"));
			System.out.print(head.getText()+" | ");
		}
		System.out.println();
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr"));
		for(int i= 1;i<=rows.size();i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++) {
				WebElement data = driver.findElement(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(data.getText()+" | ");
			}
			System.out.println();
		}
	}
	
}
