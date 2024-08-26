package tests.innovanceConsultancy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.InnovancePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.InnovanceMethods;


public class innovanceTest4  {
    InnovancePage innovancePage =new InnovancePage();
    @Test
    public void innovanceTest4(){
        Driver.getDriver().get(ConfigReader.getProperty("innovanceUrl"));


        InnovanceMethods.bekle(2);
        innovancePage.iAgree.click();
        innovancePage.service.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.works.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.blog.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.aboutUs.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.career.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.contact.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();


        InnovanceMethods.innovanceFooter(innovancePage.privacyPolicy);
        InnovanceMethods.innovanceFooter(innovancePage.termsOfUse);
        InnovanceMethods.innovanceFooter(innovancePage.cookiePolicy);
        InnovanceMethods.innovanceFooter(innovancePage.kvkk);
        InnovanceMethods.innovanceFooter(innovancePage.informationSecurityPolicy);

        InnovanceMethods.innovanceInstagramTikla();
        InnovanceMethods.innovanceMethodInstagram();

        InnovanceMethods.innovanceMediumTikla();
        InnovanceMethods.innovanceMethodMedium();

        InnovanceMethods.innovanceYoutubeTikla();
        InnovanceMethods.innovanceMethodYoutube();

        InnovanceMethods.innovanceTwitterTikla();
        InnovanceMethods.innovanceMethodTwitter();





        Driver.getDriver().quit();



    }




}
