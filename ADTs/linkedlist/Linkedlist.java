package ADTs.linkedlist;
//lab 8
public class Linkedlist<E> {
    class Node{
        String data;
        Node next;
        //hadassah
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(String data) {
        Node newnode = new Node(data);
        if(head == null) {
            head = newnode;
            tail = newnode;
        }
        else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Nodes of a singly linked list: ");
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println();
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }//lab8
}
