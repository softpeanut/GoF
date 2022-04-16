package com.example.designpatterns._01_credentialpatterns._02_factorymethod.java;

import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.BlackShip;
import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
