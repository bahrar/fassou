package com.facty.bean;

public class Facture {
    
    private Long id;
    private String number;
    private int price;
    
    public Facture() {}

    public Facture(Long id, String number, int price) {
        this.id = id;
        this.number = number;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Facture{" + "id=" + id + ", number=" + number + ", price=" + price + '}';
    }
}