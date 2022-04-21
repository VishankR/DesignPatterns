package com.vishank.startegyPattern.behaviors;

import com.vishank.startegyPattern.typeOfBehaviours.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings.");
    }
}
