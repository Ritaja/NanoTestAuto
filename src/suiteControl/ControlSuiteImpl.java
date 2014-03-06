package suiteControl;

import testSuite.SuiteImpl;

public class ControlSuiteImpl implements ControlSuite {
	
	private SuiteImpl suite;
	private String classType;
	
	public ControlSuiteImpl()
	{
		this.suite = null;
		this.classType = "";
	}

	@Override
	public void setSuiteType(SuiteImpl suite, String classType) {
		// TODO create the appropriate test suite as called from the test control class
		
		this.suite = suite;
		this.classType = classType;

	}

	@Override
	public void createSuiteType() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO create suite using the testSuite
		
		this.suite.setType(classType);
		this.suite.createType();
		
	}

}
