package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.stream.Location;
import javax.xml.ws.WebEndpoint;

public class BOAHome extends CommonAPI {

// test branch

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-1']/div[1]/div[1]/ul/li[3]/a")
    public static WebElement onlineId1;
    @FindBy(how = How.XPATH, using = ".//*[@id='passcode1']")
    public static WebElement passcode1;
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-sign-in-btn']")
    public static WebElement hpsigninbtn;

    public void Signin() {
	int i =0;
        onlineId1.sendKeys("iamdolon");
        passcode1.sendKeys("Dolon1");
        hpsigninbtn.click();
    }

}
