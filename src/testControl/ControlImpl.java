package testControl;

import java.io.IOException;
import java.util.HashMap;

import excelReader.ReaderImpl;
import testGeneric.GenericTest;
import testImplementation.TestCases;
import testNavigation.Navigation;

public class ControlImpl{
	
	
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 * @throws IOException
	 */
	private ReaderImpl reader;
	private TestCases testCases;
	private GenericTest genericTest;
	private HashMap parameters;
	private HashMap navigationComponents;
	public ControlImpl() throws IOException
	{
		this.reader = new ReaderImpl();
		this.testCases = new TestCases();
		this.genericTest = new GenericTest();
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
    
	public static void main(String[] args) throws IOException {
		
		ControlImpl control = new ControlImpl();
		control.getNavigationComponents();
		control.getParameters();
		control.setParameters();
		control.setNavigationComponents();
		control.navigateTest();
        control.assertTest();
		
		

	}


}
