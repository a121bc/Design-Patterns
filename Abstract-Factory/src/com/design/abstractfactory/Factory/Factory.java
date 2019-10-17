package com.design.abstractfactory.Factory;

import com.design.abstractfactory.Entity.Fruit.Fruit;
import com.design.abstractfactory.Entity.Vegetable.Vegetable;

/**
 * 工厂接口
 */
public interface Factory {

    // 创造水果
    Fruit createFruit();

    // 创造蔬菜
    Vegetable createVegetable();
}
