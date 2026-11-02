package ADTs.linkedlist;

//hadassah
//lab 9
public class LinkedListDemo {
    public static void main(String[] args) {
        Linkedlist<String> list =  new Linkedlist<>();
        list.addNode("Ken");
        list.addNode("Kean");
        list.addNode("Bob");
        list.addNode("Hadassah");
        list.display();
    }
}
