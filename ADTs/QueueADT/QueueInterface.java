package ADTs.QueueADT;
//hadassah // lab 7
public interface QueueInterface <E>{
    int size();
    boolean isEmpty();
    void enqueue(E e)
            throws IllegalStateException;
    E first()
            throws MyQueueException;
    E dequeue()
            throws MyQueueException;
}
