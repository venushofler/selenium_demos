package ferguson;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import FergusonNavQuickLinks.QuickLinks_Showroom;
import FergusonNavQuickLinks.QuickLinks_FindALocation; 
import FergusonNavQuickLinks.QuickLinks_Orders; 
import FergusonNavQuickLinks.QuickLinks_MyLists; 

public class FergusonNavTest  {
	
	private static WebDriver driver;
	private static String homePage = "https://www.ferguson.com/";
	
	QuickLinks_Showroom quickLinks;
	QuickLinks_FindALocation quickLinks2;
	QuickLinks_Orders quickLinks3;
	QuickLinks_MyLists quickLinks4;
	
	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jonathan\\chromedriver_2.43.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePage);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
	}
	
	@Test(priority = 1)
	public void QuickLinks_Showroom() throws InterruptedException  {
		
		quickLinks = new QuickLinks_Showroom(driver);
		
		quickLinks.showroomLinkTest();

        }
	
	
	@Test(priority = 2)
	public void QuickLinks_FindALocation() throws InterruptedException  {
		
		quickLinks2 = new QuickLinks_FindALocation(driver);
		
		quickLinks2.findALocationLinkTest();
		

		
        }
	
	@Test(priority = 3)
	public void QuickLinks_Orders() throws InterruptedException{
		
		quickLinks3 = new QuickLinks_Orders(driver);
		
		quickLinks3.ordersLinkTest();
		Thread.sleep(10000);
	}
	
	
	@Test(priority = 4)
	public void QuickLinks_MyLists()  {
		
		quickLinks4 = new QuickLinks_MyLists(driver);
		quickLinks4.myListsLinkTest("venus.hofler@ferguson.com","venhof9089");
		
		
        }

}
