package com;

/**
 * Author:Fanleilei
 * Created:2019/2/23 0023
 */
public class TestGender {

    public static void main(String[] args) {


       Gender famale=Gender.getInstance(0);
        Gender male=Gender.getInstance(1);
        System.out.println(famale==male);//false
        System.out.println(famale==Gender.getInstance(0));//true
        if(famale!=null){
            System.out.println(famale.getValue());//男

        }




        //枚举类

        Gender2 p1=Gender2.FEMALE;
        Gender2 p2=Gender2.MALE;
        System.out.println(p1==Gender2.FEMALE);//true
        System.out.println(p2==Gender2.MALE);//true
        System.out.println(p1.getValue());//男
        System.out.println(p2.getValue());//女

         //获取枚举类的全部对象，用数组接收
        Gender2[] gender2=Gender2.values();
        for(Gender2 p:gender2){
            System.out.println("value="+p.getValue()+"  name="+p.name());

        }

        System.out.println("-------------------------");

        Gender2 gender21=Gender2.valueOf("MALE");
        System.out.println("value="+gender21.getValue()+"   name="+gender21.name());


    }
}
