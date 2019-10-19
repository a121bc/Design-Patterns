package com.design.abstractfactory.Entity.Fruit.Impl;

import com.design.abstractfactory.Entity.Fruit.Fruit;

/**
 * 北方水果
 */
public class NorthFruit implements Fruit {
    @Override
    public void fruitInfo() {
        System.out.println("North-Apple");
    }
}
