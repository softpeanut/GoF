package com.example.designpatterns.factorymethod.after;

import com.example.designpatterns.abstractfactory.before.WhiteAnchor;
import com.example.designpatterns.abstractfactory.before.WhiteWheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    private WhiteWheel wheel;

    private WhiteAnchor anchor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public WhiteAnchor getAnchor() {
        return anchor;
    }

    public void setAnchor(WhiteAnchor whiteAnchor) {
        this.anchor = whiteAnchor;
    }

    public WhiteWheel getWheel() {
        return wheel;
    }

    public void setWheel(WhiteWheel whiteWheel) {
        this.wheel = whiteWheel;
    }
}
