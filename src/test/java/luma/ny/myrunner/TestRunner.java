package luma.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" }, 
		features = { ".//Features/" },
		glue = {"luma.ny.stepdefinitions", "luma.ny.hooks"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
