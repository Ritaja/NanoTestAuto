package suiteControl;

import testSuite.GenericClassSuite;
import testSuite.SuiteImpl;

public class ControlSuiteImpl implements ControlSuite {
	
	private SuiteImpl suite;
	private String classType;
	private GenericClassSuite testSuite;
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 */
	public ControlSuiteImpl()
	{
		this.suite = null;
		this.classType = "";
		this.testSuite = null;
	}

	/**
	 * Set the SuiteImpl object (Suite Selector) and the Suite type (as String)
	 * @Override
	 * @param object of the SuiteImpl class, String representing the Suite type
	 * @return void
	 */
	public void setSuiteType(SuiteImpl suite, String classType) {
		// TODO create the appropriate test suite as called from the test control class
		
		// the suite and classType local variables can be used later for the object of this class type
		this.suite = suite;
		this.classType = classType;
		this.suite.setType(classType);

	}

	/**
	 * Creates the Suite Type (eg: PclassSuite) using the SuiteImpl (Suite selector)
	 * @Override
	 * @exception InstantiationException,IllegalAccessException, ClassNotFoundException
	 * @param void
	 * @return object of type GenericSuite. (Has access to Navigation)
	 */
	public GenericClassSuite createSuiteType() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO create suite using the testSuite
		
		
		this.testSuite = this.suite.createType();
		return this.testSuite;
		
	}

}
