package test_hulu_main_page;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

import page_footer.FooterAboutUsSection;
import page_footer.FooterBrowseSection;
import page_footer.FooterHelpSection;
import page_main.Login;
	
	public class BaseTestHulu {
	
	Login objlogin;
	FooterBrowseSection objfooter;
	FooterHelpSection objfooter2;
	FooterAboutUsSection objfooter3;
	
	protected static WebDriver driver;
	static String homePage = "https://www.hulu.com/welcome";
 

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
