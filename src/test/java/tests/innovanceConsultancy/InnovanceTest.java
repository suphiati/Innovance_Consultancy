package tests.innovanceConsultancy;


import org.testng.annotations.Test;
import pages.InnovancePage;
import utilities.Driver;
import utilities.ReusableMethods;



public class InnovanceTest {

    InnovancePage innovancePage =new InnovancePage();

    
    @Test
    public void innovanceTest(){
        Driver.getDriver().get("https://innovance.com.tr/");



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


        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.privacyPolicy);
        innovancePage.privacyPolicy.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        innovancePage.arrowUp.click();

        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.termsOfUse);
        innovancePage.termsOfUse.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        innovancePage.arrowUp.click();

        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.cookiePolicy);
        innovancePage.cookiePolicy.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        //ReusableMethods.bekle(1);
        //innovancePage.arrowUp.click();

        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.kvkk);
        innovancePage.kvkk.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        //ReusableMethods.bekle(1);
       // innovancePage.arrowUp.click();

        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.informationSecurityPolicy.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        //ReusableMethods.bekle(1);
        //innovancePage.arrowUp.click();



        ReusableMethods.bekle(1);
        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.twitter.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);
        Driver.switchPage();

        /*Driver.yeniPencereHandle();
        ReusableMethods.bekle(2);
        String expectedTwitterUrl="twitter";
        String actualTwitterUrl=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualTwitterUrl.contains(expectedTwitterUrl));

        ReusableMethods.bekle(2);

        Driver.switchPage();

        */

        ReusableMethods.bekle(3);
        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.instagram.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);

        ReusableMethods.yeniSayfaDeneme("https://innovance.com.tr/","instagram");
        /*ReusableMethods.yeniSayfa();
        //Driver.yeniPencereHandle();
        ReusableMethods.bekle(2);
        //innovancePage.instagramX.click();
        String expectedInstagramUrl="instagram";
        String actualInstagramUrl=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualInstagramUrl.contains(expectedInstagramUrl));


        Driver.switchPage();

         */
        ReusableMethods.bekle(2);

        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.medium.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);

        ReusableMethods.yeniSayfaDeneme("https://innovance.com.tr/","medium");
/*
        ReusableMethods.yeniSayfa();
        //Driver.yeniPencereHandle();
        ReusableMethods.bekle(2);
        String expectedMediumUrl="medium";
        String actualMediumUrl=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualMediumUrl.contains(expectedMediumUrl));


        Driver.switchPage();

        */
        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.youtube.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);

        ReusableMethods.yeniSayfaDeneme("https://innovance.com.tr/","youtube");
        /*Driver.yeniPencereHandle();
        ReusableMethods.bekle(2);
        String expectedYoutubeUrl="youtube";
        String actualYoutubeUrl=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualYoutubeUrl.contains(expectedYoutubeUrl));

        ReusableMethods.bekle(2);

        Driver.switchPage();


         */


        ReusableMethods.bekle(3);

        Driver.getDriver().quit();



    }
}
