package Ebay.steps.serenity;

import net.thucydides.core.annotations.Step;
import Ebay.pages.eBayCartPage;

/**
 * Created by Arya on 07/02/2018.
 */
public class eBayCartEndUserSteps {

    eBayCartPage eBayCartPage;

    @Step
    public void ebayopen()
    {
        eBayCartPage.open();
    }

    @Step
    public void ebayhome()
    {
        eBayCartPage.ebayhome();
    }

    @Step
    public void searchItem(String searchInput)
    {
        eBayCartPage.searchItem(searchInput);
    }

    @Step
    public void addToCart()
    {
        eBayCartPage.addToCart();
    }


    @Step
    public void productAdded()
    {
        eBayCartPage.productAdded();
    }
}
