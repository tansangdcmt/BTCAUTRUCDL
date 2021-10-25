/*
* create date : oct 18, 2021
* author : cgm
*/
package tuan07;

public class Node {
    //noi dung
    int data;

    //lien ket đến nút tiep theo
    //Tham chieu
    Node text; //bien tham chieu kiểu data

    public Node(){}
        public Node(int d){
            data = d;
        }
        public node(int d, Node n){
            data = d;
            Node = n;
        }
}
