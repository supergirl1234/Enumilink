package com;

/**
 * Author:Fanleilei
 * Created:2019/2/23 0023
 */

//枚举类
public enum  Gender2 {

    FEMALE("男"),MALE("女");

    private  String value;

    Gender2(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
