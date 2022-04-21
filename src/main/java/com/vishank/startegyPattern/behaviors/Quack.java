package com.vishank.startegyPattern.behaviors;

import com.vishank.startegyPattern.typeOfBehaviours.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking...");
    }
}
