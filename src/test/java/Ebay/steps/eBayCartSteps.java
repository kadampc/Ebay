package Ebay.steps;

import net.thucydides.core.annotations.Steps;
import Ebay.steps.serenity.eBayCartEndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

/**
 * Created by Arya on 07/02/2018.
 */
public class eBayCartSteps {

    @Steps
    eBayCartEndUserSteps eBayCartEndUserSteps;

    @Given("^user is on eBay homepage$")
    public void ebay()
    {
        eBayCartEndUserSteps.ebayopen();
        eBayCartEndUserSteps.ebayhome();
    }

    @When("^user searched for the (.*) product$")
    public void searchItem(String searchInput)
    {
        eBayCartEndUserSteps.searchItem(searchInput);
    }

    @When("^Select product and add to cart$")
    public void addToCart()
    {
        eBayCartEndUserSteps.addToCart();
    }


    @Then("^Products should be added to the cart$")
    public void productAdded()
    {
        eBayCartEndUserSteps.productAdded();
    }
}
