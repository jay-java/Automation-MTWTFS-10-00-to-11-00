package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P005_WebTable {
	public static void main(String[] args) {
		String url = "https://cosmocode.io/automation-practice-webtable/";

		WebDriver driver = DriverConnection.getDriver(url);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td"));
			for (int j = 1; j <= cols.size(); j++) {
				WebElement ele = driver
						.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(ele.getText() + " | ");
			}
			System.out.println();
		}
	}
}
