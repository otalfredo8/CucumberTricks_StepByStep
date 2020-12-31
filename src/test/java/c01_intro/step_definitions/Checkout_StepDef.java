package c01_intro.step_definitions;

import c01_intro.implementation.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Checkout_StepDef {
    int bananaPrice = 0;
    Checkout checkout = new Checkout();

    @Given("the price of a {string} is {int}")
    public void thePriceOfAIs(String name, int price) {
        bananaPrice = price;
    }

    @When("I checkout  {int} {string}")
    public void iCheckout(int itemCount, String itemName) {
        checkout.add(itemCount, bananaPrice);
    }

    @Then("the total price should be {int}")
    public void theTotalPriceShouldBe(int total) {
        assertEquals(total, checkout.total());
    }
}
