public class Line extends Shape {
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        super.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public String toString() {
        return getClass().getName() +
                "[startPoint=" + super.startPoint +
                ",endPoint=" + endPoint + "]";
    }
}
