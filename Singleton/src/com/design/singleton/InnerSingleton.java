package com.design.singleton;

/**
 * 静态内部类单例
 */
public class InnerSingleton {

    private InnerSingleton() {}

    private static class Inner {
        private static InnerSingleton Instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return Inner.Instance;
    }

    public void doSomething() {

    }
}
