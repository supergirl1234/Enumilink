package com;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */

enum Color2{
    RED("红"),BLUE("蓝");

    private String color;

    private Color2(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color2{" +
                "color='" + color + '\'' +
                '}';
    }
}
public class Test2 {

    public static void main(String[] args) {
        Color2 color1=Color2.BLUE;
        System.out.println(color1.toString());
    }
}
