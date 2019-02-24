package com;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */
public class QQMessage implements Message{
    @Override
    public void chat() {
        System.out.println("QQ聊天");
    }

    @Override
    public void transportFile() {
        System.out.println("QQ传输文件");
    }
}
