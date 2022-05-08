package com.example.designpatterns._03_behavioralpatterns._02_command.after;

import com.example.designpatterns._03_behavioralpatterns._02_command.before.Game;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
