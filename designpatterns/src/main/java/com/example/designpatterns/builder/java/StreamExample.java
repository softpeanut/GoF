package com.example.designpatterns.builder.java;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
//        Stream.Builder<String> stringStreamBuilder = Stream.builder();
//        Stream<String> names = stringStreamBuilder.add("beomjin").add("whiteShip").build();
        Stream<String> names = Stream.<String>builder().add("beomjin").add("whiteShip").build();
        names.forEach(System.out::println);
    }
}
