/*3.Напишите программу, вводящую три целочисленных значения и выводящую
        самое большое из них, используя только условную операцию. Сделайте то же
        самое с помощью метода M a t h .ш ах ().*/

import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 3 целочисленных значения:");
        System.out.print("firstNubmer = ");
        int firstNubmer = input.nextInt();
        System.out.print("secondNubmer= ");
        int secondNubmer = input.nextInt();
        System.out.print("thirdNubmer= ");
        int thirdNubmer = input.nextInt();
        int maximumValue;
        if (firstNubmer >= secondNubmer && firstNubmer >= thirdNubmer) {
            maximumValue = firstNubmer;
        } else if (secondNubmer >= thirdNubmer) {
            maximumValue = secondNubmer;
        } else {
            maximumValue = thirdNubmer;
        }
        System.out.println("Максимальное значение: " + maximumValue);

        int firstPairMaximum = Math.max(firstNubmer, secondNubmer);
        int secondPairMaximum = Math.max(firstNubmer, thirdNubmer);
        int maximumValueWithMath = Math.max(firstPairMaximum, secondPairMaximum);
        System.out.println("Максимальное значение c Math.max: " + maximumValueWithMath);
    }
}
