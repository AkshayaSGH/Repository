package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objects.BasePage;
import objects.HomePageObjects;

public class HomePageTest {
HomePageObjects homepage;
BasePage bp;

public HomePageTest()
{
	homepage = new HomePageObjects();
	bp = new BasePage();
}
@Test
public void verifyTab() {
Assert.assertTrue(bp.elementFound(homepage.getWomen()), "ENF");
Assert.assertTrue(bp.elementFound(homepage.getDress()), "Element not found");
Assert.assertTrue(bp.elementFound(homepage.getTshirt()), "Element not found");
}

@Test
public void verifyUrl() {
homepage.getDress().click();
Assert.assertTrue(bp.getTitlte().contains("Dresses"), "Not navigated");
}

@AfterTest
public void verifyAddToC() {
bp.mouseHover(homepage.getImg());
homepage.getAddc().click();
homepage.getClosec().click();
homepage.getCart().click();
Assert.assertTrue(bp.getTxtAttribute(homepage.getQtyc()).contains("1"), "Not added to cart");
}
} 