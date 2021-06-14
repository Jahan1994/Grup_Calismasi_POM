package smoketest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeTest1 {
/* 1) smokeTest paketi altinda yeni bir Class olustur: NegativeTest
3 Farkli test Methodunda 3 senaryoyu test et
- yanlisSifre
- yanlisKulllanici
- yanlisSifreKullanici
test data dogru username: manager , dogru password : Manager2!
2) http://qa-environment.koalaresorthotels.com adresine git
3) Login butonuna bas
4) Verilen senaryolar ile giris yapilamadigini test et*/
    @Test
    public void negativeTestYalis (){
        //- yanlisSifre
        Driver.getDriver().get(ConfigReader.getproperty("kr_url"));
        KoalaLoginPage koalaLoginPage=new KoalaLoginPage();
        koalaLoginPage.loginpage.click();
        koalaLoginPage.username.sendKeys(ConfigReader.getproperty("kr_valid_username"));
        koalaLoginPage.password.sendKeys(ConfigReader.getproperty("kr_wrong_password"));
        koalaLoginPage.login.click();
        Assert.assertFalse(!koalaLoginPage.kirmiziyazi.isDisplayed());

    }
    @Test
    public void negativeTestYalnisKullanici(){
        //- yanlisKulllanici
        Driver.getDriver().get(ConfigReader.getproperty("kr_url"));
        KoalaLoginPage koalaLoginPage=new KoalaLoginPage();
        koalaLoginPage.loginpage.click();
        koalaLoginPage.username.sendKeys(ConfigReader.getproperty("kr_wrong_username"));
        koalaLoginPage.password.sendKeys(ConfigReader.getproperty("kr_valid_password"));
        koalaLoginPage.login.click();
        Assert.assertFalse(!koalaLoginPage.kirmiziyazi.isDisplayed());

    }
    @Test
    public void negativeTestYalnisSifreKullancini(){
        //- yanlisSifreKullanici
        Driver.getDriver().get(ConfigReader.getproperty("kr_url"));
        KoalaLoginPage koalaLoginPage=new KoalaLoginPage();
        koalaLoginPage.loginpage.click();
        koalaLoginPage.username.sendKeys(ConfigReader.getproperty("kr_wrong_username"));
        koalaLoginPage.password.sendKeys(ConfigReader.getproperty("kr_wrong_password"));
        koalaLoginPage.login.click();
//        Assert.assertFalse(!koalaLoginPage.kirmiziyazi.isDisplayed());


    }
}
