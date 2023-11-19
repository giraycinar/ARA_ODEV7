package com.giray.entity;

import com.giray.enums.State;

import java.util.Date;
import java.util.UUID;

public class Ziyaret {
    String id;
    Hayvan hayvan; // Ne ziyaret edilecek --> Hayvan
    Ziyaretci ziyaretci; // kim ziyaret edecek--> Ziyaretçi
    Date ziyaretTarihi;
    int ziyaretSuresi;
    State state; //Hayvanat bahçesi açık/kapalı mı?

    public Ziyaret() {
        this.id= UUID.randomUUID().toString();
    }

    public Ziyaret(Hayvan hayvan, Ziyaretci ziyaretci, Date ziyaretTarihi, int ziyaretSuresi, State state) {
        this.id= UUID.randomUUID().toString();
        this.hayvan = hayvan;
        this.ziyaretci = ziyaretci;
        this.ziyaretTarihi = ziyaretTarihi;
        this.ziyaretSuresi = ziyaretSuresi;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Ziyaret{" +
                "id='" + id + '\'' +
                ", hayvan=" + hayvan +
                ", ziyaretci=" + ziyaretci +
                ", ziyaretTarihi=" + ziyaretTarihi +
                ", ziyaretSuresi=" + ziyaretSuresi +
                ", state=" + state +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Hayvan getHayvan() {
        return hayvan;
    }

    public void setHayvan(Hayvan hayvan) {
        this.hayvan = hayvan;
    }

    public Ziyaretci getZiyaretci() {
        return ziyaretci;
    }

    public void setZiyaretci(Ziyaretci ziyaretci) {
        this.ziyaretci = ziyaretci;
    }

    public Date getZiyaretTarihi() {
        return ziyaretTarihi;
    }

    public void setZiyaretTarihi(Date ziyaretTarihi) {
        this.ziyaretTarihi = ziyaretTarihi;
    }

    public int getZiyaretSuresi() {
        return ziyaretSuresi;
    }

    public void setZiyaretSuresi(int ziyaretSuresi) {
        this.ziyaretSuresi = ziyaretSuresi;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
