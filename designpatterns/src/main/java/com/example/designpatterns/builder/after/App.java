package com.example.designpatterns.builder.after;

import com.example.designpatterns.builder.before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());

        TourPlan cancunTrip = tourDirector.cancunTrip();
        TourPlan longBeachTrip = tourDirector.longBeachTrip();
    }
}
