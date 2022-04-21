package com.vishank.startegyPattern;

import com.vishank.startegyPattern.behaviors.FlyNoWay;
import com.vishank.startegyPattern.typeOfDucks.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck maDuck = new MallardDuck();
        maDuck.display();
        maDuck.swim();
        maDuck.performFly();
        maDuck.performQuack();

        //We can change the behavior at the run time also. suppose we want to change flybehavior to nowings now.
        maDuck.setFlyBehavior(new FlyNoWay());
        maDuck.performFly();
    }
}
