package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Register {

	public WebDriver driver;
	
	public Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[text()='sign up now']")
	@CacheLookup
	private WebElement lnkSignup;
	@FindBy(how = How.XPATH, using = "//blockquote//input[@name='username']")
	@CacheLookup
	private WebElement username;

	@FindBy(how = How.XPATH, using = "//blockquote//input[@name='password']")
	@CacheLookup
	private WebElement pass;

	@FindBy(how = How.NAME, using = "passwordConfirm")
	@CacheLookup
	private WebElement passwordConfirm;

	@FindBy(how = How.NAME, using = "firstName")
	@CacheLookup
	private WebElement firstName;

	@FindBy(how = How.NAME, using = "lastName")
	@CacheLookup
	private WebElement lastName;

	@FindBy(how = How.NAME, using = "address1")
	@CacheLookup
	private WebElement address1;

	@FindBy(how = How.NAME, using = "address2")
	@CacheLookup
	private WebElement address2;

	@FindBy(how = How.NAME, using = "register")
	@CacheLookup
	private WebElement btnregister;

//set>
	public void clkLnk() {
//		WebDriverWait wait = new WebDriverWait(driver, 100);
//		wait.until(ExpectedConditions.elementToBeClickable(lnkSignup));
//		System.out.println(this.lnkSignup.isDisplayed());
	}
//set textbox value >>>>
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

	public void setpasswordConfirm(String value) {
		this.passwordConfirm.click();
		this.passwordConfirm.clear();
		this.passwordConfirm.sendKeys(value);
	}

	public void setfname(String value) {
		this.firstName.click();
		this.firstName.clear();
		this.firstName.sendKeys(value);
	}

	public void setsname(String value) {
		this.lastName.click();
		this.lastName.clear();
		this.lastName.sendKeys(value);
	}

	public void setadd(String value) {
		this.address1.click();
		this.address1.clear();
		this.address1.sendKeys(value);
	}

	public void setzip(String value) {
		this.address2.click();
		this.address2.clear();
		this.address2.sendKeys(value);
	}
	//click button>>>
	public void clkbtnregister() {
		this.btnregister.click();
	}

	public void newUser(String uname, String pass, String name, String surname, String addrs, String zip) {
		this.clkLnk();
		this.setuname(uname);
		this.setPass(pass);
		this.setpasswordConfirm(pass);
		this.setfname(name);
		this.setsname(surname);
		this.setadd(addrs);
		this.setzip(zip);
		this.clkbtnregister();
	}
}
