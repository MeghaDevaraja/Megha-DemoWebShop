package DemoWebShop;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;
import base.BaseTest;
import pompages.RegisterPage;

public class RegisterTest extends BaseTest {
	@Test
	public void register() {
		RegisterPage register = new RegisterPage(driver);
		register.getRegisterLink().click();
		Reporter.log("Clicking on Register Link", true);
		assertTrue(register.getRegisterPage().isDisplayed(), "Not displaying on Register Page");

		register.getFemaleRadioButton().click();
		Reporter.log("Checking Female Radio button", true);

		register.getFirstName().clear();
		register.getFirstName().sendKeys("Megha");
		Reporter.log("Enter First Name", true);

		register.getLastName().clear();
		register.getLastName().sendKeys("Devraj");
		Reporter.log("Enter Last Name", true);

		register.getEmail().clear();
		register.getEmail().sendKeys("meghadevaraja1998@gmail.com");
		Reporter.log("Enter Email", true);

		register.getPassword().clear();
		register.getPassword().sendKeys("Megha@123");
		Reporter.log("Enter Password", true);

		register.getConfirmPassword().clear();
		register.getConfirmPassword().sendKeys("Megha@123");
		Reporter.log("Enter ConfirmPassword", true);

		register.getRegisterButton().click();
		Reporter.log("Clicking on Register Button", true);

	}
}
