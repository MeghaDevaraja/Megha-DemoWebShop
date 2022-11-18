package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdAlbumPage {

	public ThirdAlbumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='product-name']")
	private WebElement ThirdAlbumPage;

	@FindBy(id = "add-to-cart-button-53")
	private WebElement AddToCart_Button;

	@FindBy(xpath = "//p[contains(text(),'The product has been added to your')]")
	private WebElement ConfirmationMessage;

	public WebElement getThirdAlbumPage() {
		return ThirdAlbumPage;
	}

	public WebElement getAddToCart() {
		return AddToCart_Button;
	}

	public WebElement getConfirmationMessage() {
		return ConfirmationMessage;
	}

}
