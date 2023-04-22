package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features",
                 glue={"steps"},
                 monochrome=true,
                 publish=true,
                // tags="@Smoke"//execute only smoke testcases
                // tags="@Smoke or @Regression" //execute either one of the testcase
                // tags="@Sanity and @Functional" 
                 tags="not @Smoke" 
		        )
public class CucumberRunner extends BaseClass{

}
