package ADTs.ListADTS;

import java.util.Collection;
import java.util.Iterator;

//lab 9
public interface MyList<E> extends Collection<E> { //sub-interface extending a super-interface
    public void add(int index, E e);
    public E get(int index);
    public int indexOf(Object e);
    public int lastIndex(E e);
    public E remove(int index);
    public E set(int index, E e);
    @Override
    public default boolean add(E e){
        add(size(), e);
        return true;
        //adds element to the end of the list
    }
    @Override
    public default boolean isEmpty(){
        return size() == 0;
        //if the list doesnt contain any elements
    }
    @Override
    public default boolean remove(Object e){
        //removes first occurrence of e from the list [shifts elements left]
        // returns true if element is removed
        if(indexOf(e) >= 0 ) {
            remove(indexOf(e));
            return true;
        }else
            return false;
    }
    @Override
    public default boolean containsAll(Collection<?> c){
        for (Object element : c) {
            if (!this.contains(element)) {
                return false; // If even one element is not contained, return false
            }
        }
        return true;
    }
    @Override
    default boolean removeAll(Collection<?> c){
        boolean edited1 = false;
        for (Object element : c) {
            int index = indexOf(element);
            while (index >= 0) {
                remove(indexOf(element));
                edited1 = true;
                index = indexOf(element);
            }
        }
        return edited1;
    }
    default boolean retainALL(Collection<?> c){
        boolean edited2 = false;
       Iterator<E> it = this.iterator();

       while (it.hasNext()) {
           Object element= it.next();
           if (!c.contains(element)) {
               remove(indexOf(element));
               edited2 = true;
           }
       }
        return edited2;
    }
    @Override
    public default Object[] toArray(){
        Object[] array1 =  new Object[this.size()];
        int index = 0;
        for (Object element : this){
            array1[index++] = element;
        }
        return array1;
    }
    @Override
    public default <T> T[] toArray(T[] array){
        //exercise
        return null;
    }
}
