package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features_path", glue={"steps_mapper_path.steps_mapper_class"})
public class CucumberRunner {

}
