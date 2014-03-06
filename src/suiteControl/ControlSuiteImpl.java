package suiteControl;

import testSuite.GenericClassSuite;
import testSuite.SuiteImpl;

public class ControlSuiteImpl implements ControlSuite {
	
	private SuiteImpl suite;
	private String classType;
	private GenericClassSuite testSuite;
	
	public ControlSuiteImpl()
	{
		this.suite = null;
		this.classType = "";
		this.testSuite = null;
	}

	@Override
	public void setSuiteType(SuiteImpl suite, String classType) {
		// TODO create the appropriate test suite as called from the test control class
		
		// the suite and classType local variables can be used later for the object of this class type
		this.suite = suite;
		this.classType = classType;
		this.suite.setType(classType);

	}

	@Override
	public GenericClassSuite createSuiteType() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO create suite using the testSuite
		
		
		this.testSuite = this.suite.createType();
		return this.testSuite;
		
	}

}
