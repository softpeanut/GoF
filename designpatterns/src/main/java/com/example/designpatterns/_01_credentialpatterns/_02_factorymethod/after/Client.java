package com.example.designpatterns._01_credentialpatterns._02_factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "beomjin@mail.com");
        client.print(new BlackShipFactory(), "blackShip", "beomjin@mail.com");
    }

    private void print(ShipFactory whiteShipFactory, String name, String email) {
        System.out.println(whiteShipFactory.orderShip(name, email));
    }
}
