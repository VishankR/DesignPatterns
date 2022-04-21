package com.vishank.startegyPattern.behaviors;

import com.vishank.startegyPattern.typeOfBehaviours.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Not Flying.");
    }
}
