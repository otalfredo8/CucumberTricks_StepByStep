package c01_intro.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/java/c01_intro/features/ScenarioOutline.feature",
        glue = "c01_intro/step_definitions",
        dryRun = false,
        strict = true
)
public class Checkout_runner {
}
