package com.design.abstractfactory;

import com.design.abstractfactory.Factory.NorthProductFactory;
import com.design.abstractfactory.Factory.SouthProductFactory;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        NorthProductFactory northProductFactory = new NorthProductFactory();
        SouthProductFactory southProductFactory = new SouthProductFactory();
        System.out.println("北方产品：");
        northProductFactory.createFruit().fruitInfo();
        northProductFactory.createVegetable().vegetableInfo();
        System.out.println("南方产品：");
        southProductFactory.createFruit().fruitInfo();
        southProductFactory.createVegetable().vegetableInfo();

    }
}
