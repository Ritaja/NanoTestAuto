package testControl;

import java.io.IOException;
import java.util.HashMap;

import excelReader.ReaderImpl;
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
	private HashMap parameters;
	private HashMap navigationComponents;
	public ControlImpl() throws IOException
	{
		this.reader = new ReaderImpl();
		this.testCases = new TestCases();
		this.parameters = null;
		this.navigationComponents = null;
	}
    
    public void getParameters()
    {
		this.parameters = testCases.getParameters();
    	
    }
    
    public void getNavigationComponents()
    {
		this.navigationComponents = testCases.getNavigationComponents();
    	
    }
	
    
    
	public static void main(String[] args) throws IOException {
		
		ControlImpl control = new ControlImpl();
		control.getNavigationComponents();
		control.getParameters();
		
		
		

	}


}
