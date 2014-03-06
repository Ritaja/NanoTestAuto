package testControl;

import suiteControl.ControlSuiteImpl;
import testSuite.SuiteImpl;

public class ControlImpl implements Control {
	
	private SuiteImpl suite;
	private ControlSuiteImpl controlSuite;
	private String classType;
	
	public ControlImpl()
	{
		this.suite = null;
		this.controlSuite = null;
		this.classType = "";
	}


	@Override
	public void setControlSuite(ControlSuiteImpl controlSuite) {
		// TODO set the control suite
		
		this.controlSuite = controlSuite;
	}

	@Override
	public void setSuite(SuiteImpl suite) {
		// TODO set the suite 
		
		this.suite = suite;
	}


	@Override
	public void createSuiteType(String classType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO create the appropriate suite type using control suite object
		
		this.controlSuite.setSuiteType(this.suite, classType);
		this.controlSuite.createSuiteType();
		
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO test implementation
		
		//intatiate required classes
		SuiteImpl suite = new SuiteImpl();
		ControlSuiteImpl controlSuite = new ControlSuiteImpl();
		//use the fully qualified name
		String classType = "testSuite.PclassSuite";
		ControlImpl control = new ControlImpl();
		
		//create the suite instance
		control.setSuite(suite);
		//create the control suite instance: this would select the type of suite
		control.setControlSuite(controlSuite);
		//now create the suite Type through control suite
		control.createSuiteType(classType);
		
		System.out.println("create success");
		

	}

}
