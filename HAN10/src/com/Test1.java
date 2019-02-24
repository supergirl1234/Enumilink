package com;

import java.util.concurrent.Callable;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */

//枚举类
enum  Color{

    RED,BLUE,GREEN
}
public class Test1 {

    public static void main(String[] args) {
        System.out.println(Color.BLUE);

       Color[] color=Color.values();
       for(Color p:color){
           //System.out.println(p);
           System.out.println(p.ordinal()+"="+p.name());

       }
    }
}
