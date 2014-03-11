/**
 * 
 */
package testNavigation;

import autoLogin.LoginAuto;

/**
 * @author nanophotometer, Ritaja Sengupta
 * The Suite type object (eg: PclassSuite) has access to methods 
 * of the Navigation class. The Navigation class controls the general navigation flow based on 
 * the Type of Suite object.
 *
 */
public class Navigation {
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 */
	public Navigation()
	{
		//dummy used. please refactor later.
		System.out.println("Navigation:working fine!");
	}
	/**
	 * The auto login functionality. calls the LoginAuto class to take care of the action.
	 * @param void
	 * @return void
	 */
	public void autoLogin() throws InterruptedException
	{
		LoginAuto la = new LoginAuto();
		la.login();
	}

}
