package bootstrap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PopUpHandling {
	WebDriver driver;
	ChromeOptions options;
	Actions action;

	public PopUpHandling() {
		// TODO Auto-generated constructor stub
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\browser\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://mdbootstrap.com/docs/jquery/modals/forms/");
		action = new Actions(driver);

	}

	@Test
	public void defualtTest() {
		System.out.println("defualtTest");
		driver.findElement(By.xpath("//a[@class='btn btn-default btn-rounded my-3 waves-effect waves-light']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='modalLRInput1']")).click();
		driver.findElement(By.xpath("//input[@id='modalLRInput1']")).sendKeys("Allabakshu");
		action.sendKeys(Keys.ESCAPE).build().perform();
		// driver.findElement(By.id("//a[contains(text(),'Modal Register Form')]")).click();
	}

}
