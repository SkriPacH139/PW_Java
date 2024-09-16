public class Rectangle extends Shape{
    private int count;
    private UniqueID id = new UniqueID(3, "rectangle: ",count);

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        count++;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
