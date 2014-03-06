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
	
	public ControlImpl()
	{
		this.suite = null;
		this.controlSuite = null;
		this.classType = "";
		this.testSuite = null;
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
	public void setSuiteType(String classType){
		// TODO create the appropriate suite type using control suite object
		
		this.controlSuite.setSuiteType(this.suite, classType);
		
		
	}
	
	@Override
	public GenericClassSuite createSuiteType() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		this.testSuite = this.controlSuite.createSuiteType();
		return this.testSuite;
	}
	
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
		//now create the suite Type through control suite SHOULD return object created
		control.setSuiteType(classType);
		GenericClassSuite testSuite = control.createSuiteType();
		
		System.out.println("Testing created: ");
		testSuite.createCheck();
		System.out.println("create success");
		

	}


}
