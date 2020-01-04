package objects;

import org.openqa.selenium.WebElement;
import java.awt.List;
import java.sql.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.collections.Lists;

public class DressPageObjects extends BasePage {
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
	private WebElement s;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
	private WebElement m;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
	private WebElement l;
	
	@FindBy(xpath= "//input[@id='newsletter-input']")
	private WebElement newsl;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement nbtn;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement subm;
	
	@FindBy(xpath="(//a[@title='View']/span)[1]")
	private WebElement ic;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-facebook']")
	private WebElement fb;
	
	@FindBy(xpath="//div[@id='oosHook']")
	private WebElement tweet;
	
	@FindBy(xpath="//div[@id='short_description_content']")
	private WebElement proddes;
	
	//@FindBy(xpath="//a[@class='product_img_link']")
	//private WebElement totimg;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement totp;
	
	@FindBys(@FindBy(xpath="//a[@class='product_img_link']"))
	private java.util.List<WebElement> totimg;
	
    public DressPageObjects() {
		PageFactory.initElements(driver,this);
	}

	public WebElement getS(){
		return s;
	}
	public WebElement getM(){
		return m;
	}
	public WebElement getL(){
		return l;
	}
	public WebElement getNewsl()
	{
		return newsl;
	}
	public WebElement getNbtn() {
		return nbtn;
	}
	public WebElement getSubm(){
		return subm;
	}
	public java.util.List<WebElement> getTotImg() {
		return totimg;
	}
	public WebElement getTotp() {
		return totp;
	}
	public WebElement getIc() {
		return ic;
	}
	public WebElement getFb() {
		return fb;
	}
	public WebElement getTweet() {
		return tweet;
	}
	public WebElement getProddes() {
		return proddes;
	}
}

