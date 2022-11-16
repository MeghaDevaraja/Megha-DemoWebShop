package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLink;

	@FindBy(xpath = "//h1[text()='Register']")
	private WebElement RegisterPage;

	@FindBy(id = "gender-female")
	private WebElement FemaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement FirstName_TextField;

	@FindBy(id = "LastName")
	private WebElement LastName_TextField;

	@FindBy(id = "Email")
	private WebElement Email_TextField;

	@FindBy(id = "Password")
	private WebElement Password_TextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPassword_TextField;

	@FindBy(id = "register-button")
	private WebElement RegisterButton;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getRegisterPage() {
		return RegisterPage;
	}

	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}

	public WebElement getFirstName() {
		return FirstName_TextField;
	}

	public WebElement getLastName() {
		return LastName_TextField;
	}

	public WebElement getEmail() {
		return Email_TextField;
	}

	public WebElement getPassword() {
		return Password_TextField;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword_TextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

}
