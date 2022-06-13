package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Invoicepg {

	public WebDriver driver;
	Select objSelect;

	public Invoicepg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "Book Another")
	@CacheLookup
	private WebElement btnBookAnother;

//set>

//click button
	public void clkbtnBookAnother() {
		this.btnBookAnother.click();
	}

	public void Invoice() {

		this.clkbtnBookAnother();
	}
}
