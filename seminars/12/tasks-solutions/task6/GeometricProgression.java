package task6;

public class GeometricProgression {
    private final double initial;
    private final double q;

    public GeometricProgression(double initial, double q) {
        if (initial == 0) {
            throw new IllegalArgumentException("'initial' is zero");
        }
        if (q == 0) {
            throw new IllegalArgumentException("'q' is zero");
        }
        this.initial = initial;
        this.q = q;
    }

    public double nth(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Non-positive n = " + n);
        }
        return initial * Math.pow(q, n - 1);
    }
}
