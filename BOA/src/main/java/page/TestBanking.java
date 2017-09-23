package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestBanking extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    public static WebElement firstselect;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[1]")
    public static WebElement checking;
    @FindBy(how = How.XPATH, using = ".//*[@id='zipSelectModalSpartaUILayer']")
    public static WebElement zipCodeModalInputField;

    public void testBanking(String banking, String checkings, String zip) {
        firstselect.click();
        checking.click();
        zipCodeModalInputField.sendKeys("11432");
    }
}
