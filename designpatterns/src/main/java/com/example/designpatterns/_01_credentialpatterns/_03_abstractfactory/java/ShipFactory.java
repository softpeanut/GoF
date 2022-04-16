package com.example.designpatterns._01_credentialpatterns._03_abstractfactory.java;

import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.Ship;
import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteShip");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
