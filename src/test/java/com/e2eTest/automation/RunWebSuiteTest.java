package com.e2eTest.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
public class RunWebSuiteTest {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "src/spec/features" }, // Path to the .feature files.
			plugin = { "pretty", "html:target/cucumber-reports.html" }, // Formats for reports (e.g., pretty, html).
			// glue = {"step_definitions"}, // Path to step definition files
			tags = (""), // Run tests with specific tags.
			monochrome = true, // Clean console output.
			snippets = CAMELCASE // Fait échouer le test si des étapes non définies sont utilisées
	)
	public class RunCucumberTest {

	}
}
