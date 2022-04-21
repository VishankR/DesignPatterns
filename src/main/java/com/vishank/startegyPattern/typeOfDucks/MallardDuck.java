package com.vishank.startegyPattern.typeOfDucks;

import com.vishank.startegyPattern.Duck;
import com.vishank.startegyPattern.behaviors.FlyWithWings;
import com.vishank.startegyPattern.behaviors.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("MallardDuck");
    }

    public MallardDuck(){
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());
    }
}
