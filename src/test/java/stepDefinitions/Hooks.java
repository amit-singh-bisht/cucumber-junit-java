package test.java.stepDefinitions;

import io.cucumber.java.*;

public class Hooks {
	
	@Before
	public void initialize_driver(Scenario scenario) {
		System.out.println("Before hook");
		System.out.println(scenario.getName());
	}
	
	@After
	public void quit_driver(Scenario scenario) {
		System.out.println("After hook");
	}
}
