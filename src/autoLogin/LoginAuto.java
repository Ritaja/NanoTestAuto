package autoLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;
//import org.openqa.selenium.internal.seleniumemulation.WaitForPopup;

//import com.thoughtworks.selenium.Wait;


public class LoginAuto  {
	//set default temp
	private String website = "http://profectus/NanoSenchaTouch2.1.1%20(Sprint%2027%2004-03-14)/index-debug.html?demo=On,client=Desktop";
	// set default value
	private String driver = "webdriver.chrome.driver"; 
	//set default value
	private String driverPath = "C:/Program Files/Java/eclipse-standard-kepler-SR2-win32-x86_64/chromedriver.exe"; 
	
	
	public LoginAuto()
	{
		//default constructor for test please remove later
	}
	public LoginAuto(String website)
	{
		//set the nano test website
		this.website = website;
	}
	//overloaded constructor to set webdrivers
	public LoginAuto(String website,String driver, String driverPath)
	{
		//set the nano test website
		this.website = website;
		this.driver = driver;
		this.driverPath = driverPath;
	}
    public void login() throws InterruptedException {
        // Create a new instance of the chrome unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
    	System.setProperty(this.driver, this.driverPath);
    	System.out.println(System.getProperty(this.driver));
       // WebDriver driver = new HtmlUnitDriver();
        WebDriver driver = new ChromeDriver();

        // And now use this to visit desired site
        driver.get(this.website);

        //initialize web element
        WebElement element;
        // Find P-Class nanometer to click
        synchronized (driver)
        {
            driver.wait(10000);          
        }
        
        element = driver.findElement(By.xpath("//div[text()='P-Class']"));

        // login
        element.click();
        

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }


public static void main(String[] args) throws InterruptedException {
	
	//dummy main please remove later
	LoginAuto la = new LoginAuto();
	
	la.login();
	
  }
}
