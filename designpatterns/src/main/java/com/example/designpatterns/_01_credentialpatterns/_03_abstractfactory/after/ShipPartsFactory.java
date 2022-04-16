package com.example.designpatterns._01_credentialpatterns._03_abstractfactory.after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}