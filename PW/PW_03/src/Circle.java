public class Circle extends Shape{
    private int count;
    private UniqueID id = new UniqueID(3, "circle: ",count);

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


}
