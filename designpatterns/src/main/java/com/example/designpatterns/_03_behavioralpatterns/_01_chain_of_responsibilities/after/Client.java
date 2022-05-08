package com.example.designpatterns._03_behavioralpatterns._01_chain_of_responsibilities.after;

import com.example.designpatterns._03_behavioralpatterns._01_chain_of_responsibilities.before.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        requestHandler.handle(request);
    }
}
