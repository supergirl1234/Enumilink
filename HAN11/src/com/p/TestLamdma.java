package com.p;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */
public class TestLamdma {

    // //0.lambda表达式: 接口有且仅有一个抽象方法，使用@FunctionalInterface注解标注接口是一个函数接口
    //        //1.lambda表达式：如果抽象方法的实现中一条命令 大括号可以省略
    //        //2.lambda表达式：如果抽象方法参数只有一个，参数列表的括号可以省略
    //        //3.lambda表达式：如果抽象方法实现中有返回值，并且只有一条命令，那么语句的结果就是返回值
    //
    //        //4.lambda表达式：  (参数列表) -> {  实现内容;  }; 注意：在lambda表达式所在作用域下，防止参数列名中的参数名和作用域中的其它变量名冲突
    public static void main(String[] args) {

        //传统的面向对象开发
       /* Message message=new Message() {
            @Override
            public void chat() {
                System.out.println("我要聊天");
            }
        };

        message.chat();*/

       //用函数式编程
        Message message= () -> System.out.println("我要聊天");


      /*
        Message1 message1=new Message1() {
            @Override
            public void chat(String message) {
                System.out.println("String message="+message);
            }
        };
        message1.chat("hello");*/

     //用lambda表达式
        Message1 message1= message2 -> System.out.println("String message="+ message2);
        message1.chat("hello");



        Message2 message2=(message3,sub)->{

            System.out.println(message3);
            System.out.println(sub);

        };
        message2.chat("haha","nihao");


        Message3 message3=(message4,sub)->message4+sub;
        System.out.println(message3.chat("hello","world"));
        //message3相当于message30，
         /*Message3 message30=new Message3() {
                   @Override
                    public String chat(String message, String sub) {

                        return message+sub;
                    }
         };*/


        Message3 message31=new Message3() {
            @Override
            public String chat(String message, String sub) {
                System.out.println(message+sub);
                return message+sub;
            }
        };
        message31.chat("hii","quy");



    }
}
