public class _Rectangle {
    private int count;
    private UniqueID id = new UniqueID(9, "_rectangle: ",count);

    private Point x;
    private Point y;

    public _Rectangle(double x1, double y1, double x2, double y2) {
        x = new Point(x1, y1);
        y = new Point(x2, y2);
        count++;
    }

    public double getArea() {
        return (x.getX() + y.getX())*(x.getY() + y.getY());
    }
}
