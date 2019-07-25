package orange_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class orange {

	public static WebDriver driver;
    public static String path;

@BeforeSuite

public void OpenBrowser() {
	
	path=System.getProperty("user.dir")+"//src//test//resources//driv//chromedriver.exe";
	//System.out.println(path);
	
	System.setProperty("webdriver.chrome.driver", path);
	
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
}

@AfterSuite
public void closeBrowser() {
	driver.close();
}



}



