package com.design.objectAdapter.impl;

import com.design.entity.MisroUSB;
import com.design.entity.TypeC;

public class Adapter implements MisroUSB {

    private TypeC typeC;

    public Adapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void isMicroUSB() {
        typeC.isTypeC();
    }
}
