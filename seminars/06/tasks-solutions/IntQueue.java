public class IntQueue {
    // Реализация очереди на циклическом буфере
    private int[] elements;
    private int headIndex; // Индекс первого элемента в очереди
    private int tailIndex; // Индекс после последнего элемента в очереди

    public IntQueue() {
        // elements хранит на один элемент больше, чем вмещается в очередь
        // Т.е. при очереди из 3 чисел elements будет иметь размер 4
        // Это нужно для того, чтобы отличать пустую очередь от полностью заполненной
        elements = new int[2];
        headIndex = 0;
        tailIndex = 0;
    }

    public void enqueue(int value) {
        // size() + 1, а не просто size(), т.к. в очереди есть один фиктивный элемент (см. выше)
        if (size() + 1 == elements.length) {
            enlarge();
        }
        elements[tailIndex] = value;
        tailIndex = (tailIndex + 1) % elements.length;
    }

    private void enlarge() {
        // Создаём массив, который вдвое больше текущего, и копируем в него значения старого
        int[] newElements = new int[elements.length * 2];
        for (int i = headIndex; i < elements.length; i++) { // Копируем отрезок [headIndex; length-1] в [0;...]
            newElements[i - headIndex] = elements[i];
        }
        for (int i = 0; i < headIndex; i++) { // Копируем отрезок [0; headIndex - 1] в [...; length-1]
            newElements[elements.length + headIndex + i] = elements[i];
        }
        headIndex = 0;
        tailIndex = elements.length - 1;
        elements = newElements;
    }

    public int dequeue() {
        // Не проверяем выход за границы очереди (пока что у нас нет нормального способа сообщить об ошибке в этом случае)
        int result = elements[headIndex];
        headIndex = (headIndex + 1) % elements.length;
        return result;
    }

    public int front() {
        // Не проверяем выход за границы очереди (пока что у нас нет нормального способа сообщить об ошибке в этом случае)
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
