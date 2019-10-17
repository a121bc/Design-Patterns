package com.design.abstractfactory.Factory;

import com.design.abstractfactory.Entity.Fruit.Fruit;
import com.design.abstractfactory.Entity.Fruit.Impl.SouthFruit;
import com.design.abstractfactory.Entity.Vegetable.Impl.SouthVegetable;
import com.design.abstractfactory.Entity.Vegetable.Vegetable;

/**
 * 南方产品工厂
 */
public class SouthProductFactory implements Factory {
    @Override
    public Fruit createFruit() {
        return new SouthFruit();
    }

    @Override
    public Vegetable createVegetable() {
        return new SouthVegetable();
    }
}
