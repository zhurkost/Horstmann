//        5. Реализуйте неизменяемый класс P o in t , описывающий точку на плоскости.
//        Предоставьте его конструктор, чтобы задать конкретную точку; конструктор
//        без аргументов, чтобы задать точку в начале координат; а также методы g e t X (),
//        g e tY (), t r a n s l a t e ( ) и s c a l e ( ) . В частности, метод t r a n s l a t e () должен перемещать точку на определенное расстояние в направлении координат и у,
//        метод s c a le () — изменять масштаб по обеим координатам на заданный коэффициент. Реализуйте эти методы таким образом, чтобы они возвращали новые
//        точки в качестве результата. Например, в следующей строке кода:
//        Point р = new Point(3, 4).translate(1, 3).scale(0.5);
//        в переменной р должна быть установлена точка с координатами (2, 3,5).
//
//        6. Повторите предыдущее упражнение, но на этот раз сделайте методы t r a n s
//        la t e () и s c a le () модифицирующими.
public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        double x = p.getX();
        double y = p.getY();
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        Point p2 = new Point(3, 4);
        p2.translateMut(1, 3);
        p2.scaleMut(0.5);
        System.out.println("x2 = " + p2.getX());
        System.out.println("y2 = " + p2.getY());
        LabeledPoint p3 = new LabeledPoint("myPoint", 6, 6);
        System.out.println(p3);
        System.out.println(p);
        Circle myCircle = new Circle(p, 2);
        System.out.println(myCircle);
        Rectangle myRectangle = new Rectangle(p3, 6, 2);
        System.out.println(myRectangle);
        Line myLine = new Line(p2, p3);
        System.out.println(myLine);
    }
}
