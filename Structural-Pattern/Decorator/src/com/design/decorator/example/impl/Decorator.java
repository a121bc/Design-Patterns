package com.design.decorator.example.impl;

import com.design.decorator.example.Component;

/**
 * 装饰角色
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
