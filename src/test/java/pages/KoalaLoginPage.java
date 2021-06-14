package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaLoginPage {

public KoalaLoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(xpath = "//a[text()='Log in']")
public WebElement loginpage;
@FindBy(id = "UserName")
public WebElement username;
@FindBy(id = "Password")
    public WebElement password;
@FindBy(xpath = "//input[@id='btnSubmit']")
public WebElement login;
@FindBy(xpath = "//span[text()='Try again please']")
public WebElement kirmiziyazi;
@FindBy(xpath = "//span[text()='Hotel Management']")
public WebElement hotel;
@FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
public WebElement list;
@FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
public WebElement add;
@FindBy(xpath = "//input[@id='Code']")
public WebElement code;
@FindBy(xpath = "//button[text()='Save']")
public WebElement save;
@FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
public WebElement yazi;
@FindBy(xpath = "//button[text()='OK']")
public WebElement ok;
@FindBy(xpath = "(//i[@class='icon-calendar'])[3]")
public WebElement rooms;
@FindBy(xpath = "//span[text()='List Of Hotelrooms']")
public WebElement reservations;
}
