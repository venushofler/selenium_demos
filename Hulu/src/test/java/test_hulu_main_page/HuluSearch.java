package test_hulu_main_page;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import page_main.Search;



public class HuluSearch {
	@Test(priority = 1, description = "accountLogin")
	  public void accountLogin() throws InterruptedException{
		  
		  objlogin = new Search(driver);
		  objlogin.huluSearch();
	  
	  }
	   
	  
	  //  test 2:  wait for "movies to load" header element to display 
		
	  @Test(priority = 2, description = "searchATitle")
	  public void accountLogin() throws InterruptedException{
		  
		  objSearch = new Search(driver);
		  objSearch.huluSearch();
	  
	  }
	  
	  //  test 3:  click search icon, wait for "genres" header element to display
	  
	  //  test 4:  click right arrow and wait for sports element to display.  click sports icon.  
	  
	  //  test 5:  wait for sports modal to display.  click right arrow.  wait for text "In Search of Greatness" to display.  Click Play button on tile.

	 
}
