package task4;

public class IllegalIndexException extends RuntimeException {
    public IllegalIndexException(int index, int size) {
        super("Illegal index " + index + " for size " + size);
    }
}
