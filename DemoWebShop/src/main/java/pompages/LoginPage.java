package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getEmail_TextField() {
		return Email_TextField;
	}

	public WebElement getPassword_TextField() {
		return Password_TextField;
	}

	public WebElement getRememberMe_CheckBox() {
		return RememberMe_CheckBox;
	}

	public WebElement getLogin_Button() {
		return Login_Button;
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement LoginLink;

	@FindBy(id = "Email")
	private WebElement Email_TextField;

	@FindBy(id = "Password")
	private WebElement Password_TextField;

	@FindBy(id = "RememberMe")
	private WebElement RememberMe_CheckBox;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement Login_Button;

}
