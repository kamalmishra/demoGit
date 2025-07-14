package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features", glue ="stepDefinitions" 
, monochrome= true ,plugin= {"html:target/cucmber.html","json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class FailedTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		System.out.println("print failed tc");
		System.out.println("print passed tc");
		System.out.println("print invalid tc");
		System.out.println("print valid tc");
		return super.scenarios();
		
	}

}
