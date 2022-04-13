package com.example.designpatterns.abstractfactory.after;

import com.example.designpatterns.factorymethod.after.Ship;
import com.example.designpatterns.factorymethod.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
