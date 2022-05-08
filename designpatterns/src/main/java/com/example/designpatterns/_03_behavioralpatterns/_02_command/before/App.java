package com.example.designpatterns._03_behavioralpatterns._02_command.before;

public class App {

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
