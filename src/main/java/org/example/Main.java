package org.example;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();

        out.println(classOne.greet());
        out.println(classTwo.greet());
        out.println(classThree.greet());

    }
}