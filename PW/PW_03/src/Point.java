public class Point {
    private int count;
    private UniqueID id = new UniqueID(9, "point: ",count);

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public double getX() {return x;}
    public double getY() {return y;}
}
