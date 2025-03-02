import java.util.Arrays;

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
        // Создаём массив, который вдвое больше текущего, и копируем в него значения старого
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public int pop() {
        // Не проверяем выход за границы стека (пока что у нас нет нормального способа сообщить об ошибке в этом случае)
        int result = elements[size - 1];
        --size;
        return result;
    }

    public int top() {
        // Не проверяем выход за границы стека (пока что у нас нет нормального способа сообщить об ошибке в этом случае)
        return elements[size - 1];
    }

    public int size() {
        return size;
    }
}
