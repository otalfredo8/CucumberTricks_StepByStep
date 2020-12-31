package c06_datatabletype.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/c06_datatabletype/features",
        glue = "c06_datatabletype/step_definitions",
        dryRun = false,
        strict = true
)
public class DataTableType_runner {

}
