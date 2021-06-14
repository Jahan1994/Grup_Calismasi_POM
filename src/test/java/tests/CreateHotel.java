package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CreateHotel {
    /* 1. Tests packagenin altına class olusturun: D17_CreateHotel
2. Bir metod olusturun: createHotel
3. http://qa-environment.koalaresorthotels.com adresine git.
4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
girin.
a. Username : manager
b. Password : Manager1!
5. Login butonuna tıklayın.
6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
8. Save butonuna tıklayın.
9. "Hotel was inserted successfully" textinin göründüğünü test edin.
10. OK butonuna tıklayın.
*/

    @Test
    public void createHotel() throws InterruptedException {
        //3. http://qa-environment.koalaresorthotels.com adresine git.
        Driver.getDriver().get(ConfigReader.getproperty("kr_url"));
        KoalaLoginPage koalaLoginPage=new KoalaLoginPage();
        //5. Login butonuna tıklayın.
        koalaLoginPage.loginpage.click();
        koalaLoginPage.username.sendKeys(ConfigReader.getproperty("kr_valid_username"));
        koalaLoginPage.password.sendKeys(ConfigReader.getproperty("kr_valid_password"));
        koalaLoginPage.login.click();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
koalaLoginPage.hotel.click();
koalaLoginPage.list.click();
koalaLoginPage.add.click();
//7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin
koalaLoginPage.code.sendKeys(ConfigReader.getproperty("code")+ Keys.TAB
        +ConfigReader.getproperty("name")+Keys.TAB+ConfigReader.getproperty("adress")+
        Keys.TAB+ConfigReader.getproperty("phone")+Keys.TAB+ConfigReader.getproperty("email")+
        Keys.TAB+ConfigReader.getproperty("id"));
Thread.sleep(2000);
//8. Save butonuna tıklayın.
koalaLoginPage.save.click();
//9. "Hotel was inserted successfully" textinin göründüğünü test edin.
        Thread.sleep(2000);
        Assert.assertEquals(koalaLoginPage.yazi.getText(),ConfigReader.getproperty("yazi"));
koalaLoginPage.ok.click();
Driver.closeDriver();

    }
}
