package com.hfdp.intro;

import com.hfdp.intro.behaviors.FlyBehavior;
import com.hfdp.intro.behaviors.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
