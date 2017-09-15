package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 2017-09-14.
 */
public class KotDao {
    List<Kot> koty = new ArrayList<>();


    public void dodajKota(Kot kot){
        koty.add(kot);
        System.out.println("Dziêkujê, doda³em kota do kolekcji!");
    }
    public List<Kot> getKoty(){
        return  koty;
    }
}
