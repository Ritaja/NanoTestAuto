package testSuite;

import testNavigation.Navigation;

public class CclassSuite extends GenericClassSuite {
private Navigation nav;
	
	public CclassSuite()
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
