/**
 * 
 */
package testNavigation;

import autoLogin.LoginAuto;

/**
 * @author nanophotometer, Ritaja Sengupta
 * Create the navigation actions
 *
 */
public class Navigation {
	
	public Navigation()
	{
		//dummy used. please refactor later.
		System.out.println("Navigation:working fine!");
	}
	
	public void autoLogin() throws InterruptedException
	{
		LoginAuto la = new LoginAuto();
		la.login();
	}

}
