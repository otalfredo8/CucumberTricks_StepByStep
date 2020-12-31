package c08_docstringtype.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/c08_docstringtype/features",
        glue = "c08_docstringtype/step_definitions",
        dryRun = false,
        strict = true
)
public class DocStringType_runner {
}
