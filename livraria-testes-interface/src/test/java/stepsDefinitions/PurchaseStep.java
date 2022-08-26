package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class PurchaseStep {

	@Given("that we already have a person registered in the store")
	public void thatWeAlreadyHaveAPersonRegisteredInTheStore() throws Exception {
		acessarSitema();
		Na(LoginPage.class).login("qaprendendo@dayrep.com", "123456");
	}

	@When("I select an item to add to the cart")
	public void iSelectAnItemToAddToTheCart() throws Exception {
		descerScroll();
		Na(MainPage.class).btnBlouse.click();
		esperar(2);
		Na(MainPage.class).btnAddToCart.click();
		esperar(5);
		Na(MainPage.class).btnProceedToCheckout.click();
		descerScroll();
		Na(MainPage.class).btnProceedToCheckoutSecond.click();
	}

	@When("fill in all the information about the address")
	public void fillInAllTheInformationAboutTheAddress() throws Exception {
		descerScroll();
		Na(MainPage.class).btnProceedToCheckoutSecond.click();
	}

	@When("fill in the shipping and payment informations")
	public void fillInTheShippingAndPaymentInformations() throws Exception {
		Na(MainPage.class).checkbox.click();
		Na(MainPage.class).btnProceedToCheckoutShipping.click();
		descerScroll();
		Na(MainPage.class).btnPayByCheck.click();
		Na(MainPage.class).btnConfirmOrder.click();
		
	}

	@Then("is displayed in the final screen the message that confirms the purchase")
	public void isDisplayedInTheFinalScreenTheMessageThatConfirmsThePurchase() throws Exception {
		esperar(2);
		assertTrue(Na(MainPage.class).txtPurchaseComplete.isDisplayed());
		//showMessageDialog(null, "You did it!");
	}
	
	@When("dont check the box terms of service")
	public void dontCheckTheBoxTermsOfService() throws Exception {
		esperar(2);
		Na(MainPage.class).btnProceedToCheckoutShipping.click();
	}
	
	@Then("is displayed the message of error")
	public void isDisplayedTheMessageOfError() throws Exception {
		esperar(2);
		assertTrue(Na(MainPage.class).txtTermsOfService.isDisplayed());
		//showMessageDialog(null, "You did it!");
	}

}
