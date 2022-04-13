package com.example.designpatterns.abstractfactory.after;

import com.example.designpatterns.abstractfactory.before.WhiteAnchor;
import com.example.designpatterns.abstractfactory.before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
