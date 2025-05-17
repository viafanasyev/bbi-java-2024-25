package task4;

import java.util.Arrays;

public class IntList {
    private int[] elements;
    private int size;

    public IntList() {
        elements = new int[1];
        size = 0;
    }

    public void add(int value) {
        if (size == elements.length) {
            enlarge();
        }
        elements[size] = value;
        ++size;
    }

    private void enlarge() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public void removeLast() {
        remove(size - 1);
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalIndexException(index, size);
        }
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        --size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalIndexException(index, size);
        }
        return elements[index];
    }

    public int size() {
        return size;
    }
}
