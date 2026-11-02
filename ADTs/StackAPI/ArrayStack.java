package ADTs.StackAPI;

//hadassah //lab 3
 public class ArrayStack<E> implements StackInterface<E> { //concrete class
    public static final int CAPACITY = 100;
    private E[] data;
    private int t = -1;
    public ArrayStack(){
        this(CAPACITY);
    }
    public ArrayStack(int capacity){
        data = (E[])new Object[capacity];
    }
    public int size(){return (t+1);}
    public boolean isEmpty(){return (t==-1);}
    public void push(E e) throws StackisFullException {
        if (size() == data.length) throw new StackisFullException("Hadassah's stack is full");
        data [++t] = e;
    }
    public E top() throws StackisEmptyException {
        if(isEmpty()) throw new StackisEmptyException("Hadassah's stack is empty");
        return data[t];
    }
    public E pop() throws StackisEmptyException {
        if(isEmpty()) throw new StackisEmptyException("Hadassah's stack is empty");
        E answer = data[t];
        data[t] = null;   //helps garbage collection
        t--;
        return answer;
    }
}
