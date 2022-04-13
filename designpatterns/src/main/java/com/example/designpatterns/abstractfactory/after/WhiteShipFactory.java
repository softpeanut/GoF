package com.example.designpatterns.abstractfactory.after;

import com.example.designpatterns.factorymethod.after.DefaultShipFactory;
import com.example.designpatterns.factorymethod.after.Ship;
import com.example.designpatterns.factorymethod.after.WhiteShip;

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
