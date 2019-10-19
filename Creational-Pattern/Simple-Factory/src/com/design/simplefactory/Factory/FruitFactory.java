package com.design.simplefactory.Factory;

import com.design.simplefactory.Enity.Fruit;
import com.design.simplefactory.Enity.Impl.Apple;
import com.design.simplefactory.Enity.Impl.Banana;

public class FruitFactory {

    public static Fruit createFriut(String name) {
        switch (name) {
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Fruit apple = FruitFactory.createFriut("apple");
        Fruit banana = FruitFactory.createFriut("banana");
        Fruit other = FruitFactory.createFriut("other");
        System.out.println(apple == null?"null":apple.fruteName());
        System.out.println(banana == null?"null":banana.fruteName());
        System.out.println(other == null?"null":other.fruteName());
    }
}
