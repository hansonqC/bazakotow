package pl.kobietydokodu.koty;

import java.util.ArrayList;
import java.util.List;
import pl.kobietydokodu.koty.domain.Kot;
/**
 * Created by lukasz on 2017-09-14.
 */
public class KotDao {
    List<Kot> koty = new ArrayList<Kot>();


    public void dodajKota(Kot kot){
        koty.add(kot);
        System.out.println("Dziêkujê, doda³em kota do kolekcji!");
    }
    public List<Kot> getKoty(){
        return  koty;
    }
}
