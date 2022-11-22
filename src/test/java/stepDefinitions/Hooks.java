package test.java.stepDefinitions;

import io.cucumber.java.*;

public class Hooks {
	
	@Before
	public void initialize_driver(Scenario scenario) {
		System.out.println("Scenario same: " + scenario.getName());
	}
	
	@After
	public void quit_driver(Scenario scenario) {
		String scenarioStatus = scenario.isFailed() ? "failed" : "passed";
		System.out.println("Scenario status: " + scenarioStatus);
	}
}
