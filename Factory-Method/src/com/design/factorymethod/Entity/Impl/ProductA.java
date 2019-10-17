package com.design.factorymethod.Entity.Impl;

import com.design.factorymethod.Entity.Product;

/**
 * 产品A
 */
public class ProductA implements Product {
    @Override
    public void productInfo() {
        System.out.println("Product A");
    }
}
