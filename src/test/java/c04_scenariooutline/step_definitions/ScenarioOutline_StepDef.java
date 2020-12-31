package c04_scenariooutline.step_definitions;

import c04_scenariooutline.implementation.Checkout_ScenarioOutline;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class ScenarioOutline_StepDef {
    int bananaPrice = 0;
    Checkout_ScenarioOutline checkout = new Checkout_ScenarioOutline();

    @Given("the price of a {string} is {int}")
    public void thePriceOfAIs(String name, int price) {
        bananaPrice = price;
    }

    @When("I checkout  {int} {string}")
    public void iCheckout(int qty, String string) {
        checkout.add(qty, bananaPrice);
    }

    @Then("the total price should be {int}")
    public void theTotalPriceShouldBe(int total) {
        assertEquals(total, checkout.total());
        System.out.println(checkout.total());
    }
}
