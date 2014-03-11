/**
 * Contains classes that act as the Policy Selector class. 
 * Called by The ControlImpl class to set the Type of suite.
 */
/**
 * @author nanophotometer, Ritaja Sengupta
 *
 */
/* can be done by passing or setting
 params. can be done by hard setting the values. Like setType = <arg from user>. Template classes introduce 
 problems. then do the Type checking at the the testSuite. Next better alternative setType is class type
 variable. http://stackoverflow.com/questions/12815255/dynamic-object-creation-in-java 
 eg: String setType = "P-Class"
 at the testSuite just set: Object dummy = Class.forName(setType).newInstance();
*/
package suiteControl;