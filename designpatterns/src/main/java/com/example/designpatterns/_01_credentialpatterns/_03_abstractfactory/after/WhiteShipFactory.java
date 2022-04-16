package com.example.designpatterns._01_credentialpatterns._03_abstractfactory.after;

import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.DefaultShipFactory;
import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.Ship;
import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
