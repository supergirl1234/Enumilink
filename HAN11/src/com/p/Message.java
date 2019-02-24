package com.p;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */
public interface Message {
    //聊天功能
    void chat();

    //传输文件
    //default的普通方法，对象调用
    default  void transportFile(){

        System.out.println("暂时不支持传输文件");
    }
    //static方法，可以由接口类直接调用
    //这个不用被子类覆写
    static  void print(){

        System.out.println("这是聊天工具");
    }

}
