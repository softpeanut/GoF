package com.example.designpatterns._03_behavioralpatterns._01_chain_of_responsibilities.before;

public class RequestHandler {

    public void handle(Request request) {
        System.out.println(request.getBody());
    }
}
