package testcase;

import org.testng.annotations.Test;
import pageFactory.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Runner {
	private WebDriver driver;

	Opener objopen;
	Register objReg;
	Login objLogin;
	FindFlightpg objFindFlightpg;
	SelectFlightpg objSelectFlightpg;
	PaymentDetailspg objPaymentDetailspg;
	Invoicepg objInvoicepg;

	@BeforeTest
	public void setUp() {
//		System.out.println(System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

	@Test
	public void test() {

		objopen = new Opener(driver);
		objopen.urlOpen("http://localhost:8080/Tour");

		objReg = new Register(driver);
		objReg.newUser("Uname", "pwd123", "FName", "LName", "Address123", "122345");

		objLogin = new Login(driver);
		objLogin.log_in("Uname", "pwd123");

		objFindFlightpg = new FindFlightpg(driver);
		objFindFlightpg.FindFlight("London", "12//15//2021", "Paris", "12//16//2021");

		objSelectFlightpg = new SelectFlightpg(driver);
		objSelectFlightpg.SelectFlight();

		objPaymentDetailspg = new PaymentDetailspg(driver);
		objPaymentDetailspg.PaymentDetails("F. name", "Lname", "H. No 45, address", "NY 10017", "411111111111", "741");

		objInvoicepg = new Invoicepg(driver);
		objInvoicepg.Invoice();
	}
}
