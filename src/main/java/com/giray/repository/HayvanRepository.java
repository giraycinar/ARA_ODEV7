package com.giray.repository;

import com.giray.entity.Hayvan;
import static com.giray.Database.HayvanatBahcesiDB.*;   // hayvanat bahçesi içindeli tüm staticlere eriþim saðlayabiliriz.

public class HayvanRepository {
    /**
     * Kendisine ait olan entity nin istiflenmesi ve gerekli olduðunda bilgilerinin çekilmesi iþlemi için.
     * CRUD iþlemleri yapýlýr.
     */
    public void save(Hayvan hayvan){
        hayvanListesi[hayvanSayisi++]= hayvan;

    }
    public Hayvan findByAd(String hayvanAdi){
        //foreach ile hayvanlistesi içinden bir hayvan seçtirdik.
        for(Hayvan hayvan: hayvanListesi){
            if(hayvan.getAd().contains(hayvanAdi))
                return hayvan;

        }
        return null;
    }
    public Hayvan[] findAll(){
        Hayvan[] result =new Hayvan[hayvanSayisi];
        for(int i =0; i<hayvanSayisi;i++)
            result[i]= hayvanListesi[i];
        return result;
    }

}
