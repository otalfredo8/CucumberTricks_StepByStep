package c03_background.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/java/c03_scenarios/features/Background.feature"},
        glue = "c03_background/step_definitions",
        strict = true,
        dryRun = false
)
public class Background_runner {
}
