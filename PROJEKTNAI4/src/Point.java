import java.util.Vector;

public class Point {
    Vector<Double> values;
    int groupNumber;

    public Point(Vector<Double> doubleVector, int k) {
        this.values = doubleVector;
        this.groupNumber = randomGroup(k);
    }

    private int randomGroup(int k) {
        return (int) (Math.random() * (k) + 1);
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String toString() {
        return values.toString();
    }
}