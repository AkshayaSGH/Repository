package test;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import objects.BasePage;
import objects.DressPageObjects;
import objects.HomePageObjects;

	public class DressPageTest {
		DressPageObjects dp;
		HomePageObjects hp;
		BasePage bp;

	public DressPageTest() {
		dp = new DressPageObjects();
		hp= new HomePageObjects();
		bp = new BasePage();
	}
	int random = new Random().nextInt(50000);
	String email="cartest"+ random + "@gmail.com";
@Test
	public void verifyChk() 
	{
	hp.getDress().click();
	Assert.assertTrue(bp.elementFound(dp.getL()), "Element not found");
	Assert.assertTrue(bp.elementFound(dp.getM()), "Element not found");
	Assert.assertTrue(bp.elementFound(dp.getS()), "Element not found");
	}
@Test
	public void verifyProductd() {
	hp.getDress().click();
	bp.mouseHover(hp.getImg());
	dp.getIc().click();
	Assert.assertTrue(bp.elementFound(dp.getTweet()), "Fail");
	Assert.assertTrue(bp.elementFound(dp.getFb()), "Fail");
	Assert.assertTrue(bp.elementFound(dp.getProddes()), "Fail");
	}
@Test
	public void verifyNewsl() {	
	bp.setText(dp.getNewsl(),email);
	dp.getNbtn().click();
	Assert.assertTrue(bp.elementFound(dp.getSubm()), "Email not entered");
	}
@Test
	public void verifyMatchr() {
	//String s=dp.getTotImg().getText().toString(); //when it is declared as webElement instead of List<WebElement>
	hp.getWomen().click();
	int ls=dp.getTotImg().size();
	String b=Integer.toString(ls);
	String a=dp.getTotp().getText();
	Assert.assertTrue(a.contains(b), "Failed");
	}


}
