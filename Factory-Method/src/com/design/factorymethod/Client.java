package com.design.factorymethod;

import com.design.factorymethod.Entity.Product;
import com.design.factorymethod.Factory.Impl.FactoryA;
import com.design.factorymethod.Factory.Impl.FactoryB;

public class Client {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        FactoryB factoryB = new FactoryB();
        Product productA = factoryA.createProduct();
        Product productB = factoryB.createProduct();
        productA.productInfo();
        productB.productInfo();
    }
}
