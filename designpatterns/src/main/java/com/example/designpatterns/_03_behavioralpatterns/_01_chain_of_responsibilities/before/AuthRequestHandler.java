package com.example.designpatterns._03_behavioralpatterns._01_chain_of_responsibilities.before;

public class AuthRequestHandler extends RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
