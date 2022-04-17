package com.example.designpatterns._02_structuralpatterns._02_bridge.after;

import com.example.designpatterns._02_structuralpatterns._02_bridge.before.Champion;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();

    }
}
