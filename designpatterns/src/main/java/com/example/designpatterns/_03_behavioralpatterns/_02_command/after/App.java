package com.example.designpatterns._03_behavioralpatterns._02_command.after;

import com.example.designpatterns._03_behavioralpatterns._02_command.before.Light;

public class App {

    public static void main(String[] args) {
        Button button = new Button(new LightOnCommand(new Light()));
        button.press();
    }
}
