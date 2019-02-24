package com;

/**
 * Author:Fanleilei
 * Created:2019/2/24 0024
 */
public class Ilink {

    private Node head;
    private Node tail;
    private int size;

    public Ilink() {

        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public Ilink(Object data) {
        Node node=new Node(data,null);

        this.head =node;
        this.tail =node;
        this.size ++;
        this.head.setNext(this.tail);
    }

    /**
     * 链表增加节点操作
     *
     * @param data 节点内容
     * @return
     */
    public boolean add(Object data){
        //在链表末尾增加
        Node node=new Node(data,null);
        this.size++;
        if(head==null){
            this.head=node;
            this.tail=node;
            this.head.setNext(tail);

        }else{
            this.tail.setNext(node);
            this.tail=node;

        }

        return true;


    }
    /**
     * 判断指定内容节点在链表中是否存在
     *
     * @param data 要判断的内容
     * @return 返回找到的节点索引
     */
    public int contains(Object data){
        Node curr=head;
        int index=0;
        while (curr!=null){
            if (data != curr.getData()) {
                curr = curr.getNext();
                index++;
            } else {

                return index;
            }
        }
        return -1;

    }

    /**
     * 删除指定内容节点
     *
     * @param data
     * @return
     */
    public boolean remove(Object data){

        Node curr=head;
        Node prev=head;//curr前面的那一个节点
        while( curr!=null){
            Object e=curr.getData();
            if(e.equals(data)){
                prev.setNext(curr.getNext());
                return true;

            }
            prev=curr;
            curr=curr.getNext();

        }

     return false;
    }
    /**
     * 根据指定下标修改节点内容
     *
     * @param index   索引下标
     * @param newData 替换后的内容
     * @return 替换之前的节点内容
     */
    public Object set(int index, Object newData){
        if(index<0){

            return null;

        }
        if(index>size-1){
            return null;

        }

        Node curr=head;
        int currIndex=-1;
        while(curr!=null){

            currIndex++;
            if(currIndex==index){
                curr.setData(newData);

            }
            curr=curr.getNext();
        }

        return null;

    }

    /**
     * 根据指定下标返回节点内容
     *
     * @param index
     * @return
     */
    public Object get(int index){
        if(index<0){

            return null;

        }
        if(index>size-1){
            return null;

        }

        Node curr=head;
        int currIndex=-1;
        while(curr!=null){

            currIndex++;
            if(currIndex==index){
               Object data= curr.getData();
               return data;

            }
            curr=curr.getNext();
        }

        return null;


    }

    /**
     * 链表清空
     */
    public void clear(){

        this.head=null;
        this.tail=null;
        this.size=0;
    }

    /**
     * 将链表转为数组
     *
     * @return 返回所有节点内容
     */
    public Object[] toArray(){

        Object[] newnode=new Object[size];
        Node curr=head;
        int dex=0;
        while(curr!=null){
            newnode[dex]=curr.getData();
            dex++;
            curr=curr.getNext();

        }

        return newnode;



    }

    /**
     * 链表长度
     *
     * @return
     */
    public int size(){

       /* Node curr=head;
        int size=0;
        while(curr!=null){

            size++;
            curr=curr.getNext();
        }
        return size;*/

       return this.size;


    }

    /**
     * 遍历链表
     */
    public void printLink(){
        Node curr=head;
        while(curr!=null){

            System.out.print(curr.getData());
            curr=curr.getNext();
            if(curr!=null){
                System.out.print("->");

            }

        }
        System.out.println();

    }

    public static void main(String[] args) {

        Ilink ilink=new Ilink();
        ilink.add("01");
        ilink.add("02");
        ilink.add("03");
        ilink.add("04");

        System.out.println(ilink.size());
        Object[] values=ilink.toArray();
        for(Object p:values){
            System.out.print(p+" ");

        }
        System.out.println();

        System.out.println(ilink.contains("03"));

        System.out.println(ilink.get(2));

        ilink.printLink();




    }
}
