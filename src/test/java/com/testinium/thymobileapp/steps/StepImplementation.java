package com.testinium.thymobileapp.steps;

import com.thoughtworks.gauge.*;
import com.testinium.thymobileapp.constants.Constants;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


public class StepImplementation extends HookImp {

    @Step({"Gelen izinleri kabul et"})
        public void konumIzniKabulu(){
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById(Constants.IZIN_VER);
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver
                .findElementById(Constants.CEREZLER);
        el2.click();

    }
    @Step({"Bilet al butonuna tıklanır"})
    public void biletAlButonu(){
        MobileElement el3 = (MobileElement) appiumDriver
                .findElementById(Constants.BILET_AL);
        el3.click();
    }
    @Step({"Tek yön uçuş seçilir"})
    public void yonSecme(){
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById(Constants.TEK_YON);
        el1.click();

    }
    @Step({"Güzergah SAW to ESB olarak girilir"})
    public void guzergahBelirleme(){
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById(Constants.KALKIS);
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver
                .findElementById(Constants.ARAMA_KUTUSU);
        el2.sendKeys("SAW");
        MobileElement el3 = (MobileElement) appiumDriver
                .findElementById(Constants.HAVAALANI);
        el3.click();
        MobileElement el4 = (MobileElement) appiumDriver
                .findElementById(Constants.INIS);
        el4.click();
        MobileElement el5 = (MobileElement) appiumDriver
                .findElementById(Constants.ARAMA_KUTUSU2);
        el5.sendKeys("ESB");
        MobileElement el6 = (MobileElement) appiumDriver
                .findElementByXPath(Constants.HAVAALANI2);
        el6.click();
    }
    @Step({"Tarih 2 gün sonrasına seçilir"})
    public void tarihSecimi(){
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById(Constants.TARIH);
        String today=el1.getText();
        int day=Integer.parseInt(today);
        int wantedDay= day+2;
        String wantedDay2=String.valueOf(wantedDay);
        el1.click();
        MobileElement el2;
        el2 = (MobileElement) appiumDriver
                .findElement(By.xpath(String.format("//android.widget.FrameLayout/android.widget.TextView[(@text='%s')]"+wantedDay2)));
        el2.click();
        MobileElement el3 = (MobileElement) appiumDriver
                .findElementById(Constants.TARIH_TAMAM);
        el3.click();
    }
    @Step({"Yolcu sayısı seçilir"})
    public void yolcuSayisi(){
        MobileElement el1= (MobileElement) appiumDriver
                .findElement(By.id(Constants.YOLCU_SAYISI));
        el1.click();
    }
    @Step({"Uçuş Ara butonuna tıklanır"})
    public void ucusAra(){
        MobileElement el1 = (MobileElement) appiumDriver
                .findElementById(Constants.UCUS_ARA);
        el1.click();
    }
    @Step({"Ekonomik uçuş seçilir"})
    public void ekonomik(){
        MobileElement el1= (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/itemFlightSearchParent_tvPrice");
        el1.click();
        MobileElement el2= (MobileElement) appiumDriver
                .findElementById("com.turkishairlines.mobile:id/brandItem");
        el2.click();

    }
    @Step({"Devam butonuna tıklanır"})
    public void devamButonu(){
        MobileElement el3 = (MobileElement) appiumDriver
            .findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        el3.click();

    }


   }
