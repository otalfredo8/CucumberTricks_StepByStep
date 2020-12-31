package c09_hooks.step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Hooks_stepDef {

    @Given("I have hooks")
    public void i_have_hooks() {
        System.out.println("Hooks_stepDef - @Given i_have_hooks()");
    }

    @Given("I have more hooks")
    public void i_have_more_hooks() {
        System.out.println("Hooks_stepDef - @Given i_have_more_hooks()");
    }
}
