package com.example.designpatterns._03_behavioralpatterns._02_command.after;

import com.example.designpatterns._03_behavioralpatterns._02_command.before.Game;

public class GameStartCommand implements Command {

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.start();
    }
}
