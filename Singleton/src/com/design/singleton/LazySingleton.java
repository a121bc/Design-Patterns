package com.design.singleton;

/**
 * 懒汉模式单例
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            return new LazySingleton();
        }
        return lazySingleton;
    }
}
