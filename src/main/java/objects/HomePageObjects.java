package objects;

import java.awt.List;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects extends BasePage {
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement headc;
	
	@FindBy(xpath="//div[@class='top-pagination-content clearfix']/div[@class='product-count']")
	private WebElement prodc;
	
	@FindBy(xpath="(//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg'])[1]")
	private WebElement img;
	
	@FindBy(xpath="(//a[@class=\"button ajax_add_to_cart_button btn btn-default\"]/span)[1]")
	private WebElement addc;
	
	@FindBy(xpath="//span[@title='Close window']")
	private WebElement closec;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	private WebElement cart;
	
	@FindBy(xpath="//input[@class='cart_quantity_input form-control grey']")
	private WebElement qtyc;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomen(){
		return women;
	}
	public WebElement getDress(){
		return dress;
	}
	public WebElement getTshirt(){
		return tshirt;
	}
	public WebElement getHeadc() {
		return headc;
	}
	public WebElement getProdc() {
		return prodc;
	}
	public WebElement getImg() {
		return img;
	}
	public WebElement getAddc() {
		return addc;
	}
	public WebElement getClosec() {
		return closec;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getQtyc() {
		return qtyc;
	}
	
}

