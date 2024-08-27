package tests.innovanceConsultancy;

import org.testng.annotations.Test;
import pages.InnovancePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.InnovanceMethods;
import utilities.TestBaseRapor;

public class innovanceTestSon extends TestBaseRapor{


    InnovancePage innovancePage =new InnovancePage();
    @Test
    public void innovanceConsultancyTest(){
        extentTest=extentReports.createTest("innovance Consultancy Testi","innovance ana sayfasi test edilir");

        Driver.getDriver().get(ConfigReader.getProperty("innovanceUrl"));
        extentTest.info("innovance sitesine gidilir");

        InnovanceMethods.bekle(2);
        innovancePage.iAgree.click();
        innovancePage.service.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();
        extentTest.pass("Service sayfasina gider ve ana sayfaya geri döner");

        innovancePage.works.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();
        extentTest.pass("Works sayfasina gider ve ana sayfaya geri döner");

        innovancePage.blog.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();
        extentTest.info("Blog sayfasina gider ve ana sayfaya geri döner");

        innovancePage.aboutUs.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();
        extentTest.info("About Us sayfasina gider ve ana sayfaya geri döner");

        innovancePage.career.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();
        extentTest.info("Career sayfasina gider ve ana sayfaya geri döner");

        innovancePage.contact.click();
        InnovanceMethods.bekle(2);
        Driver.getDriver().navigate().back();
        extentTest.info("Contact sayfasina gider ve ana sayfaya geri döner");


        InnovanceMethods.innovanceFooter(innovancePage.privacyPolicy);
        extentTest.pass("Privacy Policy sayfasina gider ve ana sayfaya geri döner");
        InnovanceMethods.innovanceFooter(innovancePage.termsOfUse);
        extentTest.pass("Terms Of Use sayfasina gider ve ana sayfaya geri döner");
        InnovanceMethods.innovanceFooter(innovancePage.cookiePolicy);
        extentTest.pass("Cookie sayfasina gider ve ana sayfaya geri döner");
        InnovanceMethods.innovanceFooter(innovancePage.kvkk);
        extentTest.pass("KVKK sayfasina gider ve ana sayfaya geri döner");
        InnovanceMethods.innovanceFooter(innovancePage.informationSecurityPolicy);
        extentTest.pass("Information Security Policy sayfasina gider ve ana sayfaya geri döner");

        InnovanceMethods.innovanceInstagramTikla();
        InnovanceMethods.innovanceMethodInstagram();
        extentTest.pass("Instagram linkine tiklanirr ve instagram sitesine gidildigi dogrulanir");

        InnovanceMethods.innovanceMediumTikla();
        InnovanceMethods.innovanceMethodMedium();
        extentTest.pass("Medium linkine tiklanirr ve medium sitesine gidildigi dogrulanir");


        InnovanceMethods.innovanceYoutubeTikla();
        InnovanceMethods.innovanceMethodYoutube();
        extentTest.pass("Youtube linkine tiklanirr ve youtube sitesine gidildigi dogrulanir");


        InnovanceMethods.innovanceTwitterTikla();
        InnovanceMethods.innovanceMethodTwitter();
        extentTest.pass("Twitter linkine tiklanir fakat x.com sitesine gidildigi dogrulanir");


        Driver.getDriver().quit();
        extentTest.info("driver kapatilir");


    }




}
