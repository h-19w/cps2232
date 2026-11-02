package ADTs.QueueADT;
//hadassah  //lab 9 + QUIZ
public class ArrayQueue <E> implements QueueInterface<E> { //concrete class
    public static final int CAPACITY = 50;
    private E[] data;
    private int f = 0;
    private int sz = 0;
    public ArrayQueue(){
        this(CAPACITY);
    }
    public ArrayQueue(int capacity){
        data = (E[])new Object[capacity];
    }
    public int size(){return (sz);}
    public boolean isEmpty(){return (sz == 0);}
    public void enqueue(E e) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("Hadassah's queue is full");
        int avail = (f +sz)% data.length;
        data[avail] = e;
        sz++;
    } // hadassah // quiz ⬇︎
    public E first()throws MyQueueException{
        if(isEmpty()) throw new MyQueueException("Hadassah's queue is empty");
        return data[f];
    }
    public E dequeue() throws MyQueueException{
        if(isEmpty()) throw new MyQueueException("Hadassah's queue is empty");
        E answer = data[f];
        data[f] = null;
        f =(f+1) % data.length;
        sz--;
        return answer;
    }
}
