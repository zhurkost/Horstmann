/*4. Напишите программу, выводящую наименьшее и наибольшее положительные значения типа double.
        Подсказка: воспользуйтесь методом Math.nextUp ()
        из прикладного программного интерфейса Java API.*/
public class DoublePositiveLimits {
    public static void main(String[] args) {
        final double doubleZero = 0.0;
        double minimumPositive = Math.nextUp(doubleZero);
        System.out.println("Минимальное положительное значение Double: " + minimumPositive);
        System.out.println("Максимальное положительное значение Double: " + Double.MAX_VALUE);
    }
}
