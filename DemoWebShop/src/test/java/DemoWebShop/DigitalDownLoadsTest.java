package DemoWebShop;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pompages.CheckoutPage_Billing;
import pompages.CheckoutPage_ConfirmOrder;
import pompages.CheckoutPage_PaymentInformation;
import pompages.CheckoutPage_PaymentMethod;
import pompages.DigitalDownloadsPage;
import pompages.LoginPage;
import pompages.ShoppingCartPage;
import pompages.ThankYouPage;
import pompages.ThirdAlbumPage;

public class DigitalDownLoadsTest extends BaseTest {

	@Test
	public void login() {
		LoginPage login = new LoginPage(driver);
		login.getLoginLink().click();
		Reporter.log("Clicking on Login Link", true);

		login.getEmail_TextField().clear();
		login.getEmail_TextField().sendKeys("meghadevaraja1998@gmail.com");
		Reporter.log("Enter Email", true);

		login.getPassword_TextField().clear();
		login.getPassword_TextField().sendKeys("Megha@123");
		Reporter.log("Enter Password", true);

		login.getRememberMe_CheckBox().click();
		Reporter.log("Checking RememberMe_CheckBox()", true);

		login.getLogin_Button().click();
		Reporter.log("Clicking on Login button", true);

	}

	@Test(priority = 1)
	public void navigateToThirdAlbumPage() {
		DigitalDownloadsPage digitalDownloads = new DigitalDownloadsPage(driver);

		digitalDownloads.getDigitalDownloads_Button().click();
		Reporter.log("Clicking on DigitalDownloads Button", true);
		assertTrue(digitalDownloads.getDigitalDownloads_PageText().isDisplayed(),
				"Digital Downloads Page is Displayed");

		assertTrue(digitalDownloads.getSortBy_DropDown().isDisplayed(), "SortBy DropDown is not Displayed");
		digitalDownloads.getA_to_Z_Option().click();
		Reporter.log("Clicking on A to Z Option", true);

		assertTrue(digitalDownloads.getDisplayPerPage_DropDown().isDisplayed(),
				"Display perpage DropDown is not Displayed");
		digitalDownloads.getFour_Option().click();
		Reporter.log("Clicking on 4 Option", true);

		assertTrue(digitalDownloads.getViewAs_DropDown().isDisplayed(), "ViewAs DropDown is not Displayed");
		digitalDownloads.getList_Option().click();
		Reporter.log("Clicking on List Option", true);

		digitalDownloads.getThirdAlbum_Link().click();
		Reporter.log("Clicking on ThirdAlbum_Link", true);

	}

	@Test(priority = 2)
	public void navigateToShoppingCartPage() {
		ThirdAlbumPage thirdAlbum = new ThirdAlbumPage(driver);

		assertTrue(thirdAlbum.getThirdAlbumPage().isDisplayed(), "ThirdAlbumPage isn't displayed");

		thirdAlbum.getAddToCart().click();
		Reporter.log("Clicking on Add to Cart Button", true);

		assertTrue(thirdAlbum.getConfirmationMessage().isDisplayed(), "Confirmation message isn't displayed");
	}

	@Test(priority = 3)
	public void navigateToCheckoutPage() {
		ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);

		shoppingCart.getShoppingCart_Link().click();
		Reporter.log("Clicking on ShoppingCart Link");

		assertTrue(shoppingCart.getShoppingCartPage().isDisplayed(), "Shopping cart Page isn't displayed");
		Reporter.log("Displaying Shopping Cart page", true);

		shoppingCart.getTermsOfService_Checkbox().click();
		Reporter.log("Clicking on TermsOfService Checkbox");

