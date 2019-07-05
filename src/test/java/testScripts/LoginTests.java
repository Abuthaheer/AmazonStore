package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginObject;

public class LoginTests {
	LoginObject lg;

	public LoginTests() {
		lg = new LoginObject();
	}

	@Test
	public void verifyLogin() {
		lg.login("Abuthaheer123", "qwerrw");
		Assert.assertTrue(lg.getTitlte().contains("Search"), "Failed: Not logged in");
	}

	@Test
	public void verifyUserName() {
		lg.setUserName("Abu");
		String name = lg.getUserName();
		Assert.assertTrue(name.equals("Abu"), "Failed- Invlaid text entered =" + name);
	}

	@Test
	public void verifyInvalidLogin() {

	}

}
