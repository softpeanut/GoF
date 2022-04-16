package com.example.designpatterns._01_credentialpatterns._03_abstractfactory.after;

import com.example.designpatterns._01_credentialpatterns._03_abstractfactory.before.WhiteAnchor;
import com.example.designpatterns._01_credentialpatterns._03_abstractfactory.before.WhiteWheel;

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
