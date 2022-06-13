package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentDetailspg {

	public WebDriver driver;
	Select objSelect;

	public PaymentDetailspg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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

	@FindBy(how = How.NAME, using = "pass1")
	@CacheLookup
	private WebElement pass1;

	@FindBy(how = How.NAME, using = "creditCard")
	@CacheLookup
	private WebElement creditCard;

	@FindBy(how = How.NAME, using = "expDate")
	@CacheLookup
	private WebElement expDate;

	@FindBy(how = How.NAME, using = "saveCC")
	@CacheLookup
	private WebElement saveCC;
	
	@FindBy(how = How.NAME, using = "buyFlights")
	@CacheLookup
	private WebElement btnbuyFlights;

//set textbox value

	public void setfname(String value) {
		this.firstName.click();
		this.firstName.clear();
		this.firstName.sendKeys(value);
	}

	public void setlname(String value) {
		this.lastName.click();
		this.lastName.clear();
		this.lastName.sendKeys(value);
	}

	public void setaddress1(String value) {
		this.address1.click();
		this.address1.clear();
		this.address1.sendKeys(value);
	}

	public void setaddress2(String value) {
		this.address2.click();
		this.address2.clear();
		this.address2.sendKeys(value);
	}

	public void setPassangerDetail(String value) {
		this.firstName.click();
		this.firstName.clear();
		this.firstName.sendKeys(value);
	}

	public void setcreditCard(String cardNo) {
		this.creditCard.click();
		this.creditCard.clear();
		this.creditCard.sendKeys(cardNo);
	}

	public void setexpDate(String cardExp) {
		this.expDate.click();
		this.expDate.clear();
		this.expDate.sendKeys(cardExp);
	}

//	click checkbox
	public void setSaveCC() {
		this.saveCC.click();
	}
	
	//click button
	public void clkbtnbuyFlights() {
		this.btnbuyFlights.click();
	}

	public void PaymentDetails(String fname, String lname, String address, String stateZip, String cardNo,
			String cardExp) {

		this.setfname(fname);
		this.setlname(lname);
		this.setaddress1(address);
		this.setaddress2(stateZip);
		this.setPassangerDetail(fname + lname);
		this.setcreditCard(cardNo);
		this.setexpDate(cardExp);
		this.setSaveCC();
		this.clkbtnbuyFlights();
	}
}
