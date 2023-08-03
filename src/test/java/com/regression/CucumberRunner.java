package com.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = { "json:target/cucumber.json" }, // report = main in json format {}

		features= {"./src/test/resources/OnlineBanking.feature"},//feature file path
		glue= {"com.generic"},//stepDef package name
		tags= "@Smoke"//test types=@smoke
	
		
		
		
		
		
		
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {
	
	
	
	
	

}
