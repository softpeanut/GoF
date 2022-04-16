package com.example.designpatterns._01_credentialpatterns._02_factorymethod.after;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
