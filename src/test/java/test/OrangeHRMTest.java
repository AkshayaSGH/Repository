package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	public WebDriver driver;
	@BeforeMethod
	public void Launch() {
		System.setProperty("webdriver.chrome.driver","E:\\Akshaya\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
@DataProvider(name="VerifyLogin")
public Object[][] getData(){
	Object[][] data = new Object[3][2];
	  
	data[0][0]="Admin";
	data[0][1]="admin123";	
	data[1][0]="Adminn";
	data[1][1]="admin123";	
	data[2][0]="Admin";
	data[2][1]="admin1234";
	 return data;
}
@Test(dataProvider="VerifyLogin")
public void VerifyLogin(String UserName, String PassWord)
{
driver.findElement(By.id("txtUsername")).sendKeys(UserName);
driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
driver.findElement(By.id("btnLogin")).click();
}
}
