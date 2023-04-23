package StepDefination;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestCase {
	
	LoginPage obj = new LoginPage();
	
	
	@Given("user on the shopping website")
	public void user_on_the_shopping_website() throws InterruptedException {
		obj.LaunchApplication();
		Thread.sleep(3000);
	}
	
	

	@When("user search for {string} in the search bar")
	public void user_search_for_in_the_search_bar(String string) throws InterruptedException {
	   obj.searchElement("Top");
	   Thread.sleep(3000);
	}

	@Then("user should see a list of search results for {string}")
	public void user_should_see_a_list_of_search_results_for(String string) throws InterruptedException {
	  obj.listSearchResult("Top");
	  Thread.sleep(3000);
	}

	@Then("click on the search button")
	public void click_on_the_search_button() throws InterruptedException {
	  obj.clickButton();
	  Thread.sleep(3000);
	}
	
	

  
   

   

	@When("user should click on Best sellers it shows the results")
	public void user_should_click_on_best_sellers_it_shows_the_results() throws InterruptedException {
	    obj.bestSellers();
	    Thread.sleep(3000);
	}

	@When("user click on Hello select your address")
	public void user_click_on_hello_select_your_address() throws InterruptedException {
	   obj.helloSelectYourAddress();
	   Thread.sleep(3000);
	}

	@When("user give {string} pincode in textbox")
	public void user_give_pincode_in_textbox(String string) throws InterruptedException {
	  obj.addPincodeInTextBox();
	  Thread.sleep(3000);
	}

	@Then("user click on apply")
	public void user_click_on_apply() throws InterruptedException {
	   obj.clickOnApplyButton();
	   Thread.sleep(3000);
	}
	
	@Then("close Browser")
	public void close_browser()  {
	    obj.closeBrowser();
	    
	}

}
	
	
	
