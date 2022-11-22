package test.java.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features",
plugin = { "pretty", "html:target/cucumber-reports-html.html", "pretty", "junit:target/cucumber-reports-xml.xml" },
glue={"test/java/stepDefinitions"}
)
public class TestRunner {

}
