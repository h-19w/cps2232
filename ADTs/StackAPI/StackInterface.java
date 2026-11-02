package ADTs.StackAPI;

//hadassah //lab 1
public interface StackInterface <E>{ //interface
    public int size();
    public boolean isEmpty();
    public void push(E e)
            throws StackisFullException;
    public E top()   //throws an exception object
        throws StackisEmptyException;
    public E pop()
        throws StackisEmptyException;
}
