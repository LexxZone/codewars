package job4j;

import java.util.Iterator;

public class SimpleArray<T> implements Iterable<T> {



    private T[] array;

    private int arraySize;

    public SimpleArray(T[] array) {
        this.array = array;
        this.arraySize = array.length;
    }

    public void add(T model) {
        boolean isFull = false;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] != null) {
                array[i] = model;
                isFull = false;
            } else {
                isFull = true;
            }
        }
        if (isFull) {
            System.out.println("Нельзя добавить новый элемент. Массив заполнен полностью.");
        }
    }

    public void set(int index, T model) {}

    public void delete(int index) {}

    public void get(int index) {}

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < arraySize && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

}
