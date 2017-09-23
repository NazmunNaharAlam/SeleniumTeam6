package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchElements extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='locatorLink']")
    public static WebElement locatorLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-1']/div[2]/div[2]/ul/li[2]")
    public static WebElement headercontactus;
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    public static WebElement pmsubmenufirst;

    public void searchElements() {
        locatorLink.click();
        headercontactus.click();
        pmsubmenufirst.click();
    }
}

