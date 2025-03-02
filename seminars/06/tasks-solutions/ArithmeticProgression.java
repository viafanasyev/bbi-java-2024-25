public class ArithmeticProgression {
    private int current;
    private final int step;

    public ArithmeticProgression(int init, int step) {
        this.current = init;
        this.step = step;
    }

    public int next() {
        int result = current;
        current += step;
        return result;
    }
}
