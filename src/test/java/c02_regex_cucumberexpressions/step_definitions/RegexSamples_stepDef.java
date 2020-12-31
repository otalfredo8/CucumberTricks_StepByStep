package c02_regex_cucumberexpressions.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegexSamples_stepDef {

    //Capture Group: restricted to 70
    @Given("^I have \\$(70)$")
    public void iHave$70(int i) {
        System.out.println(i);
    }

    //Capture Group: open to 30 or 70
    @Given("^they have \\$(30|70)$")
    public void theyHave$30(Integer i) {
        System.out.println(i);
    }

    //The Dot: one digit per dot to be match
    @Given("^it has \\$(...)$")
    public void itHas$000(int i) {
        System.out.println(i);
    }
    //Star modifier
    @Given("^It was \\$(.*)$")
    public void itWas$9898(int i) {
        System.out.println(i);
    }

    //Character Classes
    @Given("^It is \\$([0-9]*)$")
    public void itIs$4050(Integer int1) {
        System.out.println(int1);
    }

    //Shorthand: \d, \w with +
    @Given("^it costs \\$(\\d+)$")
    public void itCosts$300(int i) {
        System.out.println(i);
    }

    @Given("^it is named (\\w+)$")
    public void itIsNamedCoat(String str) {
        System.out.println(str);
    }

    @Given("^it is for (\\w+\\s\\w+\\s\\w+\\s\\w+)$")
    public void itIsForEitherWinterOrFall(String str) {
        System.out.println(str);
    }

    //Multiple Captures
    @Given("^she has \\$(\\d+) in her (\\w+\\s\\w+)")
    public void she_has_$10_in_her_blue_purse(int i, String str) {
        System.out.println("$" + i +" in " + str);
    }

    //Question mark
    @Given("^we have (\\d+) cars?$")
    public void weHaveCar(Integer int1) {
        System.out.println(int1);
    }

    //Noncapturing Groups
    @Given("^I (?:visit|go to) the homepage$")
    public void iVisitTheHomepage() {
        System.out.println("printing twice: one per possible value");
    }

    //Default Cucumber-expressions: int, word, string, float, double and /.*/
    @Given("I have {int} car")
    public void iHaveCar(Integer int1) {
        System.out.println(int1);
    }

    @When("I {word}")
    public void i(String string) {
        System.out.println(string);
    }

    @Then("I go to {string}")
    public void iGoTo(String string) {
        System.out.println(string);
    }

    @Then("I commute for about {float} miles")
    public void iCommuteForAboutMiles(float fl) {
        System.out.println(fl);
    }

    @Then("I commute for about {double} minutes")
    public void iCommuteForAboutMinutes(Double double1) {
        System.out.println(double1);
    }
}
