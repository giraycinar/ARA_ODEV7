package com.giray.entity;

import com.giray.enums.HayvanTuru;

import java.util.Random;
import java.util.UUID;

public class Hayvan {
    String id;
    String ad;
    int yas;
    String cins;
    Boolean etcil;
    Boolean otcul;
    int bacakSayisi;
    double boy;
    double agirlik;
    HayvanTuru hayvan; //HayvanTuru enum dan çekeceðiz.
    String yasamAlani;
    Konum konum; //konumun bulunabilmesi için (ya konumun id si yazýlýr ya da konumun kendisi yazýlýr)

    public Hayvan() {
        this.id= UUID.randomUUID().toString();
    }

    public Hayvan(String ad, int yas, String cins, Boolean etcil, Boolean otcul, int bacakSayisi, double boy, double agirlik, HayvanTuru hayvan, String yasamAlani) {
        this.id= UUID.randomUUID().toString();
        this.ad = ad;
        this.yas = yas;
        this.cins = cins;
        this.etcil = etcil;
        this.otcul = otcul;
        this.bacakSayisi = bacakSayisi;
        this.boy = boy;
        this.agirlik = agirlik;
        this.hayvan = hayvan;
        this.yasamAlani = yasamAlani;
    }

    /**
     * Farklý 2 Constructor koysakta sýkýntý olmaz.
     */

    public Hayvan(String ad, int yas, String cins, Boolean etcil, Boolean otcul, int bacakSayisi, double boy, double agirlik, HayvanTuru hayvan, String yasamAlani, Konum konum) {
        this.ad = ad;
        this.yas = yas;
        this.cins = cins;
        this.etcil = etcil;
        this.otcul = otcul;
        this.bacakSayisi = bacakSayisi;
        this.boy = boy;
        this.agirlik = agirlik;
        this.hayvan = hayvan;
        this.yasamAlani = yasamAlani;
        this.konum = konum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Konum getKonum() {
        return konum;
    }

    public void setKonum(Konum konum) {
        this.konum = konum;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", yas=" + yas +
                ", cins='" + cins + '\'' +
                ", etcil=" + etcil +
                ", otcul=" + otcul +
                ", bacakSayisi=" + bacakSayisi +
                ", boy=" + boy +
                ", agirlik=" + agirlik +
                ", hayvan=" + hayvan +
                ", yasamAlani='" + yasamAlani + '\'' +
                ", konum=" + konum +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public Boolean getEtcil() {
        return etcil;
    }

    public void setEtcil(Boolean etcil) {
        this.etcil = etcil;
    }

    public Boolean getOtcul() {
        return otcul;
    }

    public void setOtcul(Boolean otcul) {
        this.otcul = otcul;
    }

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public HayvanTuru getHayvan() {
        return hayvan;
    }

    public void setHayvan(HayvanTuru hayvan) {
        this.hayvan = hayvan;
    }

    public String getYasamAlani() {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }
}
