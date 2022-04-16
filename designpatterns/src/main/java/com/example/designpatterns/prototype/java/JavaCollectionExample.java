package com.example.designpatterns.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student beomjin = new Student("beomjin");
        Student whitShip = new Student("whiteShip");
        List<Student> students = new ArrayList<>();
        students.add(beomjin);
        students.add(whitShip);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
