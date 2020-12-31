package c02_regex_cucumberexpressions.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/java/c02_regex_cucumberexpressions/features",
        glue = "c02_regex_cucumberexpressions/step_definitions",
        dryRun = false,
        strict = true
)
public class RegexSamples_runner {
}
