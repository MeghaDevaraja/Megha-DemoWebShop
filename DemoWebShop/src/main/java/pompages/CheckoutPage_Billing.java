package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage_Billing {

	public CheckoutPage_Billing(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Checkout']")
	public WebElement CheckoutPage;

	@FindBy(xpath = "//h2[text()='Billing address']")
	public WebElement BillingAddress_Field;

	@FindBy(id = "billing-address-select")
	public WebElement BillingAddress_DropDown;

	@FindBy(xpath = "//option[text()='New Address']")
	public WebElement NewAddress_Option;

	@FindBy(id = "BillingNewAddress_FirstName")
	public WebElement FirstName_TextField;

	@FindBy(id = "BillingNewAddress_LastName")
	public WebElement LastName_TextField;

	@FindBy(id = "BillingNewAddress_Email")
	public WebElement Email_TextField;

	@FindBy(id = "BillingNewAddress_Company")
	public WebElement Company_TextField;

	@FindBy(id = "BillingNewAddress_CountryId")
	public WebElement CountryId_DropDown;

	@FindBy(xpath = "//option[text()='India']")
	public WebElement CountryName;

	@FindBy(id = "BillingNewAddress_City")
	public WebElement City_TextField;

	@FindBy(id = "BillingNewAddress_Address1")
	public WebElement Address1_TextField;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	public WebElement ZipPostalCode_TextField;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	public WebElement PhoneNumber_TextField;

	@FindBy(xpath = "//input[@class='button-1 new-address-next-step-button']")
	public WebElement BillingAddress_Continue_Button;

	public WebElement getCheckoutPage() {
		return CheckoutPage;
	}

	public WebElement getBillingAddress_Field() {
		return BillingAddress_Field;
	}

	public WebElement getBillingAddress_DropDown() {
		return BillingAddress_DropDown;
	}

	public WebElement getNewAddress() {
		return NewAddress_Option;
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

	public WebElement getCompany() {
		return Company_TextField;
	}

	public WebElement getCountryId() {
		return CountryId_DropDown;
	}

	public WebElement getCountryName() {
		return CountryName;
	}

	public WebElement getCity() {
		return City_TextField;
	}

	public WebElement getAddress1() {
		return Address1_TextField;
	}

	public WebElement getZipPostalCode() {
		return ZipPostalCode_TextField;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber_TextField;
	}

	public WebElement getBillingAddress_ContinueButton() {
		return BillingAddress_Continue_Button;
	}

	
}
