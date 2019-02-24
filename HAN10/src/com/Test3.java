package com;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */

//枚举类可以继承接口，这样枚举中的每一个对象都变成了接口对象。
interface IColor {
    public String getColor() ;
}
enum Color3 implements IColor{
    RED("红"),BLUE("蓝");//如果定义有很多内容，枚举对象必须写在第一行

    private String color;

    private Color3(String color) {
        this.color = color;
    }



    @Override
    public String getColor() {
        return this.color;
    }
}
public class Test3 {

    public static void main(String[] args) {

        IColor iColor=Color3.RED;
        System.out.println(iColor.getColor());
    }
}
