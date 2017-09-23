package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestcreditCard extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[2]/a")
    public static WebElement select;
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[2]/div/div[1]/a[4]")
    public static WebElement lowerinterestratecards;

    public void testCredit(String creditcard, String lowerrate) {
        select.click();
        lowerinterestratecards.click();
    }
}
