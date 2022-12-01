package Pages;

import Util.ElementHelper;
import io.appium.java_client.*;
import io.appium.java_client.remote.MobileBrowserType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By kategorilerButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By filtrele= MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By dahiliHafiza = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By GB = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
    By uygulaButonu = MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"com.dmall.mfandroid:id/applyBtn\")");
    By modelButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\")");
    By ıphone13 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Iphone 13\")");
    By renk = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By mavi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mavi\")");
    By sonuclarıGöster = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By GB128 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
    By sepeteEkle= MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sepetim = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By sepetKontrol = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayoutRoot\")");
    public n11Pages(AppiumDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        this.elementHelper=new ElementHelper(driver);
    }


    public void kategoriTıklama() {
        driver.findElement(kategorilerButonu).click();
    }

    public void elektronikTıklama() {
        List<WebElement>elementsList=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        elementsList.get(1).click();
    }

    public void telefonVeAksesuarSeçimi() {
        List<WebElement>elementsList=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        elementsList.get(0).click();
    }

    public void cepTelefonuSeçimi() {
        List<WebElement>elementsList=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        elementsList.get(0).click();
    }


    public void markaSeçimi() {
        List<WebElement>elementsList=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/listingSuggestionItemNameTV\")"));
        elementsList.get(2).click();
    }

    public void filtrelemeTıklama() {
        driver.findElement(filtrele).click();

    }

    public void filtrelemeYapma() {
        driver.findElement(dahiliHafiza).click();
        driver.findElement(GB).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(modelButonu).click();
        driver.findElement(ıphone13).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Renk\"))"));
        driver.findElement(renk).click();
        driver.findElement(mavi).click();
        driver.findElement(uygulaButonu).click();
    }

    public void sonuçlariGösterTıkla() {
        driver.findElement(sonuclarıGöster).click();

    }

    public void urunSepeteEkleme() {
        List<WebElement>artiButonu=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")"));
        artiButonu.get(0).click();
        driver.findElement(GB128).click();
        driver.findElement(mavi).click();
        driver.findElement(sepeteEkle).click();
    }

    public void sepetimeGit() {
        driver.findElement(sepetim).click();
    }

    public void sepeteÜrününGeldiğiDoğrulama() {
        ElementHelper helper=new ElementHelper(driver);
        helper.checkVisible(sepetKontrol);

    }
}
