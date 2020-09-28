import java.util.Objects;

/**
 * Объект класса Point является точкой на на координатной плоскости X, Y.
 */
public class Point {
    protected double x;
    protected double y;

    /**
     * создает точку на координатной плоскости X, Y.
     *
     * @param x содержит координату x
     * @param y содержит координату y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * возвращает координату х
     *
     * @return координата х
     */
    public double getX() {
        return x;
    }

    /**
     * возвращает координату y
     *
     * @return координата y
     */
    public double getY() {
        return y;
    }

    /**
     * перемещает точку на заданное расстояние по оси x и y
     *
     * @param x расстояние по оси x, на которое перемещается точка
     * @param y расстояние по оси y, на которое перемещается точка
     * @return
     */
    public void translateMut(double x, double y) {
        this.x += x;
        this.y += y;
    }

    /**
     * создает новую точку, смещенную относительно предыдущей на заданное расстояние по оси x и y
     *
     * @param x расстояние по оси x, относительно предыдущей точки
     * @param y расстояние по оси y, относительно предыдущей точки
     * @return
     */
    public Point translate(double x, double y) {
        double newX = this.x + x;
        double newY = this.y + y;
        return new Point(newX, newY);
    }

    /**
     * создает новые точки, масштабированные относительно начала координатных осей X, Y
     *
     * @param coefficient действительное число, на которое масшатбируется плоскость
     * @return
     */
    public Point scale(double coefficient) {
        double newX = this.x * coefficient;
        double newY = this.y * coefficient;
        return new Point(newX, newY);
    }

    /**
     * масштабирует относительно начала координатных осей X, Y
     *
     * @param coefficient действительное число, на которое масшатбируется плоскость
     * @return
     */
    public void scaleMut(double coefficient) {
        this.x = this.x * coefficient;
        this.y = this.y * coefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return getClass().getName()
                + "[x=" + x + ",y=" + y +"]";
    }
}
