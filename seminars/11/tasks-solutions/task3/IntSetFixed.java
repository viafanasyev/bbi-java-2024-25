package task3;

import java.util.Arrays;

public class IntSetFixed {
    private int[] values = new int[1];
    private int size = 0;

    public void put(int newValue) {
        if (contains(newValue)) {
            return;
        }
        enlargeIfNeeded();
        values[size] = newValue;
        ++size;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; ++i) {
            if (values[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(int value) {
        boolean wasMet = false;
        for (int i = 0; i < size; ++i) {
            if (values[i] == value) {
                wasMet = true;
            }
            if (wasMet && i + 1 < size) {
                values[i] = values[i + 1];
            }
        }
        // ================================================================================
        // Ошибка: не было строк ниже. Размер оставался тем же при удалении элемента.
        if (wasMet) {
            --size;
        }
        // ================================================================================
    }

    public int getSize() {
        return size;
    }

    private void enlargeIfNeeded() {
        if (size >= values.length) {
            values = Arrays.copyOf(values, values.length * 2);
        }
    }
}
