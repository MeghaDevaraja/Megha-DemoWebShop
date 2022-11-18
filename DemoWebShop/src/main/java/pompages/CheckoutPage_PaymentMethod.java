package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage_PaymentMethod {

	public CheckoutPage_PaymentMethod(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Payment method']")
	private WebElement PaymentMethodField;

	@FindBy(xpath = "//label[text()='Cash On Delivery (COD) (7.00)']")
	private WebElement CashOnDelivery_RadioButton;

	@FindBy(xpath = "//label[text()='Check / Money Order (5.00)']")
	private WebElement CheckMoneyOrder_RadioButton;

	@FindBy(xpath = "//label[text()='Credit Card']")
	private WebElement CreditCard_RadioButton;

	@FindBy(xpath = "//label[text()='Purchase Order']")
	private WebElement PurchaseOrder_RadioButton;

	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement PaymentMethod_Continue_Button;

	public WebElement getPaymentMethodField() {
		return PaymentMethodField;
	}

	public WebElement getCashOnDelivery_RadioButton() {
		return CashOnDelivery_RadioButton;
	}

	public WebElement getCheckMoneyOrder_RadioButton() {
		return CheckMoneyOrder_RadioButton;
	}

	public WebElement getCreditCard_RadioButton() {
		return CreditCard_RadioButton;
	}

	public WebElement getPurchaseOrder_RadioButton() {
		return PurchaseOrder_RadioButton;
	}

	public WebElement getPaymentMethod_Continue_Button() {
		return PaymentMethod_Continue_Button;
	}

}
