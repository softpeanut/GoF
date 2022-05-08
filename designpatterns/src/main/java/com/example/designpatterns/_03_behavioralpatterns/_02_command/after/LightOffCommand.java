package com.example.designpatterns._03_behavioralpatterns._02_command.after;

import com.example.designpatterns._03_behavioralpatterns._02_command.before.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
