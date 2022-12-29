package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feture/Login.feature",
                 glue="stepDefination",
                 dryRun=false,
                 monochrome = true,
                 plugin= {"pretty","html:test-output"})
public class TestRun {

}
