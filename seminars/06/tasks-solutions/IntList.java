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
        // Создаём массив, который вдвое больше текущего, и копируем в него значения старого
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public void removeLast() {
        remove(size - 1);
    }

    public void remove(int index) {
        // Не проверяем выход за границы списка (пока что у нас нет нормального способа сообщить об ошибке в этом случае)
        // Смещаем все элементы начиная с index+1 влево на один элемент
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        --size;
    }

    public int get(int index) {
        // Не проверяем выход за границы списка (пока что у нас нет нормального способа сообщить об ошибке в этом случае)
        return elements[index];
    }

    public int size() {
        return size;
    }
}
