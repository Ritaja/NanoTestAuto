package testSuite;

public class SuiteImpl implements Suite {
	
	private String classType;
	private GenericClassSuite testSuite;
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 */
	public SuiteImpl()
	{
		//dummy constructor
		this.classType = null;
		this.testSuite = null;
	}

	/**
	 * Creates the Suite Type (eg: PclassSuite) from the already set Suite Type.
	 * @Override
	 * @param void
	 * @return object of GenericClassSuite. object has access to the Navigation.
	 * @exception InstantiationException, IllegalAccessException, ClassNotFoundException
	 */
	public GenericClassSuite createType() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO create the classes of Type P or C class
		this.testSuite = (GenericClassSuite) Class.forName(this.classType).newInstance();
		//Object suite = new CclassSuite();
		//testLine
		System.out.println("SuiteImpl: Created object of type:: "+this.testSuite.getClass());
		return this.testSuite;

	}

	/**
	 * Sets the Suite Type to be created.
	 * @Override
	 * @param String of the Type of suite to be created
	 * @return void
	 */
	public void setType(String classType) {
		// TODO set Type using the suiteControl class
		
		this.classType = classType;
		
	
	}

}
