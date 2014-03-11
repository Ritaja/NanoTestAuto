/**Control Interface: template for the UI
 * Implemented by ControlImpl class
 * 
 */
package testControl;

import suiteControl.ControlSuiteImpl;
import testSuite.GenericClassSuite;
import testSuite.SuiteImpl;

/**
 * @author nanophotometer, Ritaja Sengupta
 * Interface for the control of entire suite
 *
 */
public interface Control {
	
	public void setControlSuite(ControlSuiteImpl controlSuite);
	public void setSuite(SuiteImpl suite);
	public GenericClassSuite createSuiteType() throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	public void setSuiteType(String classType) ;
	

}
