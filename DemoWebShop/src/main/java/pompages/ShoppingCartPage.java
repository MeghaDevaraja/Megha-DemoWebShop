package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingCart_Link;
	
	@FindBy(xpath ="//h1[text()='Shopping cart']")
	private WebElement ShoppingCartPage;
	
	@FindBy(id = "termsofservice")
	private WebElement TermsOfService_Checkbox;
	
	@FindBy(id = "checkout")
	private WebElement checkOut_Button;

	public WebElement getShoppingCart_Link() {
		return ShoppingCart_Link;
	}

	public WebElement getShoppingCartPage() {
		return ShoppingCartPage;
	}

	public WebElement getTermsOfService_Checkbox() {
		return TermsOfService_Checkbox;
	}

	public WebElement getCheckOut_Button() {
		return checkOut_Button;
	}
	
	
}





