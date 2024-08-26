package tests.innovanceConsultancy;
import org.testng.annotations.Test;
import pages.InnovancePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class innovanceTest3{

    InnovancePage innovancePage =new InnovancePage();


    @Test
    public void innovanceTest3(){
        Driver.getDriver().get(ConfigReader.getProperty("innovanceUrl"));


        ReusableMethods.bekle(2);
        innovancePage.iAgree.click();
        innovancePage.service.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.works.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.blog.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.aboutUs.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.career.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        innovancePage.contact.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();


        ReusableMethods.innovanceFooter(innovancePage.privacyPolicy);
        ReusableMethods.innovanceFooter(innovancePage.termsOfUse);
        ReusableMethods.innovanceFooter(innovancePage.cookiePolicy);
        ReusableMethods.innovanceFooter(innovancePage.kvkk);
        ReusableMethods.innovanceFooter(innovancePage.informationSecurityPolicy);

        ReusableMethods.innovanceInstagramTikla();
        ReusableMethods.innovanceMethodInstagram();

        ReusableMethods.innovanceMediumTikla();
        ReusableMethods.innovanceMethodMedium();

        ReusableMethods.innovanceYoutubeTikla();
        ReusableMethods.innovanceMethodYoutube();

        ReusableMethods.innovanceTwitterTikla();
        ReusableMethods.innovanceMethodTwitter();

        ReusableMethods.bekle(2);


        Driver.getDriver().quit();



    }

}


