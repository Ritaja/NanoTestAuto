package testSuite;
import testNavigation.Navigation;;

public class PclassSuite extends GenericClassSuite {
	
	private Navigation nav;
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 */
	public PclassSuite()
	{
		//dummy constructor
		this.nav = new Navigation();
	}
	
	/**
	 * Performs the auto Login operation.
	 * @Override
	 * @param void
	 * @return void
	 */
	public void createCheck() throws InterruptedException
	{
		nav.autoLogin();
	}

}
