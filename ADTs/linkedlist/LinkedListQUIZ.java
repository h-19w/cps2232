package ADTs.linkedlist;

import ADTs.linkedlist.Linkedlist;

// Quiz
public class LinkedListQUIZ {
    //hadassah
    public static void main(String[] args) {
        Linkedlist<String> list =  new Linkedlist<>();
        list.addNode("5");
        list.addNode("-8");
        list.addNode("2");
        list.addNode("1");
        list.addNode("8");
        list.addNode("6");
        list.display();

        list.addFirst("80");
        list.display();
    }
}
//next time create own methods
