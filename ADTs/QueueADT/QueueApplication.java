package ADTs.QueueADT;
//hadassah //lab 10
public class QueueApplication {
    public static void main(String[]args) throws MyQueueException {
        ArrayQueue<String> queue = new ArrayQueue<>(4);
        System.out.println("Is the queue empty: " + queue.isEmpty());
        System.out.println("adding 4 elements...");
        queue.enqueue("ken");
        queue.enqueue("kean");
        queue.enqueue("bob");
        queue.enqueue("ann");
        System.out.println("queue current size: " + queue.size());
        System.out.println("first string in the queue: " + queue.first());
        System.out.println("removing 4 elements...");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("queue current size: " + queue.size());
        System.out.println("adding 2 elements...");
        queue.enqueue("john");
        queue.enqueue("jane");
        System.out.println("queue current size: " + queue.size());
        System.out.println("removing 3 elements...");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); //lab 11
//        System.out.println("first string in the queue: " + queue.first());
    }
}
