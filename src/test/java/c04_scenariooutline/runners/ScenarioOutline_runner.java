package c04_scenariooutline.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/java/c04_scenariooutline/features/ScenarioOutline.feature",
        glue = "c04_scenariooutline/step_definitions"
)
public class ScenarioOutline_runner {

}
