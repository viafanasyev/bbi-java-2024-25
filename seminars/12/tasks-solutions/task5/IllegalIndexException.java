package task5;

public class IllegalIndexException extends Exception {
    public IllegalIndexException(int index, int size) {
        super("Illegal index " + index + " for size " + size);
    }
}
