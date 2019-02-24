package com;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */

enum Sex{
    FEAMLE("男"),MALE("女");

    private String title;

    private Sex(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Person{

    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}


public class Test4 {

    public static void main(String[] args) {

        Person person=new Person("张三",12,Sex.FEAMLE);
        System.out.println(person.toString());

    }
}
