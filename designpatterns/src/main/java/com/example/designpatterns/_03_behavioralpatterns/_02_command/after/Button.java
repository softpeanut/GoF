package com.example.designpatterns._03_behavioralpatterns._02_command.after;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
