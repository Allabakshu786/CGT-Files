package pageObjects;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import applicationUtilities.ApplicationUtilities;
import generalUtilities.ReadProperties;

public class FileUpload {

	WebDriver driver;
	ApplicationUtilities appUts;
	ReadProperties readprop;

	public FileUpload(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		appUts = new ApplicationUtilities(driver);
		readprop = new ReadProperties("testData/TestData.properties");

	}

	public void fileUpload() {
		System.out.println(" Start PO : fileUpload");
		System.out.println("fileUpload");
		appUts.returnAnElement("xpath", "//span[@class='upload-icon']").click();
		appUts.returnAnElement("id", "name").sendKeys("Johnny");
		appUts.returnAnElement("id", "mob_no").sendKeys("9876543210");
		WebElement uploadElement = appUts.returnAnElement("id", "wordresume");
		uploadElement.sendKeys("C:\\Users\\Johnny\\Downloads\\1.txt");
		appUts.returnAnElement("id", "pop_sbm").click();

		System.out.println(" End PO : fileUpload");
	}

	public void fileUploadAutoIT() {
		// TODO Auto-generated method stub
		System.out.println(" Start PO : fileUploadAutoIT");
		System.out.println("fileUploadAutoIT");
		appUts.returnAnElement("xpath", "//span[@class='upload-icon']").click();
		appUts.returnAnElement("id", "name").sendKeys("Johnny");
		appUts.returnAnElement("id", "mob_no").sendKeys("9876543210");
		appUts.returnAnElement("id", "wordresume").click();
		String path = System.getProperty("user.dir");
		try {
			Runtime.getRuntime().exec("C:\\Java\\Selenium\\CGT\\AutoIT\\fileupload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appUts.returnAnElement("id", "pop_sbm").click();

		System.out.println(" End PO : fileUploadAutoIT");
		
	}

}
