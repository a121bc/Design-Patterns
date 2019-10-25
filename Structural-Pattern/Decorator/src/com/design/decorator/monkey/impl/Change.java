package com.design.decorator.monkey.impl;

import com.design.decorator.monkey.TheGreatestSage;

public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
