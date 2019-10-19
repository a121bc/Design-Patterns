package com.design.singleton;

/**
 * 饿汉模式单例
 */
public class EagerSingleton {

    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return EAGER_SINGLETON;

    }
}
