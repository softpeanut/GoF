package com.example.designpatterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "beomin@mail.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "beomjin@mail.com");
        System.out.println(blackShip);
    }
}
