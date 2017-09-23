package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestMoreProducts extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    public static WebElement firstselect;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[8]")
    public static WebElement bankingmoreproduct;
    @FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/a")
    public static WebElement sitemappersonal;
    @FindBy(how = How.XPATH, using = ".//*[@id='personal-tab']/div[1]/ul[1]/li[4]/a")
    public static WebElement ancpersonalbasicinterestrate;
    @FindBy(how = How.XPATH, using = ".//*[@id='home_4020243~CF~en_US']")
    public static WebElement home4020243CFenUS;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_name_tb_icai_fnm_v_1']")
    public static WebElement textboxlabel;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_name_tb_icai_mnm_v_1']")
    public static WebElement zz_name_tb_icai_mnm_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_name_tb_icai_lnm_v_1']")
    public static WebElement zz_name_tb_icai_lnm_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_resi_tb_icai_add1_v_1']")
    public static WebElement zz_resi_tb_icai_add1_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_resi_tb_icai_add2_v_1']")
    public static WebElement zz_resi_tb_icai_add2_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_resi_tb_icai_city_v_1']")
    public static WebElement zz_resi_tb_icai_city_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_resi_dd_icai_state_v_1']")
    public static WebElement zz_resi_dd_icai_state_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_resi_tb_icai_zip_v_1']")
    public static WebElement zz_resi_tb_icai_zip_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_phone_tb_icai_ppn_v_1']")
    public static WebElement zz_phone_tb_icai_ppn_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_email_tb_icai_v_1']")
    public static WebElement zz_email_tb_icai_v_1;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_bi_uscitizen_yes_v_1-real']")
    public static WebElement zz_bi_uscitizen_yes_v_1real;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_bi_dual_citizenship_no_v_1-real']")
    public static WebElement zz_bi_dual_citizenship_no_v_1real;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_ci_citizenship_lb_country_of_residence_v_1-box']")
    public static WebElement zz_ci_citizenship_lb_country_of_residence_v_1box;
    @FindBy(how = How.XPATH, using = ".//*[@id='zz_ssndob_tb_icai_dateOfBirth_v_1']")
    public static WebElement zz_ssndob_tb_icai_dateOfBirth_v_1;

    public void testMoreproducts(String Firstname) {
        firstselect.click();
        bankingmoreproduct.click();
        sitemappersonal.click();
        ancpersonalbasicinterestrate.click();
        home4020243CFenUS.click();
        textboxlabel.sendKeys("Nazmun");
        zz_name_tb_icai_mnm_v_1.sendKeys("Nahar");
        zz_name_tb_icai_lnm_v_1.sendKeys("Alam");
        zz_resi_tb_icai_add1_v_1.sendKeys("VernonHills");
        zz_resi_tb_icai_add2_v_1.sendKeys("jamaica");
        zz_resi_tb_icai_city_v_1.sendKeys("Chicago");
        zz_resi_dd_icai_state_v_1.sendKeys("USA");
        zz_resi_tb_icai_zip_v_1.sendKeys("60061");
        zz_phone_tb_icai_ppn_v_1.sendKeys("347-475-8318");
        zz_email_tb_icai_v_1.sendKeys("iamdolon@yahoo.com");
        zz_bi_uscitizen_yes_v_1real.click();
        zz_bi_dual_citizenship_no_v_1real.click();
        zz_ci_citizenship_lb_country_of_residence_v_1box.sendKeys("USA");
        zz_ssndob_tb_icai_dateOfBirth_v_1.sendKeys("May1st");
    }

}
