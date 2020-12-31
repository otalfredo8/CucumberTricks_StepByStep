package c09_hooks.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//contains plugin for report. Also see dependency.
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/c09_hooks/features",
        glue = "c09_hooks/step_definitions",
        dryRun = false,
        strict = true
)
public class Hooks_runner {
}
