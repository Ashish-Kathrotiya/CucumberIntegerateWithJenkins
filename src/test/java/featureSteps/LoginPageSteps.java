package featureSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {
	
	LoginPage loginPage = new LoginPage();
	
	 @Given("^user navigates to xyz website$")
	    public void navigateToURL() throws Throwable {
		 loginPage.navigateToHomePage();
	 }
	 
	 @When("^user hit login button$")
	    public void user_hit_login_button() throws Throwable {
	        
	    }


}
