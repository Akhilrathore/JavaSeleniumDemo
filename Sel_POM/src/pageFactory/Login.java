package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "username")
	@CacheLookup
	private WebElement username;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	private WebElement pass;
	
	@FindBy(how = How.NAME, using = "login")
	@CacheLookup
	private WebElement btnlogin;

////set textbox value
	public void setuname(String value) {
		this.username.click();
		this.username.clear();
		this.username.sendKeys(value);
	}

	public void setPass(String value) {
		this.pass.click();
		this.pass.clear();
		this.pass.sendKeys(value);
	}
// click button
	public void clkbtnregister() {
		this.btnlogin.click();
	}

	public void log_in(String uname, String pass) {
		this.setuname(uname);
		this.setPass(pass);
		this.clkbtnregister();
	}
}
