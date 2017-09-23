package testBOAhome;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.*;


import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.*;


public class TestLogin extends CommonAPI {
    @Test(priority = 2, enabled = true)

    public void Signin(){ BOAHome boaHome=PageFactory.initElements(driver,BOAHome.class);}

    @Test(priority = 1, enabled = true)
    public void searchElements() {
        SearchElements searchElements = PageFactory.initElements(driver, SearchElements.class);
        //searchElements.lookElements();
    }

    @Test(priority = 3, enabled = true)
    public void testItems() {
        Searchinfo searchInfo = PageFactory.initElements(driver, Searchinfo.class);
    }

    @Test(priority = 4, enabled = true)
    public void testCredit() {
        TestcreditCard testcreditCard = PageFactory.initElements(driver, TestcreditCard.class);
    }

    @Test(priority = 5, enabled = true)
    public void testBanking() {
        TestBanking testBanking = PageFactory.initElements
                (driver, TestBanking.class);
    }

    @Test(priority = 6, enabled = true)
    public void testMoreproducts() {
        TestMoreProducts testMoreProducts = PageFactory.initElements
                (driver, TestMoreProducts.class);
    }


}

