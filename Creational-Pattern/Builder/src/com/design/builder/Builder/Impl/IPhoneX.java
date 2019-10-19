package com.design.builder.Builder.Impl;

import com.design.builder.Builder.IBuildPhone;
import com.design.builder.Entity.MobilePhone;

public class IPhoneX implements IBuildPhone {

    private MobilePhone mobilePhone;

    public IPhoneX() {
        this.mobilePhone = new MobilePhone();
    }

    /**
     * 建造手机屏幕
     */
    @Override
    public void buildScreen() {
        this.mobilePhone.setScreen("OLED显示屏");
    }

    /**
     * 建造手机电池
     */
    @Override
    public void buildBattery() {
        this.mobilePhone.setBattery("2700mAh电池容量");
    }

    /**
     * 建造手机听筒
     */
    @Override
    public void buildMicrophone() {
        this.mobilePhone.setMicrophone("听筒");
    }

    /**
     * 建造手机话筒
     */
    @Override
    public void buildPhoneReceiver() {
        this.mobilePhone.setPhoneReceiver("话筒");
    }

    /**
     * 建造手机机身
     */
    @Override
    public void buildPhoneBody() {
        this.mobilePhone.setPhoneBody("iPhoneX机身");
    }

    /**
     * 创建手机
     */
    @Override
    public MobilePhone build(){
        return mobilePhone;
    }

}
