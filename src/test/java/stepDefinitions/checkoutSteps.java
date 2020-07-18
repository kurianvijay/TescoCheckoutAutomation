package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.openqa.selenium.By;

public class checkoutSteps extends CommonFunctions {
    
    @Given("^I am on the Tesco Home page \"([^\"]*)\"$")
    public void i_am_on_the_Tesco_Home_page(String url)  {
        driver.get(url);
    }

    @Given("^I click on the Sign In button$")
    public void i_click_on_the_Sign_In_button()  {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/header/div/div[1]/ul/li[1]/div/a/span[2]")).click();
    }

    @When("^I add my email \"([^\"]*)\"$")
    public void i_add_my_email(String email)  {
        driver.findElement(By.id("username")).sendKeys(email);
    }

    @When("^I add my password \"([^\"]*)\"$")
    public void i_add_my_password(String password)  {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("^I click the Sign in button$")
    public void i_click_the_Sign_in_button()  {
        driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button/span")).click();
    }

    @When("^I add an item to the searchbar \"([^\"]*)\"$")
    public void i_add_an_item_to_the_searchbar(String arg1)  {

    }

    @When("^I click the search button$")
    public void i_click_the_search_button() {

    }

    @When("^I select a product and click the add button$")
    public void i_select_a_product_and_click_the_add_button()  {
        
    }

    @When("^I add quantity with the \\+ button$")
    public void i_add_quantity_with_the_button()  {
        
    }

    @When("^I click the basket icon to go to my basket$")
    public void i_click_the_basket_icon_to_go_to_my_basket()  {
        
    }

    @Then("^I should see the item added \"([^\"]*)\"$")
    public void i_should_see_the_item_added(String arg1)  {
        
    }
}
