package testSuite;
import testNavigation.Navigation;;

public class PclassSuite extends GenericClassSuite {
	
	private Navigation nav;
	
	public PclassSuite()
	{
		//dummy constructor
		this.nav = new Navigation();
	}
	
	@Override
	public void createCheck() throws InterruptedException
	{
		nav.autoLogin();
	}

}
