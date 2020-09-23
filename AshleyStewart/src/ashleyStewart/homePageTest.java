package ashleyStewart;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homePageTest {
	
	static WebDriver driver;
	
	static String homePage = "https://www.ashleystewart.com";

	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jonathan\\chromedriver_2.43.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePage);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority = 1)
	public void loginAccount() throws InterruptedException {
		
		//wait for logo to appear on page
		
		System.out.println("We are here.");
		WebElement logo = driver.findElement(By.xpath("//div[@class='hidden-mobile']//img[@title='Ashley Stewart Home Page']"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(logo)
	  		    
				));
		
		WebElement popUp = driver.findElement(By.xpath("/html/body/div[11]/div[1]/a"));
		Thread.sleep(3000);
		Boolean PopUp = driver.findElements(By.xpath("/html/body/div[11]/div[1]/a")).size() != 0;
		
		if(PopUp == true ) {
			popUp.click();
		}
		
		
		//click login button
		WebElement login = driver.findElement(By.xpath("//div[@class='header-right']//a[@title='Login'][contains(text(),'Login')]"));
		login.click();
		inputFieldWait();
		
		WebElement inputEmail = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
		inputEmail.sendKeys("vhofler@gmail.com");
		
		WebElement inputPassword = driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));
		inputPassword.sendKeys("h0peinjah");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@title='Login']"));
		loginButton.click();
		
		Thread.sleep(5000);
		WebElement myAccount = driver.findElement(By.xpath("//h1[contains(text(),'My Account | ')]"));
		if(myAccount.isDisplayed() == true) {
			System.out.println("Login Successful");
		}
		
		Thread.sleep(5000);
	}
	
	
	@AfterClass
	  public static void tearDown() {
	    driver.quit();
	    
	  }
	
	
	public void inputFieldWait() {
		
		WebElement inputEmail = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(inputEmail)
	  		    
		));
	}
	
	
	//WebElement element=driver.findElement(By.xpath("//a[@class='level-1'][contains(text(),'Dresses')]"));
}
