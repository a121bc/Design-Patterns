package com.design.classAdapter.impl;

import com.design.entity.MisroUSB;

public class Adapter extends TypeCImpl implements MisroUSB {
    @Override
    public void isMicroUSB() {
        isTypeC();
    }
}