		shoppingCart.getCheckOut_Button().click();
		Reporter.log("Clicking on CheckOut Button");

	}

	@Test(priority = 4)
	public void navigateToThankYouPage() {
		CheckoutPage_Billing billing = new CheckoutPage_Billing(driver);

		assertTrue(billing.getCheckoutPage().isDisplayed(), "Check Out page is not displayed");
		Reporter.log("Displaying Check Out page", true);

		Reporter.log("Displaying Billing Address Field", true);
		assertTrue(billing.BillingAddress_Field.isDisplayed(), "Not displaying Billing Address Field");

		billing.getBillingAddress_DropDown().click();
		billing.getNewAddress().click();
		Reporter.log("Selecting New Address", true);

		billing.getFirstName().clear();
		billing.getFirstName().sendKeys("Megha");
		Reporter.log("Entering FirstName in FirstName textfield", true);

		billing.getLastName().clear();
		billing.getLastName().sendKeys("Devraj");
		Reporter.log("Entering LastName in LastName textfield", true);

		billing.getEmail().clear();
		billing.getEmail().sendKeys("meghadevaraja1998@gmail.com");
		Reporter.log("Entering Email in Email textfield", true);

		billing.getCompany().clear();
		billing.getCompany().sendKeys("TY");
		Reporter.log("Entering CompanyName in Company textfield", true);

		billing.getCountryId().click();
		billing.getCountryName().click();
		Reporter.log("Selecting Country as India ", true);

		billing.getCity().clear();
		billing.getCity().sendKeys("Bengaluru");
		Reporter.log("Entering Cityname in City textfield", true);

		billing.getAddress1().clear();
		billing.getAddress1().sendKeys("Katreguppe,Banashankari");
		Reporter.log("Entering Address in Address1 textfield", true);

		billing.getZipPostalCode().clear();
		billing.getZipPostalCode().sendKeys("560085");
		Reporter.log("Entering Zipcode in Zip textfield", true);

		billing.getPhoneNumber().clear();
		billing.getPhoneNumber().sendKeys("9874563210");
		Reporter.log("Entering Phone number in Phone number textfield", true);

		billing.getBillingAddress_ContinueButton().click();
		Reporter.log("Clicking on Continue button in Billing Address", true);
	}

	@Test(priority = 5)
	public void navtigateToPaymentInformation() {
		CheckoutPage_PaymentMethod paymentMethod = new CheckoutPage_PaymentMethod(driver);

		assertTrue(paymentMethod.getPaymentMethodField().isDisplayed(), "PaymentMethod Field is not Displayed");
		Reporter.log("PaymentMethod Field is Displayed", true);

		paymentMethod.getCheckMoneyOrder_RadioButton().click();
		Reporter.log("Clicking on Check Money Order RadioButton", true);

		paymentMethod.getPaymentMethod_Continue_Button().click();
		Reporter.log("Clicking on Continue_Button in Payment Method", true);

	}

	@Test(priority = 6)
	public void navtigateToConfirmOrder() throws AWTException {
		CheckoutPage_PaymentInformation paymentInformation = new CheckoutPage_PaymentInformation(driver);

		assertTrue(paymentInformation.getPaymentInformationField().isDisplayed(),
				"Payment Information Field is not Displayed");
		Reporter.log("Payment Information Field is Displayed", true);

		paymentInformation.getPaymentInformation_Continue_Button().click();
		Reporter.log("Clicking on Continue_Button in Payment Information", true);

	}

	@Test(priority = 7)
	public void navtigateToThankYouPage() throws AWTException {
		CheckoutPage_ConfirmOrder confirmOrder = new CheckoutPage_ConfirmOrder(driver);

		assertTrue(confirmOrder.getConfirmOrderField().isDisplayed(), "Confirm Order Field is not Displayed");
		Reporter.log("Confirm Order Field is Displayed", true);

		assertTrue(confirmOrder.getBillingAddress_Details().isDisplayed(), "BillingAddress_Details is not Displayed");
		Reporter.log("BillingAddress_Details is Displayed", true);

		assertTrue(confirmOrder.getPaymentmethod_Details().isDisplayed(), "Paymentmethod_Details is not Displayed");
		Reporter.log("Paymentmethod_Details is Displayed", true);

		confirmOrder.getConfirmationOrder_Confirm_Button().click();
		Reporter.log("Clicking on Confirm_Button in Confirmation Order ", true);

	}

	@Test(priority = 8)
	public void navtigateToHomePage() {
		ThankYouPage thankYou = new ThankYouPage(driver);

		assertTrue(thankYou.getThankYouPage().isDisplayed(), "ThankYou Page is not Displayed");
		Reporter.log("ThankYou Page is Displayed", true);

		assertTrue(thankYou.getConfirmationMessage().isDisplayed(), "Confirmation Message is not Displayed");
		Reporter.log("Confirmation Message is Displayed", true);

		assertTrue(thankYou.getOrderNumber().isDisplayed(), "Order Number is not Displayed");
		Reporter.log("Order Number is Displayed", true);

		thankYou.getThankYouPage_Continue_button().click();
		Reporter.log("Clicking on Continue Button in ThankYou Page", true);

		assertTrue(thankYou.getHomePage().isDisplayed(), "HomePage is not Displayed");
		Reporter.log("HomePage is Displayed", true);

	}
}
