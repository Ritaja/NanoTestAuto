package testControl;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelReader.ReaderImpl;
import testGeneric.GenericTest;
import testImplementation.TestCases;
import testNavigation.Navigation;

public class ControlImpl{
	
	
	
	private ReaderImpl reader;
	private TestCases testCases;
	private GenericTest genericTest;
	private HashMap parameters;
	private HashMap navigationComponents;
	
	private String website = "http://profectus/NanoSenchaTouch2.1.1%20(Sprint%2027%2004-03-14)/index-debug.html?demo=On,client=Desktop";
	private String driver = "webdriver.chrome.driver"; 
	private String driverPath = "C:/Program Files/Java/eclipse-standard-kepler-SR2-win32-x86_64/chromedriver.exe";
	
	public WebDriver webDriver;
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 * @throws IOException
	 */
	public ControlImpl() throws IOException
	{
		this.reader = new ReaderImpl();
		this.testCases = new TestCases();
		this.genericTest = new GenericTest(this);
		this.parameters = null;
		this.navigationComponents = null;
	}
    
    public void getParameters()
    {
		this.parameters = this.testCases.getParameters();
    	
    }
    
    public void getNavigationComponents()
    {
		this.navigationComponents = this.testCases.getNavigationComponents();
    	
    }
    
    public void setParameters()
    {
    	this.genericTest.setParameters(this.parameters);
    }
    
    public void setNavigationComponents()
    {
    	this.genericTest.setNavigationComponents(this.navigationComponents);
    }
    
    public void navigateTest()
    {
    	this.genericTest.Navigate();
    }
	
    public void  assertTest()
    {
    	this.genericTest.assertTest();
    }
    
    /**
	 * sets the website to navigate
	 * @param string representing website
	 * @return void
	 */
    public void setWebsite(String website)
    {
       this.website = website;	
    }
    /**
	 * sets the driver path (path of the .exe file from the system) for the navigation
	 * @param string representing driverPath
	 * @return void
	 */
    public void setDriverPath(String driverPath)
    {
    	this.driverPath = driverPath;
    }
    
    /**
	 * sets the driver that would be used to navigate
	 * @param string representing the driver
	 * @return void
	 */
    public void setDriver(String driver)
    {
    	this.driver = driver;
    }
    
    /**
	 * Initiates and returns the web driver that has to be used for navigation
	 * @param void
	 * @return initialised web driver for chrome
	 */
    public WebDriver getDriver()
    {
    	// Create a new instance of the chrome unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
    	System.setProperty(this.driver, this.driverPath);
    	System.out.println(System.getProperty(this.driver));
       // WebDriver driver = new HtmlUnitDriver();
        this.webDriver = new ChromeDriver();
        
        return webDriver;
    }
    
    /**
	 * Set the driver in the GenericTest class which would be used to navigate
	 * @param void
	 * @return void
	 */
    public void initializeDriver()
    {
    	this.genericTest.initializeDriver(this);
    }
    
    /**
   	 * Uses reader class to read excel for the test suite type
   	 * @param void
   	 * @return void
   	 */
    private void readTestSuite() {
		String testSuite = this.reader.readTestSuite();
		
	}
    
	public static void main(String[] args) throws IOException {
		
		ControlImpl control = new ControlImpl();
		control.readTestSuite();
		
		//set the driver
		control.setDriverPath("C:/Program Files/Java/eclipse-standard-kepler-SR2-win32-x86_64/chromedriver.exe");
		control.setDriver("webdriver.chrome.driver");
		control.setWebsite("http://profectus/NanoSenchaTouch2.1.1%20(Sprint%2027%2004-03-14)/index-debug.html?demo=On,client=Desktop");
		//initialize the driver
		control.initializeDriver();
		
		control.getNavigationComponents();
		control.getParameters();
		control.setParameters();
		control.setNavigationComponents();
		control.navigateTest();
        control.assertTest();
		
		

	}


}
