package StepDefinitions;

import Pages.n11Pages;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class n11StepDefinitions {
    n11Pages n11Pages=new n11Pages(DriverFactory.getDriver());

    @When("Kategorilere tıklanır")
    public void kategorilereTıklanır() {
        n11Pages.kategoriTıklama();
    }

    @When("elektronik tıklanır")
    public void elektronikTıklanır() {
        n11Pages.elektronikTıklama();
    }

    @When("Telefon aksesuarları seçilir")
    public void telefonAksesuarlarıSeçilir() {
        n11Pages.telefonVeAksesuarSeçimi();
    }

    @When("Cep Telefonu seçilir")
    public void cepTelefonuSeçilir() {
        n11Pages.cepTelefonuSeçimi();
    }

    @When("Marka seçilir")
    public void markaSeçilir() {
        n11Pages.markaSeçimi();
    }

    @When("Filtreleme tıklanır")
    public void filtrelemeTıklanır() {
        n11Pages.filtrelemeTıklama();
    }

    @When("Filtreleme yapılır")
    public void filtrelemeYapılır() {
        n11Pages.filtrelemeYapma();
    }

    @When("Sonuçlarıgöstere tıklanır")
    public void sonuçlarıgöstereTıklanır() {
        n11Pages.sonuçlariGösterTıkla();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        n11Pages.urunSepeteEkleme();
    }

    @When("Sepetime Gidilir")
    public void sepetimeGidilir() {
        n11Pages.sepetimeGit();
    }

    @Then("Sepete Ürünün geldiği kontrol edilir")
    public void sepeteÜrününGeldiğiKontrolEdilir() {
        n11Pages.sepeteÜrününGeldiğiDoğrulama();
    }
}


