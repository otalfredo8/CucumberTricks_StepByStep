package c05_datatables.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/java/c05_datatables/features",
        glue = "c05_datatables/step_definitions",
        dryRun = true,
        strict = true
)
public class Datatables_runner {
}
