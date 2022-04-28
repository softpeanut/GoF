package com.example.designpatterns._02_structuralpatterns._07_proxy.before;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
