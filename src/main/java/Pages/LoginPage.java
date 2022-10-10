package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DriverManager;
import Utility.Util;

public class LoginPage extends DriverManager {

	@FindBy(xpath = "//input[@id='login-textfield-enteremail-inputEl']")
	WebElement email;

	@FindBy(xpath = "//input[@id='login-textfield-enterpassword-inputEl']")
	WebElement password;

	@FindBy(xpath = "//a[@id='login-button-submit']")
	WebElement login;

	@FindBy(xpath = "//*[starts-with(text(),'Forgot your password')]")
	WebElement forgotPassword;

	public LoginPage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	public DashboardPage clearTextFields() {
		Util.clear(email);
		Util.clear(password);
		return new DashboardPage();
	}

	public DashboardPage enterEmail(String eMail) {
		Util.sendText(email, eMail);
		return new DashboardPage();
	}

	public DashboardPage enterPass(String passWord) {
		Util.sendText(password, passWord);
		return new DashboardPage();
	}

	public DashboardPage clickLoginButton() {
		Util.click(login);
		return new DashboardPage();
	}

	public void clickOnForgotPassword() {
		Util.click(forgotPassword);
	}
}