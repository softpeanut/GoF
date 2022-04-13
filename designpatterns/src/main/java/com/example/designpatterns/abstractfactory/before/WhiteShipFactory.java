package com.example.designpatterns.abstractfactory.before;

import com.example.designpatterns.factorymethod.after.DefaultShipFactory;
import com.example.designpatterns.factorymethod.after.Ship;
import com.example.designpatterns.factorymethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
