package tests.innovanceConsultancy;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.InnovancePage;
import utilities.Driver;
import utilities.ReusableMethods;



public class innovanceTest2 {

    InnovancePage innovancePage =new InnovancePage();


    @Test
    public void innovanceTest2(){
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

        ReusableMethods.privacyPolicy(innovancePage.privacyPolicy);
/*
        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.privacyPolicy);
        innovancePage.privacyPolicy.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        innovancePage.arrowUp.click();
        */

        ReusableMethods.termsOfUse(innovancePage.termsOfUse);

        /*
        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.termsOfUse);
        innovancePage.termsOfUse.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        innovancePage.arrowUp.click();

         */

        ReusableMethods.cookiePolicy(innovancePage.cookiePolicy);

        /*
        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.cookiePolicy);
        innovancePage.cookiePolicy.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

         */

        ReusableMethods.kvkk(innovancePage.kvkk);

       /* ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.kvkk);
        innovancePage.kvkk.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        */
        ReusableMethods.informationSecurityPolicy(innovancePage.informationSecurityPolicy);

        /*
        ReusableMethods.bekle(2);
        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.informationSecurityPolicy.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        */



        /*ReusableMethods.bekle(3);
        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.instagram.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);

         */
        ReusableMethods.innovanceInstagramTikla();
        ReusableMethods.innovanceMethodInstagram();
        //ReusableMethods.yeniSayfaDeneme("https://innovance.com.tr/","instagram");

        //ReusableMethods.bekle(2);

      /*  ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.medium.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);
        */

        ReusableMethods.innovanceMediumTikla();
        ReusableMethods.innovanceMethodMedium();
       // ReusableMethods.yeniSayfaDeneme("https://innovance.com.tr/","medium");
        //ReusableMethods.bekle(2);


        /*ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.youtube.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);
         */
        ReusableMethods.innovanceYoutubeTikla();
        ReusableMethods.innovanceMethodYoutube();
        //ReusableMethods.yeniSayfaDeneme("https://innovance.com.tr/","youtube");


       /* ReusableMethods.bekle(1);
        ReusableMethods.hover(innovancePage.informationSecurityPolicy);
        innovancePage.twitter.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.bekle(2);
        */

        ReusableMethods.innovanceTwitterTikla();
        ReusableMethods.innovanceMethodTwitter();

        ReusableMethods.bekle(2);


        Driver.getDriver().quit();



    }

}
