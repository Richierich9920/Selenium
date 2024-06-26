package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFailureTest extends CommonFunctions{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		loginFunction("standard_user","sbcret_sauce");
		String errormessage = driver.findElement(By.tagName("h3")).getText();
		System.out.println(errormessage);
		if(driver.findElement(By.tagName("h3")).isDisplayed()) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}
		logout();
	}

}
