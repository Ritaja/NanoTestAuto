/**
 * 
 */
package testControl;

import suiteControl.ControlSuiteImpl;
import testSuite.SuiteImpl;

/**
 * @author nanophotometer, Ritaja Sengupta
 * Interface for the control of entire suite
 *
 */
public interface Control {
	
	public void setControlSuite(ControlSuiteImpl controlSuite);
	public void setSuite(SuiteImpl suite);
	public void createSuiteType(String classType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	

}
