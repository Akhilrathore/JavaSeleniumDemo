package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Opener {

	public WebDriver driver;

	public Opener(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//open url
	public void getOpen(String url) {
		driver.get(url);

	}

	public void urlOpen(String url) {
		this.getOpen(url);
	}
}
