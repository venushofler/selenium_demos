package test_hulu_main_page;

import org.testng.annotations.Test;

import page_footer.FooterAboutUsSection;
import page_footer.FooterBrowseSection;
import page_footer.FooterHelpSection;



public class FooterMainPage extends BaseTestHulu {
	
	  @Test(priority = 1, description = "scroll2Footer")
	  public void scroll2Footer() throws InterruptedException{
		  
		  objfooter = new FooterBrowseSection(driver);
		  objfooter.scroll2Footer();
	  }
	  
	  //Browse Section
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
	  
	  
	  @Test(priority = 4, description = "footerColumn4")
	  public void testFooterColumn4() throws InterruptedException{
		  
		  objfooter = new FooterBrowseSection(driver);
		  objfooter.column4();
	  }
	  
	  //Help Section
	  @Test(priority = 5, description = "footerColumn5")
	  public void testFooterColumn5() throws InterruptedException{
		  
		  objfooter2 = new FooterHelpSection(driver);
		  objfooter2.column5();
	  }
	  
	  //About Us Section
	  @Test(priority = 6, description = "footerColumn6")
	  public void testFooterColumn6() throws InterruptedException{
		  
		  objfooter3 = new FooterAboutUsSection(driver);
		  objfooter3.column6();
	  }
	  
}
