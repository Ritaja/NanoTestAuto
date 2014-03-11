package testControl;

import suiteControl.ControlSuiteImpl;
import testSuite.GenericClassSuite;
import testSuite.SuiteImpl;
import testSuite.GenericClassSuite;
import testNavigation.Navigation;

public class ControlImpl implements Control {
	
	private SuiteImpl suite;
	private ControlSuiteImpl controlSuite;
	private String classType;
	private GenericClassSuite testSuite;
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 */
	public ControlImpl()
	{
		this.suite = null;
		this.controlSuite = null;
		this.classType = "";
		this.testSuite = null;
	}


	/**
	 * Set the ControlSuite or the policy selector class
	 * @Override
	 * @param object of the controlSuiteImpl class
	 * @return void
	 */
	public void setControlSuite(ControlSuiteImpl controlSuite) {
		// TODO set the control suite
		
		this.controlSuite = controlSuite;
	}

	/**
	 * Sets the SuiteImpl class object, SuiteImpl is used to create the appropriate Suite type
	 * @Override
	 * @param object of the SuiteImpl class
	 * @return void
	 */
	public void setSuite(SuiteImpl suite) {
		// TODO set the suite 
		
		this.suite = suite;
	}


	/**
	 * Set the suite type using the ControlSuiteImpl (policy selector) class
	 * @Override
	 * @param String representation of desired suite type. SHOULD be fully qualified name (eg:"testSuite.PclassSuite")
	 * @return void
	 */
	public void setSuiteType(String classType){
		// TODO create the appropriate suite type using control suite object
		
		this.controlSuite.setSuiteType(this.suite, classType);
		
		
	}
	
	/**
	 * Creates the Suite Type (eg: PclassSuite) using the ControlSuiteImpl (Policy selector)
	 * @Override
	 * @exception InstantiationException,IllegalAccessException, ClassNotFoundException
	 * @param void
	 * @return object of type GenericSuite. (Has access to Navigation)
	 */
	public GenericClassSuite createSuiteType() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		// TODO create the suite type
		
		this.testSuite = this.controlSuite.createSuiteType();
		return this.testSuite;
	}
	
	
	/**
	 * Main method of the Control UI
	 * @Override
	 * @exception InstantiationException, IllegalAccessException, ClassNotFoundException, InterruptedException
	 * @param void
	 * @return void
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InterruptedException {
		// TODO test implementation
		
		//instantiate required classes
		SuiteImpl suite = new SuiteImpl();
		ControlSuiteImpl controlSuite = new ControlSuiteImpl();
		//use the fully qualified name
		String classType = "testSuite.PclassSuite";
		ControlImpl control = new ControlImpl();
		
		//create the suite instance
		control.setSuite(suite);
		//create the control suite instance: this would select the type of suite
		control.setControlSuite(controlSuite);
		//now create the suite type through control suite SHOULD return object created
		control.setSuiteType(classType);
		GenericClassSuite testSuite = control.createSuiteType();
		
		System.out.println("Testing created: ");
		testSuite.createCheck();
		System.out.println("create success");
		

	}


}
