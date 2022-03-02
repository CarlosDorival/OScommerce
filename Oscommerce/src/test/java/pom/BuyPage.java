package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyPage extends Base {

	By opcionGadget = By.xpath("//*[@id=\"columnLeft\"]/div[1]/div[2]/a[4]");//opcion gadget
	
	By opcionHarware = By.xpath("//*[@id=\"columnLeft\"]/div[1]/div[2]/a[1]");//*[@id="columnLeft"]/div[1]/div[2]/a[1]
	By seleccionarMouse = By.xpath("//*[@id=\"bodyContent\"]/div/div/div/table/tbody/tr[1]/td[1]/a[2]");
	By btnAddToCart = By.id("tdb4");
	
	By btnBuyNow = By.id("tdb4");//boton buyPage now
	By inputUpdate = By.name("cart_quantity[]");//cantidad de dispositvos de compra
	By btnUpdate = By.id("tdb4");//boton Update
	By btnCheckout = By.id("tdb5");//boton chekout
	By inputEmail = By.name("email_address");//ingresar el mail
	By inputPassword = By.name("password");//ingresar el password
	By btnLogin = By.id("tdb1");//boton login
	By btnContinue01 = By.id("tdb6");//boton de pantlla de informacion
	By selectorPayMethod = By.xpath("//*[@id=\"bodyContent\"]/form/div/div[4]/table[1]/tbody/tr/td[2]/input");//boton seleccionar metodo de pago presencial
	By btnContinue02 = By.id("tdb6");//segundo boton de continuar de metodo de pago
	By btnContinue03 = By.id("tdb5");// boton confirmar orden
	By 	assertText = By.xpath("//*[@id=\"bodyContent\"]/h1");//assert de comparacion
	
	public BuyPage(WebDriver driver) {
		super(driver);	
	}
	
	public void buySeleccionarProducto() {
		click(opcionGadget);
		click(btnBuyNow);
		findElement(inputUpdate).clear();
		type("2", inputUpdate);
		click(btnUpdate);
		click(btnCheckout);
	}

	public void buySeleccionarProducto02() {
		click(opcionHarware);
		click(seleccionarMouse);
		click(btnAddToCart);
		click(btnCheckout);
	}
	
	
	public void buyLoginUser() {
		type("carlos.cd.16@gmail.com", inputEmail);
		type("Qwerty01", inputPassword);
		click(btnLogin);
	}
	
	public void buyDeliveryInfrmation() {
		click(btnContinue01);
	}
	
	public void buyMethodPay() {
		click(selectorPayMethod);
		click(btnContinue02);
		click(btnContinue03);
		
	}
	
	public void buyconvertirString() {
		//String pruebastring = assertText.toString();
		
	}
	
	
	public String buyUserMenssage() {
		return "";
		
	}
	
	
}
