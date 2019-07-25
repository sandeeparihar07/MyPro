package orange_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Orange_Testcases extends orange{
	
	@Test
	
	public void login() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
	   
	  }
	    
	
	    @Test
	    public void search() {
	   
	    	 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	    	
	    	 driver.findElement(By.id("searchSystemUser_userName")).sendKeys("PARIHAR");
	    	 
	    	WebElement dropuserlist= driver.findElement(By.id("searchSystemUser_userType"));
	    	Select dropdownuser= new Select(dropuserlist);
	    	dropdownuser.selectByIndex(2);
	    	 
	    	driver.findElement(By.xpath("//*[contains(@id,'searchSystemUser_employeeName_empName')]")).sendKeys("Jasmine Morgan");
	    
	    
	    	WebElement droprolelist= driver.findElement(By.id("searchSystemUser_status"));
	    	Select dropdownrole= new Select(droprolelist);
	    	dropdownrole.selectByIndex(1);
	    
	    	driver.findElement(By.id("searchBtn")).click();
	}
	
}
