package com.design.decorator.monkey.impl;

import com.design.decorator.monkey.TheGreatestSage;

public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }
}
