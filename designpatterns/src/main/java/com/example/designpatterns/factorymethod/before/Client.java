package com.example.designpatterns.factorymethod.before;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "beomjin@mail.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("BlackShip", "beomjin@mail.com");
        System.out.println(blackShip);
    }
}
