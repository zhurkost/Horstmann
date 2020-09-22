/**
 * Объект класса Point является точкой на на координатной плоскости X, Y.
 */
public class Point {
    private double x;
    private double y;
    private double newX;
    private double newY;

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
        newX = this.x + x;
        newY = this.y + y;
        return new Point(newX, newY);
    }

    /**
     * создает новые точки, масштабированные относительно начала координатных осей X, Y
     *
     * @param coefficient действительное число, на которое масшатбируется плоскость
     * @return
     */
    public Point scale(double coefficient) {
        newX = this.x * coefficient;
        newY = this.y * coefficient;
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
}
