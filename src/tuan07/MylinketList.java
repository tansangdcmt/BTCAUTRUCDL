package tuan07;

import javax.xml.crypto.Data;

public class MylinketList {
    Node head = null; //danh sách rỗng
    Node tail = null;

    public MylinketList(){}
    void add(int data){
        //tạo 1 mod mới
        Node newNode = new Node(data);

        if(head == null){//thêm 1 danh sách rỗng
            head = newNode;
            tail = newNode;
        }
        else{//danh sách rỗng// thêm vào dưới danh sách
            tail.next = newNode;
            tail = newNode;

    }
        
        }
    void remve(){

    }
    void print(){
        Node current = head;
        if ( head == null){
            System.out.println("Danh Sách rỗng!!!");
            return;
        }
        System.out.println("các nút trong danh sách:");
        while(current != null ){
            System.out.println(current.data);
            current = current.next;
        }
    }
    void find(){}
}
