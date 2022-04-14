package com.example.designpatterns.builder.java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteShip").append("beomjin").toString();
        System.out.println(result);
    }
}
