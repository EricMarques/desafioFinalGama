package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class LoginPage {

	@FindBy(linkText = "Sign in")
	public WebElement btnLogin;
	
	@FindBy(css = "input#email")
	public WebElement inputEmail;
	
	@FindBy(css = "input#passwd")
	public WebElement inputPasswd;
	
	@FindBy(xpath = "//span[text()[normalize-space()='Sign in']]")
	public WebElement btnSingIn;
	
	@FindBy(className = "icon-home")
	public WebElement btnHome;
	
	
	public void login(String email, String passwd) throws Exception {
		btnLogin.click();
		esperar(2);
		inputEmail.sendKeys(email);
		esperar(1);
		inputPasswd.sendKeys(passwd);
		esperar(1);
		btnSingIn.click();
		esperar(2);
		btnHome.click();
	}
	
}
