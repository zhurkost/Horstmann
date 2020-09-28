public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(Point topLeft, double width, double height) {
        super.startPoint = topLeft;
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return getClass().getName() +
                "[topLeft=" + super.startPoint +
                ",width=" + width +
                ",height=" + height + "]";
    }
}
