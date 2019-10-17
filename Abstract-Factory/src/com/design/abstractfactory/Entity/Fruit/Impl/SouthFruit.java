package com.design.abstractfactory.Entity.Fruit.Impl;

import com.design.abstractfactory.Entity.Fruit.Fruit;

/**
 * 南方水果
 */
public class SouthFruit implements Fruit {
    @Override
    public void fruitInfo() {
        System.out.println("South-Banana");
    }
}
