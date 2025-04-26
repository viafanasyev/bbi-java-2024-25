package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorageTest {
    @Test
    public void testAdd() {
        Storage storage = new Storage();

        storage.add(new ItemStub("1", 1));
        storage.add(new ItemStub("2", 2));

        assertEquals(2, storage.size());
        assertEquals(3, storage.totalWeight());
        assertArrayEquals(new String[] { "1", "2" }, storage.names());
    }

    @Test
    public void testClearNonEmpty() {
        Storage storage = new Storage();

        storage.add(new EmptyItemStub());
        storage.add(new EmptyItemStub());

        storage.clear();

        assertEquals(0, storage.size());
        assertEquals(0, storage.totalWeight());
        assertArrayEquals(new String[0], storage.names());
    }

    @Test
    public void testClearEmpty() {
        Storage storage = new Storage();

        storage.clear();

        assertEquals(0, storage.size());
        assertEquals(0, storage.totalWeight());
        assertArrayEquals(new String[0], storage.names());
    }
}