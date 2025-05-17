package task5;

import java.util.Arrays;

// Добавились `throws` в соответствующих методах
public class IntStack {
    private int[] elements;
    private int size;

    public IntStack() {
        elements = new int[1];
        size = 0;
    }

    public void push(int value) {
        if (size == elements.length) {
            enlarge();
        }
        elements[size] = value;
        ++size;
    }

    private void enlarge() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public int pop() throws EmptyCollectionException {
        if (size() == 0) {
            throw new EmptyCollectionException("Stack is empty");
        }
        int result = elements[size - 1];
        --size;
        return result;
    }

    public int top() throws EmptyCollectionException {
        if (size() == 0) {
            throw new EmptyCollectionException("Stack is empty");
        }
        return elements[size - 1];
    }

    public int size() {
        return size;
    }
}
