package ADTs.ListADTS;
import java.util.LinkedList;
//hadassah //lab 5
public class GenericQueue<E> {
   private LinkedList<E> list = new LinkedList<>();

   public void enqueue(E e){
       list.addLast(e);
   }
   public E dequeue(){
       return list.removeFirst();
   }
   private int getSize(){
       return list.size();
   }
   @Override
    public String toString(){
       return "Queue: " + list.toString();
   }

}
