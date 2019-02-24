package com;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */
public class Node {

    //存放数据
    private  Object data;
    //下一节车厢
    private Node next;

     //构造方法
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public static void main(String[] args) {

        //1.准备车厢

        Node head=new Node("火车头",null);
        Node node1=new Node("01",null);
        Node node2=new Node("02",null);
        Node node3=new Node("03",null);
        Node node4=new Node("04",null);
        Node tail=new Node("火车尾",null);

        //2.连接车厢

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(tail);


        System.out.println(head.data);
        System.out.println(head.getNext().data);



        //3.展示火车
        Node curr=head;
        while(curr!=null){
            Object data=curr.getData();
            System.out.print(data);
            curr=curr.getNext();
            if(curr!=null){
                System.out.print("->");
            }

        }
        System.out.println();

    }
}
