public class Circle extends Shape {
    double radius;

    public Circle(Point center, double radius) {
        super.startPoint = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "[center=" + startPoint +
                "radius=" + radius + "]";
    }

}
