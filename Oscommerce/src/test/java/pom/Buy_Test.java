package pom;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buy_Test {
	private WebDriver driver;
	BuyPage buyPage;
	
	
	@Before
	public void setUp() throws Exception {
		buyPage = new BuyPage(driver);
		driver = buyPage.chromeDriverConnection();
		buyPage.visit("http://sqademosatp.net/catalog/");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
	@Test
	public void test() {
		buyPage.buySeleccionarProducto();
		buyPage.buyLoginUser();
		buyPage.buyDeliveryInfrmation();
		buyPage.buyMethodPay();
		
		String pruebastring = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/h1")).getText().toString();
		assertEquals("Your Order Has Been Processed!", pruebastring);
	}
	
	

}
