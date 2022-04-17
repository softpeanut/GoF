package com.example.designpatterns._02_structuralpatterns._02_bridge.before;

public class KDA아칼리 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 아칼리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 아칼리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 아칼리 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 아칼리 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 아칼리 R");
    }
}
