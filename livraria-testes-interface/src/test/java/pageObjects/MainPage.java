package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	
	@FindBy(xpath = "(//img[@src='http://automationpractice.com/img/p/7/7-home_default.jpg'])[1]")
	public WebElement btnImageContainer;
	
	@FindBy(css = "ul#homefeatured>li:nth-of-type(2)>div>div:nth-of-type(2)>h5>a")
	public WebElement btnBlouse;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	public WebElement btnAddToCart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']//span[1]")
	public WebElement btnProceedToCheckout;
	
	// Btn Proceed Summary and Address
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	public WebElement btnProceedToCheckoutSecond;
	
	//button[@name='processCarrier']
	@FindBy(name = "processCarrier")
	public WebElement btnProceedToCheckoutShipping;

	@FindBy(css = "input#cgv")
	public WebElement checkbox;
	
	@FindBy(xpath = "(//span[text()='(order processing will be longer)'])[2]")
	public WebElement btnPayByCheck;
	
	@FindBy(xpath = "//span[text()='I confirm my order']")
	public WebElement btnConfirmOrder;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	public WebElement txtPurchaseComplete;
	
	@FindBy(xpath = "//p[text()='You must agree to the terms of service before continuing.']")
	public WebElement txtTermsOfService;
	
	
	
	
	
	
}
