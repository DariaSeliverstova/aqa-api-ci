package ru.netology.domain;

import java.util.Objects;

public class Book extends Product  {

    private String avtor;
    private String tittle;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(avtor, book.avtor) && Objects.equals(tittle, book.tittle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), avtor, tittle);
    }

    @Override
    public String toString() {
        return "Book{" +
                "avtor='" + avtor + '\'' +
                ", tittle='" + tittle + '\'' +
                '}';
    }

    public Book(String name, int id, int price, String avtor, String tittle) {
        super(name, id, price);
        this.avtor = avtor;
        this.tittle = tittle;
    }


    public Book(String avtor, String tittle) {
        this.avtor = avtor;
        this.tittle = tittle;
    }

    public Book() {super();
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

}




