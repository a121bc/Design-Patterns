package com.design.classAdapter;

import com.design.entity.MisroUSB;
import com.design.classAdapter.impl.Adapter;

/**
 * 类适配器
 */
public class App {

    public static void main(String[] args) {
        MisroUSB misroUSB = new Adapter();
        misroUSB.isMicroUSB();
    }
}
