package com.design.decorator.monkey.impl;

import com.design.decorator.monkey.TheGreatestSage;

public class Monkey implements TheGreatestSage {
    @Override
    public void move() {
        System.out.println("Monkey Move");
    }
}
