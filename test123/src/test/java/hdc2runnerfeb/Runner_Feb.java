package hdc2runnerfeb;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training1\\eclipse-workspace\\test123\\FeatureFile",glue="MyFeatureFiles",tags={"@Sanity","@Regression"})

public class Runner_Feb {

}
