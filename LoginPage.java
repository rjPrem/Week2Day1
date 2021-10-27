package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("DemoSalesManager");
		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prem kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jagannathan");
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);
		driver.close();

	}

}
