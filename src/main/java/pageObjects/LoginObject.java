package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject extends BasePage {

	@FindBy(id = "username")
	private WebElement txtBoxUserName;

	@FindBy(id = "password")
	private WebElement txtBoxPassWord;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public LoginObject() {
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {
		setText(txtBoxUserName, user);
		setText(txtBoxPassWord, pass);
		btnLogin.click();
	}

	public void setUserName(String user) {
		setText(txtBoxUserName, user);
	}

	public String getUserName() {
		return txtBoxUserName.getAttribute("value");
	}

}
