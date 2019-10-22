package com.design.objectAdapter;

import com.design.classAdapter.impl.TypeCImpl;
import com.design.entity.MisroUSB;
import com.design.entity.TypeC;
import com.design.objectAdapter.impl.Adapter;

public class App {

    public static void main(String[] args) {
        TypeC typeC = new TypeCImpl();
        MisroUSB misroUSB = new Adapter(typeC);
        misroUSB.isMicroUSB();
    }
}
