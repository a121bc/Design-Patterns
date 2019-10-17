package com.design.factorymethod.Factory.Impl;

import com.design.factorymethod.Entity.Impl.ProductB;
import com.design.factorymethod.Entity.Product;
import com.design.factorymethod.Factory.Factory;

public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
