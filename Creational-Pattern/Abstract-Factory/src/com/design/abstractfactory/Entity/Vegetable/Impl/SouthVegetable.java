package com.design.abstractfactory.Entity.Vegetable.Impl;

import com.design.abstractfactory.Entity.Vegetable.Vegetable;

/**
 * 南方蔬菜
 */
public class SouthVegetable implements Vegetable {
    @Override
    public void vegetableInfo() {
        System.out.println("South-Taro");
    }
}
