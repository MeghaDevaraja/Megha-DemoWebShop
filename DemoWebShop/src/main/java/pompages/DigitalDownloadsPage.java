package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {

	public DigitalDownloadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement DigitalDownloads_Button;
	
	@FindBy(xpath="//h1[text()='Digital downloads']")
	private WebElement DigitalDownloads_PageText;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	private WebElement SortBy_DropDown;
	
	@FindBy(xpath="//option[text()='Name: A to Z']")
	private WebElement A_to_Z_Option;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	private WebElement DisplayPerPage_DropDown;
	
	@FindBy(xpath="//option[text()='4']")
	private WebElement Four_Option;
	
	@FindBy(xpath="//select[@id='products-viewmode']")
	private WebElement ViewAs_DropDown;
	
	@FindBy(xpath="//option[text()='List']")
	private WebElement List_Option;
	
	@FindBy(xpath="//h2[@class='product-title']//a[text()='3rd Album']")
	private WebElement ThirdAlbum_Link;

	public WebElement getDigitalDownloads_Button() {
		return DigitalDownloads_Button;
	}

	public WebElement getDigitalDownloads_PageText() {
		return DigitalDownloads_PageText;
	}

	public WebElement getSortBy_DropDown() {
		return SortBy_DropDown;
	}

	public WebElement getA_to_Z_Option() {
		return A_to_Z_Option;
	}

	public WebElement getDisplayPerPage_DropDown() {
		return DisplayPerPage_DropDown;
	}

	public WebElement getFour_Option() {
		return Four_Option;
	}

	public WebElement getViewAs_DropDown() {
		return ViewAs_DropDown;
	}

	public WebElement getList_Option() {
		return List_Option;
	}

	public WebElement getThirdAlbum_Link() {
		return ThirdAlbum_Link;
	}
	
	
}
