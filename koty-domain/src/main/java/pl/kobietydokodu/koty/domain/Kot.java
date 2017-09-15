package pl.kobietydokodu.koty.domain;

import java.util.Date;

/**
 * Created by lukasz on 2017-09-13.
 */
public class Kot {
    private int id;
    private String name;
private Float weight;
private Date birthDate;
private String ownerName;

    public Date getBirthDate() {
        return birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Kot(int id, String name, Float weight, Date birthDate, String ownerName) {
        this.id=id;
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Kot setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getName() {
        return name;
    }

    public Kot setName(String name) {
        this.name = name;
        return this;
    }

    public Kot() {
    }

    public Kot(Float weight, Date date) {
        this.weight = weight;
        this.birthDate = date;
    }

    public Float getWeight() {
        return weight;
    }

    public Kot setWeight(Float weight) {
        this.weight = weight;
        return this;
    }

    public Date getDate() {
        return birthDate;
    }

    public Kot setDate(Date date) {
        this.birthDate = date;
        return this;
    }

    @Override
    public String toString() {
        return "pl.kobietydokodu.koty.domain.Kot " +
                "imie :" + name + '\'' +
                ", waga : " + weight +
                ", data urodzenia : " + birthDate +
                ",imie wlasciciela : " + ownerName ;
    }
}
