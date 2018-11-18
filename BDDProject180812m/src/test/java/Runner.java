import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/masumparvezapu/eclipse-workspace/BDDProject180812m/login.feature"},
glue= {"StepDefination.java"},
format= {"pretty","html:test-output"}


		
		
		)



public class Runner{
	
}

