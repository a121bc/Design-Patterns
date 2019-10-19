package com.design.factorymethod.Factory.Impl;

import com.design.factorymethod.Entity.Impl.ProductA;
import com.design.factorymethod.Entity.Product;
import com.design.factorymethod.Factory.Factory;

public class FactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
