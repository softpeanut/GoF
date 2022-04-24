package com.example.designpatterns._02_structuralpatterns._03_composite.before;

public class Item {

    private String name;

    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
