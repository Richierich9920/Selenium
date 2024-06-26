package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccessTest  extends CommonFunctions{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		loginFunction("standard_user","secret_sauce");
		if (driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"))
				.isDisplayed()) {
			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");
		}
		logout();
	}

}
