package testGeneric;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import testControl.ControlImpl;

public class GenericTest {
	
	private HashMap parameters;
	private HashMap navigationComponents;
	private WebDriver webDriver;
	
	public GenericTest(ControlImpl controlImpl)
	{
		this.parameters = null;
		this.navigationComponents = null;
		this.webDriver = controlImpl.getDriver();
		
	}

	public void Navigate() {
		// TODO Auto-generated method stub
		
	}

	public void assertTest() {
		// TODO Auto-generated method stub
		
	}

	public void setParameters(HashMap parameters) {
		// TODO Auto-generated method stub
		this.parameters = parameters;
	}

	public void setNavigationComponents(HashMap navigationComponents) {
		// TODO Auto-generated method stub
		
		this.navigationComponents = navigationComponents;
	}

	public void initializeDriver(ControlImpl controlImpl) {
		// initialize the drivers
		this.webDriver = controlImpl.getDriver();
		System.out.println("got driver"+this.webDriver);
	}

}
