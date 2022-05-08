package com.example.designpatterns._03_behavioralpatterns._02_command.before;

public class Button {

    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.on();
    }
}
