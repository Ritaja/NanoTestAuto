/**Suite Interface: template for the Suite selector class
 * Implemented by SuiteImpl class
 * 
 */
package testSuite;

/**
 * @author nanophotometer, Ritaja Sengupta
 *
 */
public interface Suite {
	
	public GenericClassSuite createType() throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	void setType(String classType);

}
