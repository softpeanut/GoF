package com.example.designpatterns.builder.java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.beomjin.me")
                .path("java-playlist-ep1")
                .build();
        System.out.println(howToStudyJava);
    }
}
