package c07_parameterType.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/c07_ParameterType/features",
        glue = "c07_parameterType/step_definitions",
        dryRun = false,
        strict = true
)
public class ParamType_runner {
}
