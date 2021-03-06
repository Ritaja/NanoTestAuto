package autoLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;
//import org.openqa.selenium.internal.seleniumemulation.WaitForPopup;

//import com.thoughtworks.selenium.Wait;


public class LoginAuto  {
	
	private String website;
	private String driver; 
	private String driverPath;
	
	/**
	 * Default constructor.
	 * @param void
	 * @return void
	 *
	 */
	public LoginAuto()
	{
		//set default temp
		this.website = "http://profectus/NanoSenchaTouch2.1.1%20(Sprint%2027%2004-03-14)/index-debug.html?demo=On,client=Desktop";
		// set default value to chrome driver
		this.driver = "webdriver.chrome.driver";
		//set the default path.WARNING: change the path accordingly
		this.driverPath = "C:/Program Files/Java/eclipse-standard-kepler-SR2-win32-x86_64/chromedriver.exe"; 
		
	}
	/**
	 * Parameterized constructor.
	 * @param website link as a String
	 * @return void
	 */
	public LoginAuto(String website)
	{
		//set the nano test website
		this.website = website;
		
	}
	/**
	 * Parameterized constructor.
	 * @param website link as a String, driver as String, driverPath as a String
	 * @return void
	 */
	public LoginAuto(String website,String driver, String driverPath)
	{
		//set the nano test website
		this.website = website;
		//set driver, for default chrome use default constructor
		this.driver = driver;
		//set driverpath
		this.driverPath = driverPath;
	}
	/**
	 * Method to automate the login operation using Selenium web drivers.
	 * @param void
	 * @return void
	 */
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
