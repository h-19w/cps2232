package ADTs.QueueADT;

import java.util.PriorityQueue;
//hadassah //lab 9
public class PriorityQueueDemo {
    public static void main(String[]args){
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(5);
        pQueue.add(7);
        pQueue.add(9);
        pQueue.offer(11);

        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());

    }
}
