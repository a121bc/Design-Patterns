package com.design.factorymethod.Entity.Impl;

import com.design.factorymethod.Entity.Product;

public class ProductB implements Product {
    @Override
    public void productInfo() {
        System.out.println("Product B");
    }
}
