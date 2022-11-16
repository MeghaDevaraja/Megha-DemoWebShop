package DemoWebShop;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pompages.LoginPage;

public class LoginTest extends BaseTest {
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
}
