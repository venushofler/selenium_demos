package test_hulu_main_page;

import org.testng.annotations.Test;

import page_footer.FooterBrowseSection;



public class FooterMainPage extends BaseTestHulu {
	
	  @Test(priority = 1, description = "scroll2Footer")
	  public void scroll2Footer() throws InterruptedException{
		  
		  objfooter = new FooterBrowseSection(driver);
		  objfooter.scroll2Footer();
	  }
	  
	  @Test(priority = 2, description = "footerColumn1")
	  public void testFooterColumn1() throws InterruptedException{
		  
		  objfooter = new FooterBrowseSection(driver);
		  objfooter.column1();
	  }
	   
	  @Test(priority = 3, description = "footerColumn2")
	  public void testFooterColumn2() throws InterruptedException{
		  
		  objfooter = new FooterBrowseSection(driver);
		  objfooter.column2();
	  }
	  
	  @Test(priority = 4, description = "footerColumn3")
	  public void testFooterColumn3() throws InterruptedException{
		  
		  objfooter = new FooterBrowseSection(driver);
		  objfooter.column3();
	  }
	  
	  

}
