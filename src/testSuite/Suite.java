/**
 * 
 */
package testSuite;

/**
 * @author nanophotometer, Ritaja Sengupta
 *
 */
public interface Suite {
	
	public void createType() throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	void setType(String classType);

}
