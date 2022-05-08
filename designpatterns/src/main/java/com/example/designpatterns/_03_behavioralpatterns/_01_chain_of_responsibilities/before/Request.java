package com.example.designpatterns._03_behavioralpatterns._01_chain_of_responsibilities.before;

public class Request {

    String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
