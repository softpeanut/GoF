package com.example.designpatterns._02_structuralpatterns._06_flyweight.after;

public class Character {

    private char value;

    private String color;

    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
