package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {

	public ThankYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Thank you']")
	private WebElement ThankYouPage;

	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement ConfirmationMessage;

	@FindBy(xpath = "//ul[@class='details']/li[1]")
	private WebElement OrderNumber;

	@FindBy(xpath = "//input[@class='button-2 order-completed-continue-button']")
	private WebElement ThankYouPage_Continue_button;

	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement HomePage;

	public WebElement getThankYouPage() {
		return ThankYouPage;
	}

	public WebElement getConfirmationMessage() {
		return ConfirmationMessage;
	}

	public WebElement getOrderNumber() {
		return OrderNumber;
	}

	public WebElement getThankYouPage_Continue_button() {
		return ThankYouPage_Continue_button;
	}

	public WebElement getHomePage() {
		return HomePage;
	}

}
