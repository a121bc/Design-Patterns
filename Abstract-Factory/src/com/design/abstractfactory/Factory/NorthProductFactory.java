package com.design.abstractfactory.Factory;

import com.design.abstractfactory.Entity.Fruit.Fruit;
import com.design.abstractfactory.Entity.Fruit.Impl.NorthFruit;
import com.design.abstractfactory.Entity.Vegetable.Impl.NorthVegetable;
import com.design.abstractfactory.Entity.Vegetable.Vegetable;

/**
 * 北方产品工厂
 */
public class NorthProductFactory implements Factory {
    @Override
    public Fruit createFruit() {
        return new NorthFruit();
    }

    @Override
    public Vegetable createVegetable() {
        return new NorthVegetable();
    }
}
