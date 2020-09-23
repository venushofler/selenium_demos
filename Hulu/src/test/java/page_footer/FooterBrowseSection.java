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


public class FooterBrowseSection {
	
	WebDriver driver;
	
	//column1:
	By huluFooter = By.xpath("//footer[@id='FooterLg']");
	By streamingLibLink = By.xpath("//a[contains(text(),'Streaming Library')]");
	By liveTVLink = By.xpath("//div[@class='footer-section-container col-lg-8 col-md-12 footer-section-container-single col-xs-12']//div[@class='footer-row-expandable footer-row-collapsed']//div[1]//a[2]");
	By liveNewsLink = By.xpath("//a[contains(text(),'Live News')]");
	By liveSportsLink = By.xpath("//a[contains(text(),'Live Sports')]");
	
	// column2:
	By tvShowsLink = By.xpath("//a[contains(text(),'TV Shows')]");
	By moviesLink = By.xpath("//a[contains(text(),'Movies')]");
	By originalsLink = By.xpath("//a[contains(text(),'Originals')]");
	By networksLink = By.xpath("//a[contains(text(),'Networks')]");
	By kidsLink = By.xpath("//a[contains(text(),'Kids')]");
	By fxOnHuluLink = By.xpath("//a[contains(text(),'FX on Hulu')]");
	
	// column3:
	By hboMaxLink = By.xpath("//a[contains(text(),'HBO Max')]");
	By cinemaxLink = By.xpath("//a[contains(text(),'Cinemax')]");
	By showtimeLink = By.xpath("//a[contains(text(),'Showtime')]");
	By starzLink = By.xpath("//a[contains(text(),'STARZ')]");
	
	// column4:
	By huluDisEspnLink = By.xpath("//a[contains(text(),'Hulu, Disney+, and ESPN+')]");
	By disBundleNoAdsLink = By.xpath("//a[contains(text(),'Disney bundle with Hulu (No Ads)')]");
	By disBundleLiveTVlink = By.xpath("//a[contains(text(),'Disney bundle with Hulu + Live TV')]");
	
	//column5:
	By accountBilling = By.xpath("//a[contains(text(),'Account & Billing')]");
	By plansPricing = By.xpath("//a[contains(text(),'Plans & Pricing')]");
	By supportedDevices = By.xpath("//a[contains(text(),'Supported Devices')]");
	By accessibility = By.xpath("//a[contains(text(),'Supported Devices')]");
	
	//column6:
	By press = By.xpath("//a[contains(text(),'Press')]");
	By jobs = By.xpath("//a[contains(text(),'Jobs')]");
	By contact = By.xpath("//a[contains(text(),'Contact')]");
	
	public FooterBrowseSection (WebDriver driver) {
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
		 WebElement element = driver.findElement(By.xpath("//div[starts-with(@class,'footer--row footer--site-links')]"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
	   }
	 
	 public void clickStreamingLibrary() {
		 driver.findElement(streamingLibLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickLiveTVLink() {
		 driver.findElement(liveTVLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickLiveNewsLink() {
		 driver.findElement(liveNewsLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickLiveSportsLink() {
		 driver.findElement(liveSportsLink).click();
		 driver.navigate().back();
	   }
	 
	 // column2:
	 public void clickTvShowsLink() {
		 driver.findElement(tvShowsLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickMoviesLink() {
		 driver.findElement(moviesLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickOriginalsLink() {
		 driver.findElement(originalsLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickNetworksLink() {
		 driver.findElement(networksLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickKidsLink() {
		 driver.findElement(kidsLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickFxOnHuluLink() {
		 driver.findElement(fxOnHuluLink).click();
		 driver.navigate().back();
	   }
	 
	 // column3:
	 public void clickHboMaxLink() {
		 driver.findElement(hboMaxLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickCinemaxLink() {
		 driver.findElement(cinemaxLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickShowtimeLink() {
		 driver.findElement(showtimeLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickStarzLink() {
		 driver.findElement(starzLink).click();
		 driver.navigate().back();
	   }
	 
	 // column4:
	 public void clickHuluDisEspnLink() {
		 driver.findElement(huluDisEspnLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickDisBundleNoAdsLink() {
		 driver.findElement(disBundleNoAdsLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickDisBundleLiveTVlink() {
		 driver.findElement(disBundleLiveTVlink).click();
		 driver.navigate().back();
	   }
	 
	 
	 
	 // --- main method called ---

	 public void scroll2Footer() throws InterruptedException {
			this.verifyHuluFooter();
			Thread.sleep(2000);
			this.scrollToFooter();
		   }
	 
	 
	 public void column1() throws InterruptedException {
			this.clickStreamingLibrary();
			Thread.sleep(2000);
			this.clickLiveTVLink();
			Thread.sleep(2000);
			this.clickLiveNewsLink();
			Thread.sleep(2000);
			this.clickLiveSportsLink();	
			Thread.sleep(2000);
		   }
	 
	 public void column2() throws InterruptedException {
			// column2:
			this.clickTvShowsLink();
			Thread.sleep(2000);
			this.clickMoviesLink();
			Thread.sleep(2000);
			this.clickOriginalsLink();
			Thread.sleep(2000);
			this.clickNetworksLink();
			Thread.sleep(2000);
			this.clickKidsLink();
			Thread.sleep(2000);
			this.clickFxOnHuluLink();
			Thread.sleep(2000);
		   }
	 
	 public void column3() throws InterruptedException {
			// column3:
			this.clickHboMaxLink();
			Thread.sleep(2000);
			this.clickCinemaxLink();
			Thread.sleep(2000);
			this.clickShowtimeLink();
			Thread.sleep(2000);
			this.clickStarzLink();
			Thread.sleep(9000);
		   }
}
