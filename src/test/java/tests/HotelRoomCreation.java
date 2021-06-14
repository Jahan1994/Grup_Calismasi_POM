package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelRoomCreation {
    /*1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
2. Bir metod olusturun: RoomCreateTest()
3. http://qa-environment.koalaresorthotels.com adresine gidin.
4. Username textbox ve password metin kutularını locate edin ve aşağıdaki
verileri girin.
a. Username : manager b. Password : Manager2!
5. Login butonuna tıklayın.
6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
8. Save butonuna basin.
9. "HotelRoom was inserted successfully" textinin göründüğünü test edin.
10. OK butonuna tıklayın.
11. Hotel rooms linkine tıklayın.
12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..*/


    @Test
    public void  RoomCreateTest() throws InterruptedException {
      //3. http://qa-environment.koalaresorthotels.com adresine gidin.
        Driver.getDriver().get(ConfigReader.getproperty("kr_url"));
        //5. Login butonuna tıklayın.
        KoalaLoginPage koalaLoginPage=new KoalaLoginPage();
        koalaLoginPage.loginpage.click();
        koalaLoginPage.username.sendKeys(ConfigReader.getproperty("kr_valid_username"));
        koalaLoginPage.password.sendKeys(ConfigReader.getproperty("kr_valid_password"));
        koalaLoginPage.login.click();
        //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
koalaLoginPage.hotel.click();
        koalaLoginPage.list.click();
        koalaLoginPage.add.click();

//7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
   koalaLoginPage.code.sendKeys(ConfigReader.getproperty("code")+ Keys.TAB+
           ConfigReader.getproperty("name")+Keys.TAB+ConfigReader.getproperty("adress")+
           Keys.TAB+ConfigReader.getproperty("phone")+Keys.TAB+ConfigReader.getproperty("email")+
           Keys.TAB+ConfigReader.getproperty("id"));
   //8. Save butonuna basin.
        Thread.sleep(2000);
   koalaLoginPage.save.click();
   //9. "HotelRoom was inserted successfully" textinin göründüğünü test edin.
        Thread.sleep(2000);
        Assert.assertEquals(koalaLoginPage.yazi.getText(),ConfigReader.getproperty("yazi"));
        //10. OK butonuna tıklayın.
        koalaLoginPage.ok.click();
        //11. Hotel rooms linkine tıklayın.
koalaLoginPage.rooms.click();
//12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
Assert.assertEquals(koalaLoginPage.reservations.getText(),ConfigReader.getproperty("baslik_reserv"));
Driver.closeDriver();





    }
}
