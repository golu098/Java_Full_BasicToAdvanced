package LL;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class SingleLinkedListCode {
    Node head;

    SingleLinkedListCode(){
        this.head=null;
    }
    // inset node at beginning of LL
    public void insertAtBegining(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){

            temp=temp.next;
        }
        temp.next=newNode;
    }
    // insert at specify position
    public void insertAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            insertAtBegining(data);
        }
        Node temp=head;
//        while(position-)
        for(int i=1;i<position-1;i++){
            if(temp==null){
                System.out.println("Position out of bound");
               return;// to avoid NullPointer Exception
            }
            temp=temp.next;

        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // delete from starting of the list
    void deleteAtStart(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        // if there is only one node in list then
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        // reached till second last node bcz we have to delete last node
        while(temp.next.next!=null){
            temp=temp.next;
        }
        // remove last node
        temp.next=null;
    }
    void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==1){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp.next==null){
                System.out.println("List is empty");
                return;
            }
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Position out of bound");
            return;
        }
        temp.next=temp.next.next;

    }
    // print the Linked List (This code is similiar to insertAtEnd)
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }

    public static void main(String[] args) {
       SingleLinkedListCode obj=new SingleLinkedListCode();
        obj.insertAtBegining(12);
        obj.insertAtBegining(23);
        obj.insertAtEnd(123);
        obj.insertAtPosition(112,9);
        obj.deleteAtStart();
        obj.deleteAtEnd();
        obj.deleteAtPosition(1);
        obj.display();
    }
}
