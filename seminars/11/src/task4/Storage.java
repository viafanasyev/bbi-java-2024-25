package task4;

import java.util.Arrays;

public class Storage {
    private Item[] items = new Item[1];
    private int size = 0;

    public void add(Item newItem) {
        enlargeIfNeeded();
        items[size] = newItem;
        ++size;
    }

    public int totalWeight() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getWeight();
        }
        return total;
    }

    public String[] names() {
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }

    public int size() {
        return size;
    }

    public void clear() {
        items = new Item[1];
        size = 0;
    }

    private void enlargeIfNeeded() {
        if (size >= items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }
    }
}
