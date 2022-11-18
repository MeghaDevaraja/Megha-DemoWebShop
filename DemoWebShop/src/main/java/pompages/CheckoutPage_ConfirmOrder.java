package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage_ConfirmOrder {

	public CheckoutPage_ConfirmOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Confirm order']")
	private WebElement ConfirmOrderField;

	@FindBy(xpath = "//strong[text()='Billing Address']")
	private WebElement BillingAddress_Details;

	@FindBy(xpath = "//strong[text()='Payment Method']")
	private WebElement Paymentmethod_Details;

	@FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement ConfirmationOrder_Confirm_Button;

	public WebElement getConfirmOrderField() {
		return ConfirmOrderField;
	}

	public WebElement getBillingAddress_Details() {
		return BillingAddress_Details;
	}

	public WebElement getPaymentmethod_Details() {
		return Paymentmethod_Details;
	}

	public WebElement getConfirmationOrder_Confirm_Button() {
		return ConfirmationOrder_Confirm_Button;
	}

}