package ADTs.ListADTS;

import java.util.Collection;
//hadassah //lab 2
public class MyArrayList<E> implements MyList<E> { //concrete class
    public static final int INITIAL_CAPACITY = 10;
    private E[] data = (E[])( new Object[INITIAL_CAPACITY]);
    private int size = 0;

    public MyArrayList() {}
    public MyArrayList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);

        ensureCapacity();

        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public void clear() {
        data = (E[]) (new Object[INITIAL_CAPACITY]);
        size = 0;
    }

    @Override
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return i;  // Fix: return actual index
        return -1;
    }

    @Override
    public int lastIndex(E e) {
        for (int i = size - 1; i >= 0; i--)
            if (e.equals(data[i]))
                return i;  // Fix: return actual index
        return -1;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null;
        size--;
        return e;
    }

    @Override
    public E set(int index, E e) {  // Fix: parameter should be of type E
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }
//hadassah //lab 2
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1)
                result.append(", ");
        }
        return result.toString() + " ]";
    }

    public void trimToSize() {
        if (size != data.length) {
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements java.util.Iterator<E> {
        private int current = 0; //current index

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            if (current == 0)
                throw new IllegalStateException();
            MyArrayList.this.remove(--current);
        }
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        ensureCapacity();
        boolean modified = false;

        for (E element : c) {
            add(size, element); // Add elements to the end of the list
            modified = true;
        }

        return modified;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (!c.contains(data[i])) {
                remove(i);
                i--; // Adjust index after removal
                modified = true;
            }
        }
        return modified;
    }
    @Override
    public int size() {
        return size;
    }
}

