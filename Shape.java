public abstract class Shape {
    protected Point startPoint;

    public Shape(){}

    public void move(double x, double y) {
        startPoint.x += x;
        startPoint.y += y;
    }

    @Override
    public String toString() {
        return getClass().getName()+
                "[point=" + startPoint +
                "]";
    }
}
