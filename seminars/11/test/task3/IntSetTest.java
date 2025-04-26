package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntSetTest {
    @Test
    public void testPut() {
        IntSet set = new IntSet();
        set.put(1);
        set.put(3);
        set.put(2);

        assertEquals(3, set.getSize());
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(0));
        assertFalse(set.contains(-1));
        assertFalse(set.contains(4));
        assertFalse(set.contains(5));
    }

    @Test
    public void testPutAndRemoveLast() {
        IntSet set = new IntSet();
        set.put(1);
        set.put(3);
        set.put(2);
        set.remove(2);

        assertEquals(2, set.getSize());
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(0));
        assertFalse(set.contains(-1));
        assertFalse(set.contains(4));
        assertFalse(set.contains(5));
    }

    @Test
    public void testPutAndRemoveFirst() {
        IntSet set = new IntSet();
        set.put(1);
        set.put(3);
        set.put(2);
        set.remove(1);

        assertEquals(2, set.getSize());
        assertFalse(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(0));
        assertFalse(set.contains(-1));
        assertFalse(set.contains(4));
        assertFalse(set.contains(5));
    }

    @Test
    public void testPutAndRemoveMultiple() {
        IntSet set = new IntSet();
        set.put(1);
        set.put(3);
        set.put(2);
        set.remove(2);
        set.remove(1);

        assertEquals(1, set.getSize());
        assertFalse(set.contains(1));
        assertFalse(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(0));
        assertFalse(set.contains(-1));
        assertFalse(set.contains(4));
        assertFalse(set.contains(5));
    }

    @Test
    public void testRemoveNonExisting() {
        IntSet set = new IntSet();
        set.put(1);
        set.put(3);
        set.put(2);
        set.remove(100);

        assertEquals(3, set.getSize());
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(0));
        assertFalse(set.contains(-1));
        assertFalse(set.contains(4));
        assertFalse(set.contains(5));
        assertFalse(set.contains(100));
    }

    @Test
    public void testPutDuplicates() {
        IntSet set = new IntSet();
        set.put(1);
        set.put(3);
        set.put(2);
        set.put(1);
        set.put(3);
        set.put(2);

        assertEquals(3, set.getSize());
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(0));
        assertFalse(set.contains(-1));
        assertFalse(set.contains(4));
        assertFalse(set.contains(5));
    }

    @Test
    public void testRemoveAll() {
        IntSet set = new IntSet();
        set.put(1);
        set.put(3);
        set.put(2);
        set.put(1);
        set.put(3);
        set.put(2);

        set.remove(1);
        set.remove(3);
        set.remove(2);

        assertEquals(0, set.getSize());
        assertFalse(set.contains(1));
        assertFalse(set.contains(2));
        assertFalse(set.contains(3));
        assertFalse(set.contains(0));
        assertFalse(set.contains(-1));
        assertFalse(set.contains(4));
        assertFalse(set.contains(5));
    }
}