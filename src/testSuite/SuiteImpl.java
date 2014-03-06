package testSuite;

public class SuiteImpl implements Suite {
	
	private String classType;
	
	public SuiteImpl()
	{
		//dummy constructor
		this.classType = null;
	}

	@Override
	public void createType() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO create the classes of Type P or C class
		Object suite = Class.forName(this.classType).newInstance();
		//Object suite = new CclassSuite();
		//testLine
		System.out.println("SuiteImpl: Created object of type:: "+suite.getClass());

	}

	@Override
	public void setType(String classType) {
		// TODO set Type using the suiteControl class
		
		this.classType = classType;
		
	
	}

}
