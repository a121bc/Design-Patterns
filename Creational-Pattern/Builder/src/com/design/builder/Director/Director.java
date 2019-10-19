package com.design.builder.Director;

import com.design.builder.Builder.IBuildPhone;
import com.design.builder.Builder.Impl.IPhoneX;
import com.design.builder.Entity.MobilePhone;

public class Director {

    private static MobilePhone createMobilePhone(IBuildPhone buildPhone){
        buildPhone.buildBattery();
        buildPhone.buildMicrophone();
        buildPhone.buildScreen();
        buildPhone.buildPhoneReceiver();
        buildPhone.buildPhoneBody();

        return buildPhone.build();
    }

    public static void main(String[] args) {
        System.out.println(createMobilePhone(new IPhoneX()));
    }
}
