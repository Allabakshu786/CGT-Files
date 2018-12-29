package pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import applicationUtilities.ApplicationUtilities;
import generalUtilities.ReadProperties;

public class Alerts {

	WebDriver driver;
	ApplicationUtilities appUts;
	ReadProperties readprop;

	public Alerts(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		appUts = new ApplicationUtilities(driver);
		readprop = new ReadProperties("testData/TestData.properties");

	}

	@BeforeMethod
	public void beforeLoginToApplication() {
		// driver.findElement(By.id("loginText")).click();
		// driver.manage().window().maximize();
	}
	Alert myAlert;
	public void alertHandling() {
		System.out.println(" Start PO : loginToApplication");
		System.out.println("loginToApplication");
		driver.manage().window().maximize();
		driver.get("http://www.apsrtconline.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		driver.findElement(By.name("searchBtn")).click();
		 myAlert = driver.switchTo().alert();
		System.out.println("Text on the alert :" + myAlert.getText());
		myAlert.accept();
		driver.findElement(By.name("source")).sendKeys("Hyderabad");
		driver.findElement(By.name("searchBtn")).click();
		 myAlert = driver.switchTo().alert();
		System.out.println("Text on the alert :" + myAlert.getText());
		myAlert.accept();
		driver.findElement(By.name("destination")).sendKeys("Piler");
		driver.close();
		System.out.println(" End PO : loginToApplication");
	}

	public void logoutFromApplication() {
		System.out.println(" Start PO : logoutFromApplication");
		
		appUts.returnAnElement("id","welcome").click();
		appUts.returnAnElement("xpath","//a[text()='Logout']").click();

		System.out.println(" End PO : logoutFromApplication");

	}



}
