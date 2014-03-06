package testSuite;

public class SuiteImpl implements Suite {
	
	private String classType;
	private GenericClassSuite testSuite;
	
	public SuiteImpl()
	{
		//dummy constructor
		this.classType = null;
		this.testSuite = null;
	}

	@Override
	public GenericClassSuite createType() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO create the classes of Type P or C class
		this.testSuite = (GenericClassSuite) Class.forName(this.classType).newInstance();
		//Object suite = new CclassSuite();
		//testLine
		System.out.println("SuiteImpl: Created object of type:: "+this.testSuite.getClass());
		return this.testSuite;

	}

	@Override
	public void setType(String classType) {
		// TODO set Type using the suiteControl class
		
		this.classType = classType;
		
	
	}

}
