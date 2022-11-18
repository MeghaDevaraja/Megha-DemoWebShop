package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage_PaymentInformation {

	public CheckoutPage_PaymentInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Payment information']")
	private WebElement PaymentInformationField;

	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement PaymentInformation_Continue_Button;

	public WebElement getPaymentInformationField() {
		return PaymentInformationField;
	}

	public WebElement getPaymentInformation_Continue_Button() {
		return PaymentInformation_Continue_Button;
	}

}
