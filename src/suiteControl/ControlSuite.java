/**
 * 
 */
package suiteControl;

import testSuite.SuiteImpl;

/**
 * @author nanophotometer, Ritaja Sengupta
 *
 */
public interface ControlSuite {
	
	public void setSuiteType(SuiteImpl suite, String classType);
	public void createSuiteType() throws InstantiationException, IllegalAccessException, ClassNotFoundException;

}
