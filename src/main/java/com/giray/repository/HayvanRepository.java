package com.giray.repository;

import com.giray.entity.Hayvan;
import static com.giray.Database.HayvanatBahcesiDB.*;   // hayvanat bah�esi i�indeli t�m staticlere eri�im sa�layabiliriz.

public class HayvanRepository {
    /**
     * Kendisine ait olan entity nin istiflenmesi ve gerekli oldu�unda bilgilerinin �ekilmesi i�lemi i�in.
     * CRUD i�lemleri yap�l�r.
     */
    public void save(Hayvan hayvan){
        hayvanListesi[hayvanSayisi++]= hayvan;

    }
    public Hayvan findByAd(String hayvanAdi){
        //foreach ile hayvanlistesi i�inden bir hayvan se�tirdik.
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
