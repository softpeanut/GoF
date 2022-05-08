package com.example.designpatterns._03_behavioralpatterns._01_chain_of_responsibilities.after;

public class App {

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
