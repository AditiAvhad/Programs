package LinkedList;

public class CreateLinkedList {
    class Node {
        int Data;
        Node Next;

        Node(int Data) {
            this.Data = Data;
            Next = null;
        }
    }
    Node Head;
    CreateLinkedList() {
        Head = null;
    }
    void insertAtTheBeg(int Data) {
        Node newNode = new Node(Data);
        newNode.Next = Head;
        Head = newNode;
    }
    void intAtAnyPoint(Node prev, int Data) {
        if (prev.Next == null) {
            return;
        }
        Node newNode = new Node(Data);
        newNode.Next = prev.Next;
        prev.Next = newNode;
    }
    void insertAtTheEnd(int Data) {
        Node newNode = new Node(Data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        Node last = Head;
        while (last.Next != null) {
            last = last.Next;
        }
        last.Next = newNode;
    }
    int len() {
        Node last = Head;
        int count = 0;
        while (last != null) {
            count++;
            last = last.Next;
        }
        return count;
    }
     boolean LoopDetect(){
     Node slow=Head;
     Node fast=Head;
     boolean flag=false;
     while(slow!=null && fast!=null &&fast.Next!=null){
         slow=slow.Next;
         fast=fast.Next.Next;
         if(slow==fast){
             flag=true;
             break;
         }
     }
     return flag;
        }
     void DeleteAtHead(){
        if(Head==null)
            return;
        Head=Head.Next;
     }
     void printData() {
        if (LoopDetect() == false) {
            Node last = Head;
            while (last != null) {
                System.out.println(last.Data);
                last = last.Next;
            }
        } else {
            System.out.println("there is a loop remove it");
        }
    }
    public static void main(String[] args) {
        CreateLinkedList obj = new CreateLinkedList();
        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(30);
        obj.insertAtTheEnd(40);
       // obj.insertAtTheEnd(5);
       // obj.insertAtTheBeg(40);
//
//        Node nodeAdr = obj.Head.Next.Next;
//        obj.intAtAnyPoint(nodeAdr, 25);
//
//        System.out.println(obj.len());
//        Node LoopCreate=obj.Head.Next.Next;
//        LoopCreate.Next=obj.Head.Next;
//
//        Boolean LoopDetect=obj.LoopDetect();
//        System.out.println(LoopDetect);
        obj.DeleteAtHead();
        obj.printData();
    }
}
