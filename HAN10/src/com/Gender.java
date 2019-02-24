package com;

/**
 * Author:Fanleilei
 * Created:2019/2/23 0023
 */
//多例实现   描述性别
public class Gender {

    private final String value;
    private  static  final  Gender FEMALE=new Gender("男");
    private  static  final  Gender MALE=new Gender("女");

    private Gender(String value) {
        this.value = value;
    }

    //type=0 女   type=1 男
    public static Gender getInstance(int type){
        switch (type) {
            case 0:
                return FEMALE;
            case 1:
                return  MALE;
            default:
                return null;

        }
    }

    public  String getValue(){

        return value;
    }

    public static void main(String[] args) {
        Gender p=Gender.FEMALE;
        System.out.println(p.getValue());

        Gender people1=Gender.getInstance(0);//女
        System.out.println(people1);
        System.out.println(people1.getValue());


        Gender people2=Gender.getInstance(1);//男
        System.out.println(people2);
        System.out.println(people2.getValue());


    }
}
