package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectFlightpg {

	public WebDriver driver;
	Select objSelect;

	public SelectFlightpg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='002;0;12/09/2021']")
	@CacheLookup
	private WebElement SelectDepartFlight;

	@FindBy(how = How.XPATH, using = "//input[@value='003;0;12/10/2021']")
	@CacheLookup
	private WebElement SelectDestinaionFlight;

	@FindBy(how = How.NAME, using = "reserveFlights")
	@CacheLookup
	private WebElement btnReserveFlights;

//click radiobox

	public void setSelectDepartFlight() {
		this.SelectDepartFlight.click();
	}

	public void setSelectDestinaionFlight() {
		this.SelectDestinaionFlight.click();
	}
// click button
	public void clkbtnReserveFlights() {
		this.btnReserveFlights.click();
	}

	public void SelectFlight() {

		this.setSelectDepartFlight();

		this.setSelectDestinaionFlight();

		this.clkbtnReserveFlights();
	}
}
