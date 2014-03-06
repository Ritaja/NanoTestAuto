/**
 * 
 */
package suiteControl;

import testSuite.GenericClassSuite;
import testSuite.SuiteImpl;

/**
 * @author nanophotometer, Ritaja Sengupta
 *
 */
public interface ControlSuite {
	
	public void setSuiteType(SuiteImpl suite, String classType);
	public GenericClassSuite createSuiteType() throws InstantiationException, IllegalAccessException, ClassNotFoundException;

}
