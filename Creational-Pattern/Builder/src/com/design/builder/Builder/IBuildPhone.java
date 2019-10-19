package com.design.builder.Builder;

import com.design.builder.Entity.MobilePhone;

public interface IBuildPhone {

    /**
     * 建造手机屏幕
     */
    void buildScreen();

    /**
     * 建造手机电池
     */
    void buildBattery();

    /**
     * 建造手机听筒
     */
    void buildMicrophone();

    /**
     * 建造手机话筒
     */
    void buildPhoneReceiver();

    /**
     * 建造手机机身
     */
    void buildPhoneBody();

    /**
     * 创造手机
     * @return
     */
    public MobilePhone build();
}
