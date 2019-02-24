package com.p;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */


//要想使用函数式编程有一个前提：接口必须只有一个方法，如果有两个方法，则无法使用函数式编程。如果现在某
//个接口就是为了函数式编程而生的，最好在定义时就让其只能够定义一个方法，所以有了一个新的注解：
//@FunctionalInterface
@FunctionalInterface
public interface Message1 {
    void chat(String message);


}
