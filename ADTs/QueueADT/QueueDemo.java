package ADTs.QueueADT;

//hadassah // lab 6, 7, 8
public class QueueDemo {
    public static void main(String[]args){
        java.util.Queue<String> queue = new java.util.LinkedList<>();
        queue.offer("oklahoma");
        queue.offer("indiana");
        queue.offer("georgia");
        queue.offer("texas");


        while (queue.size()>0){ //lab 6
            System.out.print(queue.remove() +" ");
        }
//        while (queue.size()>0){ //lab 7
//            System.out.print(queue.poll() +" ");
//        }
//        while (queue.size()>0){ //lab 8
//            System.out.print(queue.element() +" "); //infinite loop - no end condition
//        }
    }
}
