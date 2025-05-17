package task4;

public class IntQueue {
    private int[] elements;
    private int headIndex;
    private int tailIndex;

    public IntQueue() {
        elements = new int[2];
        headIndex = 0;
        tailIndex = 0;
    }

    public void enqueue(int value) {
        if (size() + 1 == elements.length) {
            enlarge();
        }
        elements[tailIndex] = value;
        tailIndex = (tailIndex + 1) % elements.length;
    }

    private void enlarge() {
        int[] newElements = new int[elements.length * 2];
        for (int i = headIndex; i < elements.length; i++) {
            newElements[i - headIndex] = elements[i];
        }
        for (int i = 0; i < headIndex; i++) {
            newElements[elements.length + headIndex + i] = elements[i];
        }
        headIndex = 0;
        tailIndex = elements.length - 1;
        elements = newElements;
    }

    public int dequeue() {
        if (size() == 0) {
            throw new EmptyCollectionException("Queue is empty");
        }
        int result = elements[headIndex];
        headIndex = (headIndex + 1) % elements.length;
        return result;
    }

    public int front() {
        if (size() == 0) {
            throw new EmptyCollectionException("Queue is empty");
        }
        return elements[headIndex];
    }

    public int size() {
        if (headIndex <= tailIndex) {
            return tailIndex - headIndex;
        } else {
            return elements.length - (headIndex - tailIndex);
        }
    }
}
