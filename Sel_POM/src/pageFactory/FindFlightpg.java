package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindFlightpg {

	public WebDriver driver;
	Select objSelect;

	public FindFlightpg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//img[@alt='Search Flights Button']")
	@CacheLookup
	private WebElement btnSearchFlights;

	@FindBy(how = How.NAME, using = "depart")
	@CacheLookup
	private WebElement depart;

	@FindBy(how = How.NAME, using = "departDate")
	@CacheLookup
	private WebElement departDate;

	@FindBy(how = How.NAME, using = "arrive")
	@CacheLookup
	private WebElement arrive;

	@FindBy(how = How.NAME, using = "returnDate")
	@CacheLookup
	private WebElement returnDate;

	@FindBy(how = How.NAME, using = "numPassengers")
	@CacheLookup
	private WebElement numPassengers;

	@FindBy(how = How.NAME, using = "roundtrip")
	@CacheLookup
	private WebElement roundtrip;

	@FindBy(how = How.XPATH, using = "//input[@value='Window']")
	@CacheLookup
	private WebElement seatPref;

	@FindBy(how = How.XPATH, using = "//input[@value='Business']")
	@CacheLookup
	private WebElement seatType;

	@FindBy(how = How.NAME, using = "findFlights")
	@CacheLookup
	private WebElement btnfindFlights;

	// select list
	public void setArriveSelector(int value) {
		objSelect = new Select(arrive);
		objSelect.selectByIndex(value);
	}

	public void setDepartSelector(int value) {
		objSelect = new Select(depart);
		objSelect.selectByIndex(value);
	}

	// set textbox value >>
	public void clkbtnbtnSearchFlights() {
		this.btnfindFlights.click();
	}

	public void setdepartDate(String value) {
		this.departDate.click();
		this.departDate.clear();
		this.departDate.sendKeys(value);
	}

	public void setretrnDate(String value) {
		this.returnDate.click();
		this.returnDate.clear();
		this.returnDate.sendKeys(value);
	}

	public void SetPassengers(int value) {
		this.numPassengers.click();
		this.numPassengers.clear();
		this.numPassengers.sendKeys("" + value);
	}

// click radio 
	public void setSeatPref() {
		this.seatPref.click();
	}

	public void setSeatType() {
		this.seatPref.click();
	}

	// click checkbox
	public void setRoundtrip() {
		this.roundtrip.click();
	}

// click button
	public void clkbtnfindFlights() {
		this.btnfindFlights.click();
	}

	public void FindFlight(String depart, String departDate, String destination, String returnDate) {

		this.clkbtnbtnSearchFlights();

		this.setDepartSelector(2);
		this.setdepartDate(departDate);

		this.setArriveSelector(5);
		this.setretrnDate(returnDate);

		this.SetPassengers(1);

		this.setSeatPref();
		this.setRoundtrip();

		this.setSeatType();
		this.clkbtnfindFlights();
	}
}
