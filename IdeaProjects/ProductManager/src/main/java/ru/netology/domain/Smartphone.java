package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {

    private String production;
    private String tittle;

    public Smartphone(String name, int id, int price, String production, String tittle) {
        super(name, id, price);
        this.production = production;
        this.tittle = tittle;
    }

    public Smartphone(String production, String tittle) {
        this.production = production;
        this.tittle = tittle;
    }

    public Smartphone () {
        super();
    }


    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(production, that.production) && Objects.equals(tittle, that.tittle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), production, tittle);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "production='" + production + '\'' +
                ", tittle='" + tittle + '\'' +
                '}';
    }
}

