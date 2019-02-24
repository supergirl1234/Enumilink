package com;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */
public class TestMessage {

    public static void main(String[] args) {
        Message qqmessage=new QQMessage();
        qqmessage.chat();
        qqmessage.transportFile();

        Message msnmessage=new MSNMessage();
        msnmessage.chat();
        msnmessage.transportFile();

        Message.print();//接口的static方法由接口类名直接调用
    }
}
