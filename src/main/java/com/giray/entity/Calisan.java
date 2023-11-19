package com.giray.entity;

import com.giray.enums.Cinsiyet;

import java.util.UUID;

public class Calisan {
    String id;
    String ad;
    String soyad;
    String bakimAlani;
    Cinsiyet cinsiyet;
    int yas;

    public Calisan() {
        this.id= UUID.randomUUID().toString();
    }

    public Calisan(String ad, String soyad, String bakimAlani, Cinsiyet cinsiyet, int yas) {
        this.id=UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.bakimAlani = bakimAlani;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", bakimAlani='" + bakimAlani + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", yas=" + yas +
                '}';
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBakimAlani() {
        return bakimAlani;
    }

    public void setBakimAlani(String bakimAlani) {
        this.bakimAlani = bakimAlani;
    }
}
