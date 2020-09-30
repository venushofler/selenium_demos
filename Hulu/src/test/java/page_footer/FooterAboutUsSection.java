package page_footer;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import test_hulu_main_page.BaseTestHulu;


public class FooterAboutUsSection extends BaseTestHulu{
	
	WebDriver driver;
	
	By huluFooter = By.xpath("//footer[@id='FooterLg']");
	
	//column6:
	By press = By.xpath("//a[contains(text(),'Press')]");
	By jobs = By.xpath("//a[contains(text(),'Jobs')]");
	By contact = By.xpath("//a[contains(text(),'Contact')]");

	public FooterAboutUsSection (WebDriver driver) {
		this.driver = driver;
	}
	
   //--------------- Elements and Methods  -------------------------------
	
	 public void verifyHuluFooter() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(huluFooter)
	  		    
				));
	   }
	
	 public void scrollToFooter() throws InterruptedException {
		 WebElement element = driver.findElement(By.xpath("//div[@class='jsx-4066518690 footer--row footer--site-links']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
	   }
	 
	 public void clickPressLink() {
		 driver.findElement(press).click();
		 driver.navigate().back();
	   }
	 
	 public void clickJobsLink() {
		 driver.findElement(jobs).click();
		 driver.navigate().back();
	   }
	 
	 public void clickContactLink() {
		 driver.findElement(contact).click();
		 driver.navigate().back();
	   }
	 

	 

	 
	 
	 
	 
	 // --- main method called ---

	 public void scroll2Footer() throws InterruptedException {
			this.verifyHuluFooter();
			Thread.sleep(2000);
			this.scrollToFooter();
			Thread.sleep(2000);
			
			this.clickPressLink();
			Thread.sleep(2000);
			
			this.clickJobsLink();
			Thread.sleep(2000);
			
			this.clickContactLink();	
			Thread.sleep(9000);
		   }
	 
	 
	 public void column6() throws InterruptedException {
			// column6:
			this.clickPressLink();
			Thread.sleep(2000);
			this.clickJobsLink();
			Thread.sleep(2000);
			this.clickContactLink();
			Thread.sleep(9000);
			
		   }
	 
}
