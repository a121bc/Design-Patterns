package com.design.abstractfactory.Entity.Vegetable.Impl;

import com.design.abstractfactory.Entity.Vegetable.Vegetable;

/**
 *  北方蔬菜
 */
public class NorthVegetable implements Vegetable {
    @Override
    public void vegetableInfo() {
        System.out.println("North-Tomato");
    }
}
