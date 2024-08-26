package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class InnovancePage {

    public InnovancePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='I AGREE']")
    public WebElement iAgree;
    @FindBy(xpath = "(//a[text()='Services'])[1]")
    public WebElement service;

    @FindBy(xpath = "(//a[text()='Works'])[1]")
    public WebElement works;

    @FindBy(xpath = "(//a[text()='About Us'])[1]")
    public WebElement aboutUs;

    @FindBy(xpath = "(//a[text()='Blog'])[1]")
    public WebElement blog;

    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contact;

    @FindBy(xpath = "//a[@class='header-contain-menu-button']")
    public WebElement career;

    @FindBy(xpath = "//a[text()='Privacy Policy']")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//a[text()='Terms of Use']")
    public WebElement termsOfUse;

    @FindBy(xpath = "(//a[text()='Cookie Policy'])[1]")
    public WebElement cookiePolicy;

    @FindBy(xpath = "//a[text()='KVKK']")
    public WebElement kvkk;

    @FindBy(xpath = "//a[text()='Information Security Policy']")
    public WebElement informationSecurityPolicy;

    @FindBy(xpath = "//*[@fill='#1E174E']")
    public WebElement arrowUp;

    @FindBy(xpath = "//*[text()='Our Channels']")
    public WebElement ourChannels;
    @FindBy(xpath = "(//li/a[@target='_blank'])[1]")
    public WebElement linkedIn;



    @FindBy(xpath = "(//li/a[@target='_blank'])[2]")
    public WebElement medium;

    @FindBy(xpath = "(//li/a[@target='_blank'])[3]")
    public WebElement youtube;

    @FindBy(xpath = "(//li/a[@target='_blank'])[4]")
    public WebElement twitter;

    @FindBy(xpath = "(//li/a[@target='_blank'])[5]")
    public WebElement instagram;


    @FindBy(xpath = "(//*[@fill='none'])[16]")
    public WebElement instagramX;




}
