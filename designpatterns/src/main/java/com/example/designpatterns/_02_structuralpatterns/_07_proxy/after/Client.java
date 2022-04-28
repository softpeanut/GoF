package com.example.designpatterns._02_structuralpatterns._07_proxy.after;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }
}
