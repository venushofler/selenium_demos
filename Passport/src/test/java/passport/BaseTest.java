package passport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.create_Session;
import page.extend_Session;
import page.stop_Session;


public class BaseTest {
	
	 static WebDriver driver;
	 static String homePage = "https://ppprk.com/park/";
	 
	 create_Session objCreateSession;
	 extend_Session objExtendSession;
	 stop_Session objStopSession;


	 
	  @BeforeClass
	  public void setUp() throws InterruptedException{
	 
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("disable-infobars");
	  driver = new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.get(homePage);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   
	}

		@AfterClass
		 public void tearDown() throws InterruptedException {
		  driver.quit();

		 }

}
