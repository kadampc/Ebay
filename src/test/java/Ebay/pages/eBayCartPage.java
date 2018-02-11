package Ebay.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.jruby.RubyBoolean;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;



/**
 * Created by Arya on 07/02/2018.
 */

@DefaultUrl("https://www.ebay.com.au/")
public class eBayCartPage extends PageObject {

    @FindBy(id = "gh-ac")
    WebElementFacade searchBox;

    @FindBy(id = "gh-btn")
    WebElementFacade search;

    @FindBy(xpath = "//a[text()='New Samsung Galaxy S7 G930F LTE 4G Mobile 32GB 1Yr Wty in Sealed Box']")
    WebElementFacade mobilePurchase;

    @FindBy(id="msku-sel-1")
    WebElementFacade colorDropdown;

    @FindBy(id = "isCartBtn_btn")
    WebElementFacade addtocart;

    @FindBy(xpath = "//a[text()='Laptop lenevo ideapad 320 15 inch']")
    WebElementFacade laptopPurchase;

    @FindBy(xpath = "//h1[text()='Your eBay Shopping Cart']")
    WebElementFacade shoppingCart;

    boolean searchMobile = true;
   // private boolean True;

    public void ebayhome()
    {
        getDriver().manage().window().maximize();
    }

    public void searchItem(String searchInput)
    {
        searchBox.click();
        searchBox.clear();
        searchBox.sendKeys(searchInput);
        waitFor(300);
        search.click();

        if(searchInput.trim().contains("Mobile"))
        {
            System.out.println("Hello Mobile");
            waitForRenderedElements(By.xpath("//a[text()='New Samsung Galaxy S7 G930F LTE 4G Mobile 32GB 1Yr Wty in Sealed Box']"));
            mobilePurchase.click();
            waitFor(300);
            colorDropdown.sendKeys("Black");

        }
        else if(searchInput.trim().contains("Lenevo"))
        {
            System.out.println("Hello Laptop "+searchInput);
            waitForRenderedElements(By.xpath("//a[text()='Laptop lenevo ideapad 320 15 inch']"));
            laptopPurchase.click();
        }
        else
        {
            System.out.println("Hello else"+searchInput);
        }

    }

    public void addToCart()
    {
        addtocart.click();
    }

    public void productAdded()
    {
        String cart = shoppingCart.getText();
        System.out.println(cart);
        Assert.assertEquals("Your eBay Shopping Cart", cart);

    }
}
